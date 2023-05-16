SET SERVEROUTPUT ON;

DECLARE
f_name varchar(20);

BEGIN

select first_name into f_name from employees where employee_id = 103;

dbms_output.put_line('Welcome back ');
--f_name := 'John';
dbms_output.put_line('First name: ' ||f_name);


END;
