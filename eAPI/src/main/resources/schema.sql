CREATE TABLE "myUser" (
                          "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                          "username" VARCHAR(255) UNIQUE,
                          "email" VARCHAR(255),
                          "image" BYTEA,
                          "password" VARCHAR(255),
                          "role" VARCHAR(255)
);
