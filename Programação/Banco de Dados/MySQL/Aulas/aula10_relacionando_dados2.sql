-- Aula 10: Relacionando Dados Entre Várias Tabelas
-- Aprendi:
-- - Como relacionar dados de muitos-para-muitos
-- - Como juntar várias tabelas com INNER JOIN

CREATE TABLE gafanhoto_assiste_curso (
id INT NOT NULL AUTO_INCREMENT,
data DATE,
idgafanhoto INT,
idcurso INT,
PRIMARY KEY (id),
FOREIGN KEY (idgafanhoto) REFERENCES gafanhotos(id),
FOREIGN KEY (idcurso) REFERENCES cursos(idcurso)
) DEFAULT CHARSET utf8mb4;

INSERT INTO gafanhoto_assiste_curso VALUES
(DEFAULT, '2014-03-01', '1', '2');

SELECT * FROM gafanhoto_assiste_curso;

SELECT g.nome, c.nome FROM gafanhotos AS g
JOIN gafanhoto_assiste_curso AS a
ON g.id = a.idgafanhoto

JOIN cursos AS c
ON a.idcurso = c.idcurso
ORDER BY g.nome;