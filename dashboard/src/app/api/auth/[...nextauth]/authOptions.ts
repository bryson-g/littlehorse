import { AuthOptions } from 'next-auth'
import { Provider } from 'next-auth/providers/index'
import KeycloakProvider from 'next-auth/providers/keycloak'
import { signOut } from 'next-auth/react'

const providers: Provider[] = []

if (
  process.env.LHD_OAUTH_CLIENT_ID &&
  process.env.LHD_OAUTH_CLIENT_ID !== '' &&
  process.env.LHD_OAUTH_CLIENT_SECRET &&
  process.env.LHD_OAUTH_CLIENT_SECRET !== ''
) {
  providers.push(
    KeycloakProvider({
      clientId: process.env.LHD_OAUTH_CLIENT_ID,
      clientSecret: process.env.LHD_OAUTH_CLIENT_SECRET,
      issuer: process.env.LHD_OAUTH_ISSUER_URI,
    })
  )
}

export const authOptions: AuthOptions = {
  providers,
  callbacks: {
    async redirect({ baseUrl }) {
      return process.env.LHD_OAUTH_CALLBACK_URL || baseUrl; // Use custom callback URL or fallback to base URL
    },
    jwt: async ({ token, account }) => {
      if (account) {
        return {
          ...token,
          accessToken: account.access_token,
          expiresAt: account.expires_at,
        }
      }
      return token
    },

    session: async ({ token, session }) => {
      return {
        ...session,
        accessToken: token.accessToken,
      }
    },
  },
  secret: process.env.LHD_OAUTH_ENCRYPT_SECRET,
}
