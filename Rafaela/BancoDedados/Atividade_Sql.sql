insert into funcionario
(nome,atividade,id,id_cozinha)
values('Gabriel','chefe de cozinha',01,02);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Junior','Auxiliar',02,01);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Marcors','chefe de cozinha',03,02);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Jorge','Auxiliar',04,04);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Bia','chefe de cozinha',05,03);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Marcela','chefe de cozinha',06,01);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Gabrielle','Atendente',07,02);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Gilson','Atendente',08,04);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Matheus','Atendente',09,03);
insert into funcionario
(nome,atividade,id,id_cozinha)
values('Wender','Atendente',09,03);

insert into ingrediente 
(name,data_validade)
values('Arroz', 10/10/2021);
insert into ingrediente 
(name,data_validade)
values('Macarrão', 30/01/2023);
insert into ingrediente 
(name,data_validade)
values('Champignon', 08/05/2021);
insert into ingrediente 
(name,data_validade)
values('Feijão', 12/03/2022);
insert into ingrediente 
(name,data_validade)
values('Carne', 03/05/2021);
insert into ingrediente 
(name,data_validade)
values('Brócolis', 12/04/2021);
insert into ingrediente 
(name,data_validade)
values('molho', 12/04/2021);
insert into ingrediente
(name,data_validade)
values ('Carne de porco',05/05/2021);
insert into cozinha
(nome,horaAbertura,horaFechar,pratoPrincipal)
values('Tailandesa',15,22,'Pad Thai');
DELETE FROM ingrediente WHERE name = 'arroz';
ALTER TABLE ingrediente DROP COLUMN ingrediente;
SET SQL_SAFE_UPDATES = 0;

select *from cozinha
where horaFechar = 22;
select *from ingrediente
where data_validade < 02/04/2021;
select * from ingrediente;
select * from cozinha;
select * from funcionario

  