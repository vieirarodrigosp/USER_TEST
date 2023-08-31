CREATE TABLE IF NOT EXISTS userdb.user (
    user_id int NOT NULL AUTO_INCREMENT,
    cpf VARCHAR(11) NOT NULL,
    status boolean NOT NULL,
    PRIMARY KEY (user_id),
    CONSTRAINT tb_uq UNIQUE (cpf)
    ) ENGINE=INNODB;

INSERT INTO userdb.user(cpf, status) VALUES ('60732627010', true);
INSERT INTO userdb.user(cpf, status) VALUES ('40399332065', false);
INSERT INTO userdb.user(cpf, status) VALUES ('15050620040', true);