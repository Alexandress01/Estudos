-- Aula 06: Obtendo Dados do Banco (SELECT)
-- Aprendi:
-- - Como selecionar e obter dados com SELECT
-- - Como filtrar os dados com WHERE e ORDER BY
-- - Como obter faixas de dados com BETWEEN e IN
-- - O que é Data Query Language

SELECT nome, carga, ano FROM cursos
ORDER BY ano, nome;

SELECT * FROM cursos
WHERE ano = 2016
ORDER BY nome;

SELECT nome, descricao, ano FROM cursos
WHERE ano <= 2015
ORDER BY ano, nome;

SELECT nome, ano FROM cursos
WHERE ano BETWEEN 2014 AND 2016
ORDER BY ano, nome;

SELECT nome, descricao, ano FROM cursos
WHERE ano IN (2014, 2016)
ORDER BY ano;

SELECT nome, carga, totaulas FROM cursos
WHERE carga > 35 AND totaulas < 30;

SELECT nome, carga, totaulas FROM cursos
WHERE carga > 35 OR totaulas < 30;