INSERT INTO desafio.usuarios (username, pass, create_at, user_status) VALUES ('damian', '1234', NOW(), true);
INSERT INTO desafio.usuarios (username, pass, create_at, user_status) VALUES ('pedro', '1234', NOW(), false);

INSERT INTO desafio.niveles (nivel) VALUE ('Read');
INSERT INTO desafio.niveles (nivel) VALUE ('Write');
INSERT INTO desafio.niveles (nivel) VALUE ('Admin');
INSERT INTO desafio.niveles (nivel) VALUE ('Owner');

INSERT INTO desafio.grupos (grupo, descripcion) VALUES ('Grupo A', 'Descripcion Grupo A');
INSERT INTO desafio.grupos (grupo, descripcion) VALUES ('Grupo B', 'Descripcion Grupo B');
INSERT INTO desafio.grupos (grupo, descripcion) VALUES ('Grupo C', 'Descripcion Grupo C');
INSERT INTO desafio.grupos (grupo, descripcion) VALUES ('Grupo D', 'Descripcion Grupo D');

INSERT INTO desafio.seguridad (user_id, lvl_id, group_id) VALUES ('1', '1', '3');
INSERT INTO desafio.seguridad (user_id, lvl_id, group_id) VALUES ('2', '2', '2');
