--Apply 1% interest to all savings accounts
SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN (SELECT account_id, balance FROM accounts WHERE account_type = 'savings') LOOP
        UPDATE accounts
        SET balance = balance + (balance * 0.01)
        WHERE account_id = acc.account_id;

        DBMS_OUTPUT.PUT_LINE('Interest applied to Account ID ' || acc.account_id);
    END LOOP;

    COMMIT;
END;
/

-- Execute it
BEGIN
    ProcessMonthlyInterest;
END;
/
