create database NodeJs;
CREATE TABLE funcionario (
    nome VARCHAR(30),
    atividade VARCHAR(20)
);
ALTER TABLE ingrediente DROP COLUMN ingrediente;
ALTER TABLE funcionario ADD id tinyint(10);
ALTER TABLE cozinha ADD id_funcionario tinyint(10);
ALTER TABLE funcionario ADD id_cozinha tinyint(10);
DELETE FROM table WHERE collumn = 'valor';
Update funcionario set id = 10 where nome = 'Wender';
SET SQL_SAFE_UPDATES = 0;
Insert into cozinha 
(nome, horaAbertura, horaFechar, pratoPrincipal,id) 
values ('Mineira',13,20,'Feijoada',02);

Insert into cozinha 
(nome, horaAbertura, horaFechar, pratoPrincipal,id) 
values ('Chinesa',10,22,'Yashioba',01);
delete from funcionario;
DELETE FROM cozinha
WHERE nome = 'repetido';

ALTER TABLE cozinha DROP COLUMN id_funcionario;

select * from users;
Insert into cozinha 
(nome, horaAbertura, horaFechar, pratoPrincipal,id) 
values ('Italiana',12,21,'Pizza',03);
Update funcionario set id = 01 where  nome = 'Gabriel';
select * from funcionario;
Insert into cozinha 
(nome, horaAbertura, horaFechar, pratoPrincipal,id) 
values ('Arabe',10,22,'Pão',04);

Select * from cozinha;

Select * from cozinha where horaAbertura = 10 
