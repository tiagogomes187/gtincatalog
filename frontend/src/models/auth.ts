export type RoleEnum = "ROLE_ADMIN" | "ROLE_OPERATOR" | "ROLE_CLIENT";

export type CredentialsDTO = {
  username: string;
  password: string;
};

export type AccessTokenPayloadDTO = {
  exp: number;
  user_name: string;
  email: string;
  firstName: string;
  authorities: RoleEnum[];
};
