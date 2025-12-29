-- Aula 08: Obtendo Dados do Banco (SELECT Parte 3)
-- Aprendi:
-- - Como agrupar elementos com GROUP BY
-- - Como filtrar agrupamentos com HAVING

SELECT totaulas, COUNT(*) FROM cursos
GROUP BY totaulas
ORDER BY totaulas;

SELECT carga, COUNT(*) FROM cursos WHERE totaulas = 30
GROUP BY carga;

SELECT ano, COUNT(*) FROM cursos
GROUP BY ano
HAVING COUNT(ano) >= 3
ORDER BY COUNT(*) DESC;

SELECT AVG(carga) FROM cursos;

SELECT carga, COUNT(*) FROM cursos
WHERE ano > 2022
GROUP BY carga
HAVING carga > (SELECT AVG(carga) FROM cursos);