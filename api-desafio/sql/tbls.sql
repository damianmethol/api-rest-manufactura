-- Creación de tablas
drop table if exists usuarios;
create table usuarios (
    id int auto_increment primary key,
    username varchar (10) unique not null,
    pass varchar (16) not null,
    create_at datetime,
    user_status boolean not null
);

drop table if exists niveles;
create table niveles (
    id int auto_increment primary key,
    nivel varchar(15) unique not null
);

drop table if exists grupos;
create table grupos (
    id int auto_increment primary key,
    grupo varchar (20) unique not null,
    descripcion tinytext not null
);

drop table if exists seguridad;
create table seguridad (
    id int auto_increment primary key,
    user_id int not null,
    lvl_id int not null,
    group_id int not null
    );