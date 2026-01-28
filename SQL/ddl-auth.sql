-- Или просто выделите и нажмите F5 (зависит от расширения)

-- нужно один раз на базу (расширение)
CREATE EXTENSION IF NOT EXISTS citext;

-- schema
CREATE SCHEMA IF NOT EXISTS schema_auth;

-- roles
CREATE TABLE IF NOT EXISTS schema_auth.roles (
    id_role integer GENERATED ALWAYS AS IDENTITY (INCREMENT BY 1) PRIMARY KEY,
    code    text NOT NULL, -- name for backend
    name    text NOT NULL  -- readable, for UI
);

-- users
CREATE TABLE IF NOT EXISTS schema_auth.users (
    id_user            integer GENERATED ALWAYS AS IDENTITY (INCREMENT BY 1) PRIMARY KEY,
    display_name       text NOT NULL,
    email              citext NOT NULL,
    preferred_locale   char(2) NOT NULL,
    role_id            integer NOT NULL,
    password_hash      text,
    EmailVerifiedAt    timestamptz,
    last_login_at      timestamptz,

    CONSTRAINT ux_users_email UNIQUE (email),

    -- 2 буквы (ISO 639-1), в нижнем регистре
    CONSTRAINT chk_users_preferred_locale
        CHECK (preferred_locale ~ '^[a-z]{2}$'),

    CONSTRAINT fk_users_roles
        FOREIGN KEY (role_id)
        REFERENCES schema_auth.roles (id_role)
);

CREATE TABLE IF NOT EXISTS schema_auth.roless (
    id_role integer GENERATED ALWAYS AS IDENTITY (INCREMENT BY 1) PRIMARY KEY,
    code    text NOT NULL, -- name for backend
    name    text NOT NULL  -- readable, for UI
);
DROP TABLE IF EXISTS schema_auth.roless;