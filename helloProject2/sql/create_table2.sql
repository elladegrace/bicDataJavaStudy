/* 테이블 생성 (Data Definition Language) 
 * create table 테이블명(칼럼1 타입(길이), 칼럽2 타입 (길이), ...);
 * */
create table customer(
seq_id int primary key auto_increment,
name varchar(20),
address varchar(100),
tel varchar(20),
s_no varchar(14)
);

/* 테이블 수정
 * alter table 테이블 명 modify 칼럼명 데이타 타입; */
alter table customer modify s_no varchar(20);
