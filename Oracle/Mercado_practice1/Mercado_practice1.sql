-- Practice 1

--1. Which of the following PL/SQL blocks execute successfully?
-- Letter D will execure succesfully

--2. Create and execute a simple anonymous block that outputs “Hello Grade 12 Computer Programming.” Execute the script.
begin
dbms_output.put_line('Hello Grade 12 Computer Programming ');
end;

--3. Display the first name, last name, email, and phone number of employee id 112.

SET SERVEROUTPUT ON;

DECLARE
f_name varchar(20);
l_name varchar(20);
mail varchar(20);
pnumber varchar(20);

begin
select first_name, last_name, email, phone_number
into f_name, l_name, mail, pnumber
from hr.employees
where employee_id = 112;
dbms_output.put_line('First name: ' || f_name || ' Last name: ' || l_name || ' Email '|| mail ||' Phone number ' || pnumber );
end;
/


--4. Display the first name, last name and salary of employee id 135.

SET SERVEROUTPUT ON;

DECLARE
f_name varchar(20);
l_name varchar(20);
s_alary varchar(20);

begin
select first_name, last_name, salary
into f_name, l_name, s_alary
from hr.employees
where employee_id = 135;
dbms_output.put_line('First name: ' || f_name || ' Last name: ' || l_name || 'Phone number:' || s_alary);
end;
/


--5. Display the first name, last name, hire date and job id of employee 107.

SET SERVEROUTPUT ON;

DECLARE
f_name varchar(20);
l_name varchar(20);
hdate varchar(20);
j_ob varchar(20);

begin
select first_name, last_name, HIRE_DATE, job_id
into f_name, l_name, hdate, j_ob
from hr.employees
where employee_id = 135;
dbms_output.put_line('First name: ' || f_name || ' Last name: ' || l_name || ' Hire date: ' || hdate || ' Job ' || j_ob);
end;
/


