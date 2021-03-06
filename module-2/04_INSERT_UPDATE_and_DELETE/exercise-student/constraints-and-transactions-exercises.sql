-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT into actor (first_name, last_name) VALUES ('Hampton', 'Avenue');
INSERT into actor (first_name, last_name) VALUES ('Lisa', 'Byway');
        
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film
ORDER BY title

BEGIN TRANSACTION;

INSERT INTO film(title, description, release_year, language_id,length)
VALUES ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece','2008','1','198')

COMMIT;

ROLLBACK;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
BEGIN TRANSACTION

SELECT * FROM actor WHERE actor_id = 202;


INSERT INTO film_actor (actor_id, film_id) VALUES (201, 1001);
INSERT INTO film_actor (actor_id, film_id) VALUES (202, 1001);

select * from film_actor WHERE film_id = 1001;

ROLLBACK;

COMMIT;

-- 4. Add Mathmagical to the category table.
SELECT * FROM category

BEGIN TRANSACTION;

INSERT INTO category (name) VALUES ('Mathmagical')

COMMIT;

ROLLBACK;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT * FROM film_category
ORDER BY category_id DESC

BEGIN TRANSACTION;

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'Euclidean PI'),(SELECT category_id FROM category WHERE name = 'Mathmagical'))

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'EGG IGBY'),(SELECT category_id FROM category WHERE name = 'Mathmagical'))

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'KARATE MOON'),(SELECT category_id FROM category WHERE name = 'Mathmagical'))

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'RANDOM GO'),(SELECT category_id FROM category WHERE name = 'Mathmagical'))

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'YOUNG LANGUAGE'),(SELECT category_id FROM category WHERE name = 'Mathmagical'))

COMMIT;

ROLLBACK;


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
BEGIN TRANSACTION;

UPDATE film SET rating = 'G'
WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id =
(SELECT category_id FROM category WHERE name = 'Mathmagical'))

COMMIT;

ROLLBACK;
SELECT title, rating FROM film
WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id =
(SELECT category_id FROM category WHERE name = 'Mathmagical'))
-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN TRANSACTION;

INSERT INTO inventory(film_id,store_id)
VALUES((SELECT film_id FROM film WHERE title = 'Euclidean PI'),1)


INSERT INTO inventory(film_id,store_id)
VALUES((SELECT film_id FROM film WHERE title = 'Euclidean PI'),2)

COMMIT;

ROLLBACK;

SELECT * FROM inventory
ORDER BY film_id DESC

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
BEGIN TRANSACTION;

DELETE FROM film WHERE title = 'Euclidean PI'

COMMIT;

ROLLBACK;
-- the key exists on another table

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
BEGIN TRANSACTION;

DELETE FROM category WHERE name = 'Mathmagical'

COMMIT;

ROLLBACK;

--key on another table

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
BEGIN TRANSACTION;

DELETE FROM film_category WHERE category_id = 18

-- yes, its a primary key 
COMMIT;

ROLLBACK;

SELECT * FROM film_category
ORDER BY category_ID DESC


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <now that the key is gone it works>
BEGIN TRANSACTION;

DELETE FROM category WHERE name = 'Mathmagical'

DELETE FROM film WHERE title = 'Euclidean PI'

COMMIT;

ROLLBACK;

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--we would first have to delete the film reference from tables film_category and film_actor before deleting the film itself.  
 --The film_id is a primary key in these two tables.
