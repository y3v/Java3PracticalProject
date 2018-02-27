use javaiii;

/* language select for employee */
SELECT lang.iso_code as isoCode, lang.language_name as languageName
FROM 
	language lang
JOIN 
	employee_language emlang ON emlang.iso_code = lang.iso_code
JOIN 
	employee emp ON emp.id = emlang.employee_id AND emp.id = 1;


/* programming language select for employee */
SELECT prog.id, prog.programming_language as programmingLanguage
FROM 
	programming_language prog
JOIN 
	employee_programming_language emprog ON emprog.programming_language_id = prog.id
JOIN 
	employee emp ON emp.id = emprog.employee_id AND emp.id = 1;

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
        
        
        
SELECT * FROM programming_language;
SELECT * FROM language;