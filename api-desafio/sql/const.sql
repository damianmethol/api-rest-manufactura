-- Constraints
alter table seguridad
    add constraint FK_seguridad_user_id
    foreign key(user_id)
    references usuarios(id);
    
alter table seguridad
    add constraint FK_seguridad_lvl_id
    foreign key(lvl_id)
    references niveles(id);
    
alter table seguridad
    add constraint FK_seguridad_group_id
    foreign key(group_id)
    references grupos(id);