CREATE TABLE IF NOT EXISTS orders (
    id BIGINT,
    placed_at TIMESTAMP,
    name VARCHAR(100),
    street VARCHAR(100),
    city VARCHAR(100),
    state VARCHAR(100),
    zip VARCHAR(100),
    cc_number VARCHAR(100),
    cc_expiration VARCHAR(100),
    cc_cvv VARCHAR(100),
    user_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id));