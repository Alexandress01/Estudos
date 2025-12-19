-- Aula 05: Manipulando Linhas (UPDATE, DELETE e TRUNCATE)
-- Aprendi:
-- - Como modificar linhas da tabela com UPDATE
-- - Como deletar linhas com DELETE
-- - Como apagar todos os dados da tabela com TRUNCATE
-- - Como limitar o efeito do comando com LIMIT
-- - O que é o Safe Update Mode do MySQL Workbench

INSERT INTO cursos VALUES
('1', 'HTML4', 'Curso de HTML5', '40', '37', '2014'),
('2', 'Algoritmos', 'Lógica de Programação', '20', '15', '2014'),
('3', 'Photoshop', 'Dicas de Photoshop CC', '10', '8', '2014'),
('4', 'PGP', 'Curso de PHP para iniciantes', '40', '20', '2010'),
('5', 'Jarva', 'Introdução à Linguagem Java', '10', '29', '2000'),
('6', 'MySQL', 'Bancos de Dados MySQL', '30', '15', '2016'),
('7', 'Word', 'Curso completo de Word', '40', '30', '2016'),
('8', 'Sapateado', 'Danças Rítmicas', '40', '30', '2018'),
('9', 'Cozinha Árabe', 'Aprenda a fazer Kibe', '40', '30', '2018'),
('10', 'YouTuber', 'Gerar polêmica e ganhar inscritos', '5', '2', '2018');

SELECT * FROM cursos;

UPDATE cursos
SET nome = 'HTML5'
WHERE id_curso = '1';

UPDATE cursos
SET nome = 'PHP', ano = '2015'
WHERE id_curso = '4';

UPDATE cursos
SET nome = 'Java', carga = '40', ano = '2015'
WHERE id_curso = '5'
LIMIT 1;

UPDATE cursos
SET ano = '2018', carga = '0'
WHERE ano = '2050'
LIMIT 1;

DELETE FROM cursos
WHERE id_curso = '8';

DELETE FROM cursos
WHERE ano = '2050'
LIMIT 2;

TRUNCATE cursos;