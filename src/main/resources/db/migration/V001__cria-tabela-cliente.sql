create table cliente (
    id          bigint          not null AUTO_INCREMENT,
    nome        VARCHAR(60)     not null,
    email       VARCHAR(255)    not null,
    telefone    VARCHAR(20)     not null,

    primary key(id)
);