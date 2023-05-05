USE adlister_db;

CREATE TABLE IF NOT EXISTS users
(
    id       int unsigned auto_increment not null primary key,
    username varchar(50)                 not null,
    email    varchar(50)                 not null,
    password varchar(20)                 not null
);

CREATE TABLE IF NOT EXISTS ads
(
    id          int unsigned auto_increment not null primary key,
    user_id     int unsigned                not null,
    title       text                        not null,
    description text                        not null,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id)
);