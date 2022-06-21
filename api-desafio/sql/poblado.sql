-- Poblado de tablas
insert into usuarios (username, pass, create_at, user_status) values ('damian', '1234', NOW(), true);
insert into usuarios (username, pass, create_at, user_status) values ('pedro', '1234', NOW(), false);
insert into usuarios (username, pass, create_at, user_status) values ('silvia', '1234', NOW(), 1);
insert into usuarios (username, pass, create_at, user_status) values ('aldana', '1234', NOW(), 0);


insert into niveles (nivel) value ('Read');
insert into niveles (nivel) value ('Write');
insert into niveles (nivel) value ('Admin');
insert into niveles (nivel) value ('Owner');


insert into grupos (grupo, descripcion) values ('Grupo A', 'Descripcion Grupo A');
insert into grupos (grupo, descripcion) values ('Grupo B', 'Descripcion Grupo B');
insert into grupos (grupo, descripcion) values ('Grupo C', 'Descripcion Grupo C');
insert into grupos (grupo, descripcion) values ('Grupo D', 'Descripcion Grupo D');


insert into seguridad (user_id, lvl_id, group_id) values (2,4,4);
insert into seguridad (user_id, lvl_id, group_id) values (2,1,4);
insert into seguridad (user_id, lvl_id, group_id) values (1,1,1);
insert into seguridad (user_id, lvl_id, group_id) values (3,2,3);
insert into seguridad (user_id, lvl_id, group_id) values (4,3,1);
insert into seguridad (user_id, lvl_id, group_id) values (1,3,2);