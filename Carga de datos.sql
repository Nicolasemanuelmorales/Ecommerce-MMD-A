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


/* Talle */

insert into Talle(Id,nombre)
Value(1,'S');

insert into Talle(Id,nombre)
Value(2,'M');

insert into Talle(Id,nombre)
Value(3,'L');

/* Material */

insert into Material(Id,nombre)
Value(1,'Algodon');

insert into Material(Id,nombre)
Value(2,'Cuero');

insert into Material(Id,nombre)
Value(3,'Seda');

/* Tipo */

insert into Tipo(Id,nombre)
Value(1,'Remera');

insert into Tipo(Id,nombre)
Value(2,'Pantalon');

insert into Tipo(Id,nombre)
Value(3,'Buzo');


/* Producto */

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(1,'URL IMAGEN','AB SUPP POLO',450.00,1,1,1,1);

insert into Producto(Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(2,'URL IMAGEN','AB SUPP dsssa',350.00,2,2,2,2);

insert into Producto(Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(3,'URL IMAGEN','AB SUPP asd',270.00,3,3,3,3);


/*
select * from producto;

delete  from usuario where id=1;
