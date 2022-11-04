create table Usuarios (
	usuario varchar(50),
	password varchar(50),
	admin boolean,
    nombre varchar(50),
    fechaNacimiento date,
    genero varchar(50),
	
constraint PK_Categoria Primary key (usuario)
);

insert into Usuarios values ('Gonzalez','Antonio',true,'Antonio Gonzalez Luque','2003-01-01','Masculino');