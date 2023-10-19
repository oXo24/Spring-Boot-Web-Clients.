
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE DATABASE demo_db;


-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад,
-- MySQL Workbench.


CREATE TABLE IF NOT EXISTS feedback
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	feedback (image, name, description)
VALUES
	('Susan.jpg', 'Susan Lopes', 'My tropical island tour was pure bliss - crystal-clear waters, lush forests, and vibrant culture. A dream come true!'),
	('Mike.jpg', 'Mike Johnson', 'A tropical island escape - paradise found in every sunset, coral reef, and friendly local. Unforgettable.'),
	('Margaret.jpg', 'Margaret Clint', 'Pristine beaches, vibrant marine life, and cultural richness - my island tour was a dream fulfilled!');


