CREATE TABLE click_count(
    id SERIAL PRIMARY KEY,
    count INTEGER NOT NULL
);

INSERT INTO click_count (id, count) VALUES (1, 0);