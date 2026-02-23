CREATE TABLE test (
  bno     NUMBER(3),
  title   VARCHAR2(30),
  content VARCHAR2(100),
  writer  VARCHAR2(10)
);

CREATE SEQUENCE seq_bno;

SELECT * FROM test;

CREATE TABLE board (
  bno     NUMBER(3),
  title   VARCHAR2(30),
  content VARCHAR2(100),
  writer  VARCHAR2(10)
);

select * from board;

DELETE FROM board where bno is null;

SELECT * FROM board WHERE bno = 1;

commit;

CREATE TABLE users(
  id  VARCHAR2(20),
  password VARCHAR2(30),
  name VARCHAR2(20),
  address VARCHAR2(50),
  phone VARCHAR2(20)
  );