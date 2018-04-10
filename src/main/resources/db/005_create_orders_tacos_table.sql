CREATE TABLE IF NOT EXISTS orders_tacos (
    order_id BIGINT,
    taco_id BIGINT,
    FOREIGN KEY (order_id)
        REFERENCES orders(id),
    FOREIGN KEY (taco_id)
        REFERENCES tacos(id),
    PRIMARY KEY (order_id, taco_id));