-- if else statement
SET SERVEROUTPUT ON
SET VERIFY OFF
DECLARE
    age NUMBER(10) := &age;
BEGIN
    IF age < 0 then
     DBMS_OUTPUT.PUT_LINE('invalid age');
    ELSIF age < 18 THEN
    DBMS_OUTPUT.PUT_LINE('Your age does not meet the requirement');
    ELSE
    DBMS_OUTPUT.PUT_LINE('you may proceed');
    END IF;
END;
/

--switch case expression
SET VERIFY OFF
DECLARE
grade CHAR(1) := UPPER('&grade');
remarks VARCHAR2(255);
BEGIN
    remarks := 
        CASE grade
        WHEN 'A' THEN 'Excellent'  
        WHEN 'B' THEN 'Very Good'
        WHEN 'C' THEN 'Good'
        ELSE 'Error ' || grade || ' Does not exist ' 
        END;
        DBMS_OUTPUT.PUT_LINE('Grade ' || grade);
        DBMS_OUTPUT.PUT_LINE('Remarks ' ||remarks);
END;
/

--searched case expression
SET VERIFY OFF
DECLARE
grade CHAR(2) := UPPER('&grade');
remarks VARCHAR2(255);
BEGIN
    remarks := 
        CASE 
        WHEN grade = 'A' THEN 'Exellent'
        WHEN grade IN ('B', 'B+', 'B-') THEN 'Good'
        Else 'No grade exist' || grade
        END;
        DBMS_OUTPUT.PUT_LINE('Grade ' || grade);
        DBMS_OUTPUT.PUT_LINE('Remarks ' ||remarks);
END;
/

--Case SQL statement
SET VERIFY OFF
DECLARE
deptid NUMBER;
deptname VARCHAR2(20);
emps NUMBER;
mngid NUMBER := 108;
BEGIN
    CASE mngid
    WHEN 108 THEN
    SELECT department_id, department_name 
    INTO deptid, deptname 
    FROM hr.departments
    WHERE manager_id = 108;
    SELECT count (*)
    INTO emps
    FROM hr.employees
    WHERE department_id = deptid;
    ELSE DBMS_OUTPUT.PUT_LINE('invalid manager id');
    END CASE;
        DBMS_OUTPUT.PUT_LINE('Department_id '|| deptid);
        DBMS_OUTPUT.PUT_LINE('Department_name '|| deptname );
        DBMS_OUTPUT.PUT_LINE('Employees '|| emps );
END;
/
-- case expression returns a value
-- case statements performs a action

-- basic loops
DECLARE
    answer VARCHAR2;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('Hello World ');
        DBMS_OUTPUT.PUT_LINE('Do you want to print hello world? Y/N');
        answer := UPPER('&answer');
        EXIT WHEN answer = 'N';
    END LOOP;
END;
/

--basic loops 2
DECLARE
    ctr NUMBER(10) := 1;
    lmt NUMBER(10) := &lmt;
BEGIN 
    LOOP
    DBMS_OUTPUT.PUT_LINE(ctr || ' - Hello World');
    ctr := ctr + 1;
    EXIT WHEN ctr > lmt;
    END LOOP;
END;
/

--basic loop query 
DECLARE
    countryid locations.country_id%type := 'CA';
    loc_id locations.location_id%type;
    counter NUMBER(2) := 1;
    new_city locations.city%type := 'Pasig city ';
BEGIN 
    SELECT MAX(location_id)
    INTO loc_id
    FROM hr.locations
    WHERE country_id = countryid;
    
    LOOP 
        INSERT INTO hr.locations(location_id, city, country_id)
        VALUES ((loc_id + counter), new_city, countryid);
        counter := counter + 1 ;
        EXIT WHEN counter > 3;
    END LOOP;
    
END;
