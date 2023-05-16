-- implicit conversion
set serveroutput on 
DECLARE 
salary number (6) := 6000;
sal_hike varchar2(5) := '1000';
total_salary salary%type;
BEGIN
total_salary := salary + sal_hike;
dbms_output.put_line(total_salary);
END;
/

-- explicit conversion
DECLARE 
--date_of_joining DATE := '02-FEB-2000';
--date_of_joining1 DATE := 'February 02,2000';
date_of_joining DATE := TO_DATE('February 02. 2000',' Month DD. YYYY');
BEGIN
dbms_output.put_line(date_of_joining);
END;
/

-- nested block
DECLARE
outer_variable VARCHAR(20) := 'Global Variable';
BEGIN
    DECLARE
    inner_variable VARCHAR(20) := 'LOCAL VARIABLE';
    BEGIN
    dbms_output.put_line(inner_variable);
    
    dbms_output.put_line(outer_variable);
    END;
dbms_output.put_line(outer_variable);
END;
/

<<outer>>
DECLARE
father_name VARCHAR(20) := 'patrick';
date_of_birth DATE:= '20-Apr-1972';
BEGIN
    DECLARE
    child_name VARCHAR(20) := 'Mike';
    date_of_birth DATE := '12-Dec-2002';
    BEGIN
    DBMS_OUTPUT.PUT_LINE('Fathers''s name: ' || father_name);
    DBMS_OUTPUT.PUT_LINE('Date of birth: ' || date_of_birth);
    DBMS_OUTPUT.PUT_LINE('Date of birth: (outer) ' || outer.date_of_birth);
    DBMS_OUTPUT.PUT_LINE('Date of birth: (inner/local) ' || date_of_birth);
    DBMS_OUTPUT.PUT_LINE('Child''s name: ' || child_name);
    END;
--DBMS_OUTPUT.PUT_LINE('Fathers''s name: ' || father_name);
--DBMS_OUTPUT.PUT_LINE('Date of birth: ' || date_of_birth);
END;
/
