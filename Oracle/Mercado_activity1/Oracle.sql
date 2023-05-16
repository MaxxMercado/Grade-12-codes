-- the query will select the first name, last name and employee id from the employees table, then it will print out the 
--employee with the id of 102
select first_name, last_name, employee_id
from employees
where employee_id = 102;

-- the query will select the last name and salary of the employees and will print out the salary greater or equal to 17000
select last_name, salary
from employees
where salary >= 17000;

-- the query will select the last name, job id and hire date of the employees and will print the hire date between 6/17/1987
-- and 1/03/1990
select last_name, job_id, hire_date
from employees
where hire_date between '6/17/1987' and '1/03/1990';

-- the query will select the last name and department_id of the employees and will print out employees with an id of 20 and 50 and arrange their 
-- last name in alphabetical order
select last_name, department_id
from employees
where department_id in (20,50)
order by last_name;

-- the query will select the last name and hiredate of employees and will print out the hire date with 94 in it
Select last_name, hire_date
from employees
where hire_date like '%94';