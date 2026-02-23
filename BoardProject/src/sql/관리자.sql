-- ## 없이 작업
alter session set "_oracle_script" = true;

-- User 생성
create user java IDENTIFIED by 1234;

-- 권한부여
grant connect, resource, dba to java;
grant unlimited tablespace to java;

