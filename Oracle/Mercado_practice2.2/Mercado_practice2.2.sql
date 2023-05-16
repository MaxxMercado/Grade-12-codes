-- 4. create a anonymous block. Use and edit the scrip on practice 1 question 2
SET SERVEROUTPUT ON
declare
today DATE := SYSDATE;
tommorow today %type;
begin
tommorow := today +1;
dbms_output.put_line('Hello Grade 12 Computer Programming ');
dbms_output.put_line('TODAY IS: ' || today );
dbms_output.put_line('TOMMOROW IS: ' || tommorow);
end;
/


-- 5. edit the question 4 script
SET SERVEROUTPUT ON
SET VERIFY OFF
VARIABLE basic_percent number
VARIABLE pf_percent number
declare
today DATE := SYSDATE;
tommorow today %type;
begin
tommorow := today +1;
:basic_percent := 45;
:pf_percent := 12;
dbms_output.put_line('Hello Grade 12 Computer Programming ');
dbms_output.put_line('TODAY IS: ' || today );
dbms_output.put_line('TOMMOROW IS: ' || tommorow);
end;
/
print basic_percent;
print pf_percent;