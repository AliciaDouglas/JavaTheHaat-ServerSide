--Sequences
--Sequence for users
CREATE SEQUENCE users_seq
START WITH 1
INCREMENT BY 1;

--Sequence for posts
CREATE SEQUENCE posts_seq
START WITH 1
INCREMENT BY 1;

--Sequence for steps
CREATE SEQUENCE steps_seq
START WITH 1
INCREMENT BY 1;

--Sequence for comments
CREATE SEQUENCE comments_seq
START WITH 1
INCREMENT BY 1;


--Triggers
--Trigger for users_seq
CREATE OR REPLACE TRIGGER users_seq_trigger
BEFORE INSERT ON users
FOR EACH ROW 
BEGIN
    IF :new.u_id IS NULL THEN
        SELECT users_seq.nextval INTO :new.u_id FROM DUAL;
    END IF;
END;
/

--Trigger for posts_seq
CREATE OR REPLACE TRIGGER posts_seq_trigger
BEFORE INSERT ON posts
FOR EACH ROW 
BEGIN
    IF :new.p_id IS NULL THEN
        SELECT posts_seq.nextval INTO :new.p_id FROM DUAL;
    END IF;
END;
/

--Trigger for steps_seq
CREATE OR REPLACE TRIGGER steps_seq_trigger
BEFORE INSERT ON steps
FOR EACH ROW 
BEGIN
    IF :new.s_id IS NULL THEN
        SELECT steps_seq.nextval INTO :new.s_id FROM DUAL;
    END IF;
END;
/

--Trigger for comments_seq
CREATE OR REPLACE TRIGGER comments_seq_trigger
BEFORE INSERT ON comments
FOR EACH ROW 
BEGIN
    IF :new.c_id IS NULL THEN
        SELECT comments_seq.nextval INTO :new.c_id FROM DUAL;
    END IF;
END;
/






