CREATE TABLE Alumnos(
    Codigo INTEGER,
    Apellidos VARCHAR2(100),
    Nombres VARCHAR2(100),
    DNI VARCHAR2(10),
    Direccion VARCHAR2(100)    
);

/*MÉTODO PARA INSERTAR*/
INSERT ALL
INTO Alumnos(Codigo, Apellidos, Nombres, DNI, Direccion) VALUES (1,'Solorzano','Pamelo','485784598','Calle Central 1556')
INTO Alumnos(Codigo, Apellidos, Nombres, DNI, Direccion) VALUES (1,'Rodriguez','Raul','480084598','Calle Las Begonias 1000')
SELECT 1 FROM DUAL;

COMMIT;

UPDATE Alumnos set Codigo=2 WHERE Apellidos='Rodriguez';

select * from Alumnos order by codigo;


/*CREAR UN STORE PROCEDURE*/
create or replace procedure sp_insertar_alumnos(codigo in INTEGER, apellidos in VARCHAR2, nombres in VARCHAR2, dni in VARCHAR2, direccion in VARCHAR2)
as
begin
insert into Alumnos values (codigo, apellidos, nombres, dni, direccion);
end;

/*PROBAR UN STOREPROCEDURE*/
BEGIN sp_insertar_alumnos(3,'Moncada','Walter','43424717','Calle 123');
END;
