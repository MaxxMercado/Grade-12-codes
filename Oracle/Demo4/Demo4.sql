SELECT salary
FROM hr.employees
WHERE department_id = 90;

SET SERVEROUTPUT ON 
DECLARE
sum_sal NUMBER(10,2);
deptno NUMBER NOT NULL := 90;
BEGIN 
    SELECT SUM(salary)
    INTO sum_sal 
    FROM hr.employees
    WHERE department_id = deptno;
    DBMS_OUTPUT.PUT_LINE('Sum of salary = ' || sum_sal);
END;
/

--updating table
BEGIN
    INSERT INTO employees (employee_id, first_name, last_name, email,  hire_date, job_id, salary)
    VALUES(employees_seq.NEXTVAL, 'Ruth', 'Cores',  'RCORES',sysdate, 'AD_ASST', 4000);
END;
/

select* from employees;

--deleting from table 
DECLARE 
    deptno employees.employee_id%type := 209;
BEGIN
    DELETE FROM EMPLOYEES
    WHERE employee_id = deptno;
END;
/

VARIABLE rows_deleted VARCHAR2(30);
DECLARE
    empno employees.employee_id%TYPE := 176;
BEGIN
    DELETE FROM EMPLOYEES
    WHERE employee_id = empno;
    IF SQL%FOUND THEN 
    :rows_deleted := SQL%ROWCOUNT ||  ' row deleted by me';
    ELSIF SQL%NOTFOUND THEN 
    DBMS_OUTPUT.PUT_LINE(' No data found ');
    END IF;
END;
/


--IF ELSE statement 
BEGIN 
IF 3 > 3 THEN 
DBMS_OUTPUT.PUT_LINE('THIS IS TRUE ');
END;


