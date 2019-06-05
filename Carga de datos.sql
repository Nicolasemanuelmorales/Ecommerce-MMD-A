drop Database if exists `db`;
create Database `db`;

Use `db`;

/* Usuario */

insert Usuario(email,password,rol)
Value('asd@asd.com','asd','1');

/* Color */

insert Color(Id,nombre)
Value(1,'Blanco');

insert Color(Id,nombre)
Value(2,'Negro');

insert Color(Id,nombre)
Value(3,'Gris');


/* Talle */

insert Talle(Id,nombre)
Value(1,'S');

insert Talle(Id,nombre)
Value(2,'M');

insert Talle(Id,nombre)
Value(3,'L');

/* Material */

insert Material(Id,nombre)
Value(1,'Algodon');

insert Material(Id,nombre)
Value(2,'Cuero');

insert Material(Id,nombre)
Value(3,'Seda');



/*select * from usuario;

delete  from usuario where id=1;
