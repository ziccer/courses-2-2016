create Database IF NOT exists People; (создание БД People, если она еще не существует)

CREATE TABLE people.address 
(

id int not NULL auto_increment,

primary key(Id),

address varchar(100) NOT NULL
);
создание таблицы people c со столбцами Id и Address, установка первичного ключа столбцу Id

CREATE TABLE people.person 
(

id int not NULL auto_increment,

primary key(Id),

first_name varchar(100) NOT NULL,

last_name varchar(100) NOT NULL,

address_id int not null,

FOREIGN KEY (address_id) REFERENCES address (id)
);
Создание таблицы People со столбцами ID, Last_name, First_name, address_id и с внешним ключем address_id к таблице Address столбцу ID

insert INTO people.address (Address) VALUES ('Ap #999-6608 Felis, St.');
Вставляем данные в таблицу address


insert INTO people.person (first_name, last_name, address_id) VALUES ('Preston', 'Trujillo', 1);
Вставляем данные в таблицу person
