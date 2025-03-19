CREATE DATABASE demo_db;

CREATE TABLE IF NOT EXISTS demo_db.contacts
( id INTEGER NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO demo_db.contacts (first_name, last_name, email) VALUES
('IVAN', 'some address', 'asda@gmail.com');
SELECT * FROM contacts