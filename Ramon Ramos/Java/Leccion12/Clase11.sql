-- CRUD: create(insertar), read(leer), update(actualizar), delete
-- Listar los estudiantes
SELECT * FROM estudiantes2023;
-- Insertar estudiante
INSERT INTO estudiantes2023(nombre,apellido,telefono,email) VALUES ("Juan", "Perez", "2614545456", "jp@gmail.com");
-- Update
UPDATE estudiantes2023 SET nombre="Juan Carlos", apellido="Garcia" where idestudiantes2023=1;
-- Delete
DELETE FROM estudiantes2023 WHERE idestudiantes2023=2;
-- Para modificar el idestudiantes2023 y comience en 1
ALTER TABLE estudiantes2023 AUTO_INCREMENT = 1;