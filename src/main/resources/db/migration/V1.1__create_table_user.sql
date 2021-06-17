CREATE TABLE barbershop."user" (
	email VARCHAR (50) PRIMARY KEY,
	"name" VARCHAR (50) NOT NULL,
	surname VARCHAR (50),
	"password" VARCHAR ( 50 ) NOT NULL,
	created_at TIMESTAMP NOT NULL,
    modified_at TIMESTAMP
);