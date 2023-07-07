INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$tjaNxXSYRbBiAVeljkpRJ.gxo/mAsLEtA0Ah7OPyuEvLxfMEqwUdW');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$tjaNxXSYRbBiAVeljkpRJ.gxo/mAsLEtA0Ah7OPyuEvLxfMEqwUdW');
INSERT INTO tb_user (name, email, password) VALUES ('Tiago', 'tiago@gmail.com', '$2a$10$mibNnYT1.eldqYST4inyuegRHIlFYyCC0cN6rXCN5urtnzm4Bxs6G');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3,2);

INSERT INTO tb_product (name) VALUES ('TV');
INSERT INTO tb_product (name) VALUES ('Computer');