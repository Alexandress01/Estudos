-- Aula 04: Alterando a Estrutura da Tabela (ALTER TABLE e DROP TABLE)
-- Aprendi:
-- - Como adicionar um campo com ADD COLUMN
-- - Como modificar nome de campos com CHANGE COLUMN
-- - Como modificar definições com MODIFY COLUMN
-- - Como renomear campo com CHANGE COLUMN
-- - Como renomear tabela com RENAME TO
-- - Como apagar tabela com DROP TABLE

DESC gafanhotos;

ALTER TABLE pessoas
RENAME TO gafanhotos;

ALTER TABLE pessoas
ADD COLUMN profissao VARCHAR(10) AFTER nome;

ALTER TABLE pessoas
MODIFY COLUMN profissao VARCHAR(20) DEFAULT "";

ALTER TABLE pessoas
CHANGE COLUMN profissao prof VARCHAR(20);

ALTER TABLE pessoas
DROP COLUMN profissao;

SELECT * FROM pessoas;

CREATE TABLE IF NOT EXISTS cursos (
nome VARCHAR(30) NOT NULL UNIQUE,
descricao TEXT,
carga INT UNSIGNED,
total_aulas INT,
ano YEAR DEFAULT '2025'
) DEFAULT CHARSET = utf8;

ALTER TABLE cursos
ADD COLUMN id_curso INT FIRST;

ALTER TABLE cursos
ADD PRIMARY KEY (id_curso);

DESC cursos;

CREATE TABLE IF NOT EXISTS teste (
id INT,
nome VARCHAR(30),
idade INT
);

INSERT INTO teste
VALUES
('1', 'Pedro', '22'),
('2', 'Maria', '12'),
('3', 'Maricota', '77');

SELECT * FROM teste;

DROP TABLE IF EXISTS teste;