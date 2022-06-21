-- Consultas
-- Describir tabla seguridad
DESC seguridad;

-- Seleccionar id y nombre de usuario de la tabla usuarios
select id, username from usuarios order by id;

-- Seleccionar todo de la tabla niveles y ordenar registros por id
select * from niveles ORDER BY id;

-- Seleccionar todo de la tabla grupos y ordenar registros por id
select * from grupos ORDER BY id;

-- Seleccionar todo de la tabla seguridad
select * from seguridad;

-- Seleccionar, sin que se repitan, el id y nombre de usuario de la tabla seguridad y hacer un inner join en los campos id(tabla usuarios) y user_id(tabla seguridad)
select distinct u.id, u.username FROM seguridad s INNER JOIN usuarios u ON u.id=s.user_id order by id;

-- Seleccionar de la tabla seguridad: id y username de usuario; id y nombre de nivel; id, nombre y descripcion de grupo. Realiza un inner join con el id de los usuarios, de los niveles y de los grupos. Ordena por grupo.
select u.id, u.username, n.id as lvl_id, n.nivel, g.id as group_id, g.grupo, g.descripcion FROM seguridad s INNER JOIN usuarios u ON u.id=s.user_id INNER JOIN niveles n ON n.id=s.lvl_id INNER JOIN grupos g on g.id=s.group_id ORDER BY g.id;

-- Seleccionar de la tabla seguridad: id y username de usuario; nombre de nivel de acceso; nombre de grupo de seguridad. Realiza un inner join con el id de los usuarios, de los niveles de acceso y de los grupos de seguridad. Ordena por id de usuario.
select u.id AS id_user, u.username AS user_username, n.nivel AS access_level, g.grupo AS security_group FROM seguridad s INNER JOIN usuarios u ON u.id=s.user_id INNER JOIN niveles n ON n.id=s.lvl_id INNER JOIN grupos g ON g.id=s.group_id ORDER BY u.id;

-- Seleccionar de la tabla seguridad dado un nombre de usuario: id y username de usuario; nombre de nivel de acceso; nombre de grupo de seguridad. Realiza un inner join con el id de los usuarios, de los niveles de acceso y de los grupos de seguridad.
select u.id AS id_user, u.username AS user_username, n.nivel AS access_level, g.grupo AS security_group FROM seguridad s INNER JOIN usuarios u ON u.id=s.user_id INNER JOIN niveles n ON n.id=s.lvl_id INNER JOIN grupos g ON g.id=s.group_id WHERE u.username LIKE '%pedro%';

-- Selecciona de la tabla seguridad el username y nombre de grupo de un registro dado un nombre de usuario, realiza un inner join con las tablas usuarios y grupos.
select u.username AS user_alias, g.grupo AS security_group FROM seguridad s INNER JOIN usuarios u ON u.id=s.user_id INNER JOIN grupos g ON g.id=s.group_id WHERE u.username='silvia';