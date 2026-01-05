-- Aula 09: Relacionando Dados Entre Tabelas (Chaves Estrangeiras e JOIN)
-- Aprendi:
-- - Como criar uma chave estrangeira
-- - Como referenciar a chave em outra tabela
-- - Como juntar tabelas no SELECT com JOIN
-- - Como dar apelidos com AS
-- - O que é Foreign Key
-- - O que é INNER JOIN, LEFT JOIN E RIGHT JOIN

USE gafanhotos;
DESC gafanhotos;

ALTER TABLE gafanhotos
ADD COLUMN cursopreferido INT;

ALTER TABLE gafanhotos
ADD FOREIGN KEY (cursopreferido)
REFERENCES cursos(idcurso);

SELECT * FROM gafanhotos;
SELECT * FROM cursos;

UPDATE gafanhotos
SET cursopreferido = '6' WHERE id = '1';

SELECT nome, cursopreferido FROM gafanhotos;

SELECT nome, ano FROM cursos;

SELECT * FROM gafanhotos;

SELECT g.nome, c.nome, c.ano
FROM gafanhotos AS g LEFT JOIN cursos AS c
ON c.idcurso = g.cursopreferido
ORDER BY g.nome;