-- Scenario3.sql
SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT l.loan_id, c.name, l.due_date
        FROM loans l
        JOIN customers c ON c.customer_id = l.customer_id
        WHERE l.due_date <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || rec.loan_id ||
                             ' for ' || rec.name || ' is due on ' ||
                             TO_CHAR(rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
