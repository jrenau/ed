create table categoria (
  id bigint primary key auto_increment,
  nombre varchar(50) unique
);

insert into categoria (nombre) values ('categoría 1');
insert into categoria (nombre) values ('categoría 2');
insert into categoria (nombre) values ('categoría 3');
