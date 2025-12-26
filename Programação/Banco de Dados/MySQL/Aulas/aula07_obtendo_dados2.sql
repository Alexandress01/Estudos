-- Aula 07: Obtendo Dados do Banco (SELECT Parte 2)
-- Aprendi:
-- - Como filtrar nomes com LIKE e NOT LIKE
-- - Como contar elementos com COUNT
-- - Como obter dados únicos com DISTINCT
-- - Como somar valores com SUM
-- - Como ter o máximo, mínimo e média de valores com MAX, MIN E AVG

SELECT * FROM gafanhotos
WHERE nome LIKE 'silva%';

SELECT COUNT(*) FROM cursos;

SELECT DISTINCT carga FROM cursos
ORDER BY carga;

SELECT SUM(totaulas) FROM cursos
WHERE ano = '2016';

SELECT AVG(totaulas) FROM cursos
WHERE ano = '2016';