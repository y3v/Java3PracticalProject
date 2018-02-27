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

/* Select all languages for an experience */
SELECT iso_code as isoCode, language_name
    FROM language lang
    JOIN experience_language exlang ON exlang.language_code = lang.iso_code
    JOIN experience ex ON ex.id = exlang.experience_id AND ex.id = 1;
    
/* Select all programming languages for an experience */
SELECT plang.id, programming_language as programmingLanguage
    FROM programming_language plang
    JOIN experience_programming_language explang ON explang.programming_language_id = plang.id
    JOIN experience ex ON ex.id = explang.experience_id AND ex.id = 1;
    
/* Select all fields for an experience */
SELECT f.id, field
    FROM field f
    JOIN experience_field exf ON exf.field_id = f.id
    JOIN experience ex ON ex.id = exf.experience_id AND ex.id = 1;
    
use javaiii;
SELECT 
	plang.id, programming_language
FROM 
	programming_language plang
JOIN 
	experience_programming_language explang 
	ON 
		explang.programming_language_id = plang.id
JOIN 
	experience ex 
	ON 
		ex.id = explang.experience_id 
	AND 
		ex.id = 3;