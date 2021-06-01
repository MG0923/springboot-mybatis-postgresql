CREATE TABLE if not exists public.accounts (
	id int PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	createdon VARCHAR(50) NOT NULL
);