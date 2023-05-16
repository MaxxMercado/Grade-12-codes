-- 3. Use the same session that you used to execute the practices on Practice 2. edit the script of question 5.
SET SERVEROUTPUT ON
SET VERIFY OFF
--VARIABLE basic_percent number
--VARIABLE pf_percent number
DECLARE
today DATE := SYSDATE;
tommorow today %type;
fname VARCHAR(15);
emp_sal NUMBER(10);
BEGIN
SELECT first_name, salary
INTO fname, emp_sal FROM hr.employees
WHERE employee_id=110;
tommorow := today +1;
/*:basic_percent := 45;
:pf_percent := 12;*/
dbms_output.put_line('Hello ' || fname);
dbms_output.put_line('YOUR SALARY IS: ' || emp_sal);
dbms_output.put_line('YOUR CONTRIBUTION TOWARDS PF: ' || (0.12 * (0.45 * emp_sal)));
--dbms_output.put_line('TODAY IS: ' || today );
--dbms_output.put_line('TOMMOROW IS: ' || tommorow);
END;
/
--print basic_percent;
--print pf_percent;

--4 Accept a value at run time using the substitutio variable. In this practice, you will modify the script that you created in exercise 3 to accept user input
SET SERVEROUTPUT ON
SET VERIFY OFF
--VARIABLE basic_percent number
--VARIABLE pf_percent number
ACCEPT empno  prompt 'Please enter your employee number:'
DECLARE
empno NUMBER(6):=&empno; 
today DATE := SYSDATE;
tommorow today %type;
fname VARCHAR(15);
emp_sal NUMBER(10);
BEGIN
SELECT first_name, salary, salary
INTO fname, emp_sal, empno FROM hr.employees
WHERE employee_id=empno;
tommorow := today +1;
/*:basic_percent := 45;
:pf_percent := 12;*/
dbms_output.put_line('Hello ' || fname);
dbms_output.put_line('YOUR SALARY IS: ' || emp_sal);
dbms_output.put_line('YOUR CONTRIBUTION TOWARDS PF: ' || (0.12 * (0.45 * emp_sal)));
--dbms_output.put_line('TODAY IS: ' || today );
--dbms_output.put_line('TOMMOROW IS: ' || tommorow);
END;
/
--print basic_percent;
--print pf_percent;