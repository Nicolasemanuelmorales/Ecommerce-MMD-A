drop Database if exists `db`;
create Database `db`;

Use `db`;

/* Usuario */

insert into Usuario(email,password,rol)
Value('asd@asd.com','asd','1');

/* Color */

insert into Color(Id,nombre)
Value(1,'Blanco');

insert into Color(Id,nombre)
Value(2,'Negro');

insert into Color(Id,nombre)
Value(3,'Gris');

insert into Color(Id,nombre)
Value(4,'Rojo');

insert into Color(Id,nombre)
Value(5,'Azul');

insert into Color(Id,nombre)
Value(6,'Amarillo');

insert into Color(Id,nombre)
Value(7,'Verde');

insert into Color(Id,nombre)
Value(8,'Rosa');

insert into Color(Id,nombre)
Value(9,'Celeste');



/* Talle */

insert into Talle(Id,nombre)
Value(1,'S');

insert into Talle(Id,nombre)
Value(2,'M');

insert into Talle(Id,nombre)
Value(3,'L');

insert into Talle(Id,nombre)
Value(4,'XL');


/* Material */

insert into Material(Id,nombre)
Value(1,'Algodon');

insert into Material(Id,nombre)
Value(2,'Cuero');

insert into Material(Id,nombre)
Value(4,'Cuerina');

insert into Material(Id,nombre)
Value(3,'Seda');

/* Tipo */

/*remeras*/

insert into Tipo(Id,nombre)
Value(1,'RemeraMangalarga');

insert into Tipo(Id,nombre)
Value(2,'RemeraMangacorta');

insert into Tipo(Id,nombre)
Value(3,'RemeraMusculosa');

/*pantalon*/

insert into Tipo(Id,nombre)
Value(4,'PantalonJean');

insert into Tipo(Id,nombre)
Value(5,'PantalonJoggin');

insert into Tipo(Id,nombre)
Value(6,'PantalonGabardina ');

/*bermudas*/

insert into Tipo(Id,nombre)
Value(7,'BermudaJean');

insert into Tipo(Id,nombre)
Value(8,'BermudaJoggin ');

insert into Tipo(Id,nombre)
Value(9,'BermudaGabardina');

/*Buzos*/

insert into Tipo(Id,nombre)
Value(10,'BuzoCanguro');

insert into Tipo(Id,nombre)
Value(11,'BuzoBasico');

insert into Tipo(Id,nombre)
Value(12,'BuzoElegante');

/*camisas*/

insert into Tipo(Id,nombre)
Value(13,'CamisaMangalarga');

insert into Tipo(Id,nombre)
Value(14,'CamisaMangacorta');

insert into Tipo(Id,nombre)
Value(15,'CamisaElegante');


/* Producto */

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(4,'/images/asd.jpeg','AB SUPP POLO',450.00,1,1,1,1);

insert into Producto(Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(2,'URL IMAGEN','AB SUPP dsssa',350.00,2,2,2,2);

insert into Producto(Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(3,'URL IMAGEN','AB SUPP asd',270.00,3,3,3,3);



select * from usuario;

delete  from usuario where id=1;
