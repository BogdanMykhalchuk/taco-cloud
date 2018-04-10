CREATE TABLE IF NOT EXISTS users (
    id BIGINT PRIMARY KEY,
    username VARCHAR(100),
    password VARCHAR(100),
    fullname VARCHAR(100),
    street VARCHAR(100),
    city VARCHAR(100),
    state VARCHAR(100),
    zip VARCHAR(100),
    phoneNumber VARCHAR(100)
);