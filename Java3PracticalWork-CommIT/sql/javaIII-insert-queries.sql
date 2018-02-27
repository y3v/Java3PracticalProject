use javaiii;

INSERT INTO employee (username, password, first_name, last_name, city, email, phone_number)
VALUES
	('paco', 'paco', 'paco', 'toto', 'Longueuil', 'paco@paco.com', '514-514-5144');
    
INSERT INTO	employer (company_name, username, password, contact_name, city, email, phone_number)
VALUES
	('PACO inc.', 'pacoinc', 'pacoinc', 'pacopaco', 'Montreal', 'paco@pacoinc.com', '555-555-5555');
    

INSERT INTO language (iso_code, language_name)
VALUES 
	('eng', 'English'),
	('fra', 'French'),
    ('spa', 'Spanish'),
    ('rus', 'Russian');
    
INSERT INTO programming_language (programming_language)
VALUES 
	('C++'), 
    ('C#'),
    ('Java'),
    ('JavaScript'),
    ('PHP'),
    ('HTML'),
    ('CSS'),
    ('Perl'),
    ('Ruby'),
    ('Cobol'),
    ('Pascal'),
    ('Python'),
    ('Objective-C'),
    ('SQL');

INSERT INTO field (field)
VALUES
	('Website'),
    ('Network'),
    ('Software'),
    ('Hardware'),
    ('Web design'),
    ('Electronics'),
    ('Security'),
    ('Telecommunication'),
    ('Animation'),
    ('Video Game');
    

INSERT INTO framework (framework, programming_language_id)
VALUES
	('Angular', 4),
    ('JQuery', 4),
    ('Vue.js', 4),
    ('JSF', 3),
    ('Entity', 2),
    ('React', 4),
    ('ASP.NET MVC', 2),
    ('Spring', 3);

use javaiii;
SELECT * FROM education;


-- EDU 1


-- EXP 1
INSERT INTO experience (employee_id, company, title, description, start_date, end_date)
VALUES (1, 'pacoInc', 'programmer', 'sl;dakfjas;dl', '2018-02-01', '2018-03-03');

INSERT INTO experience_language (experience_id, language_code)
VALUES (1, 'eng'), (1, 'spa');

INSERT INTO experience_programming_language (experience_id, programming_language_id)
VALUES (1, 1);

INSERT INTO experience_field (experience_id, field_id)
VALUES (1, 1);

-- EXP 2
INSERT INTO experience (employee_id, company, title, description, start_date, end_date)
VALUES (1, 'pacoInc2', 'programmer2', 'sl;dakfjas;dl', '2018-02-01', '2018-03-03');

INSERT INTO experience_language (experience_id, language_code)
VALUES (2, 'fra');

INSERT INTO experience_programming_language (experience_id, programming_language_id)
VALUES (2, 2);

INSERT INTO experience_field (experience_id, field_id)
VALUES (2, 2);



-- EXP 3
INSERT INTO experience (employee_id, company, title, description, start_date, end_date)
VALUES (1, 'pacoInc2', 'programmer2', 'sl;dakfjas;dl', '2018-02-01', '2018-03-03');

INSERT INTO experience_language (experience_id, language_code)
VALUES (3, 'rus'), (3, 'eng');

INSERT INTO experience_programming_language (experience_id, programming_language_id)
VALUES (3, 3);

INSERT INTO experience_field (experience_id, field_id)
VALUES (3, 3);


-- PROGLANG 1
INSERT INTO employee_programming_language (employee_id, programming_language_id)
VALUES (1, 2);

-- LANG 1
INSERT INTO employee_language (employee_id, iso_code)
VALUES (1, 'fra');
