-- Crear la base de datos
CREATE DATABASE dbclinica;

-- Usar la base de datos recién creada
USE dbclinica;

-- Crear la tabla Paciente
CREATE TABLE Paciente (
    idpaciente INT PRIMARY KEY AUTO_INCREMENT,
    nompaciente VARCHAR(255),
    apepaciente VARCHAR(255),
    docpaciente VARCHAR(20) UNIQUE,
    fechanacpaciente DATE,
    emailpaciente VARCHAR(255)
);

-- Insertar datos ficticios en la tabla Paciente
INSERT INTO Paciente (NomPaciente, ApePaciente, DocPaciente, FechaNacPaciente, EmailPaciente)
VALUES
    ('Juan', 'Pérez', '123456789', '1990-05-15', 'juan.perez@example.com'),
    ('María', 'Gómez', '987654321', '1985-09-20', 'maria.gomez@example.com');
