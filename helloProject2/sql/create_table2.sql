/* ���̺� ���� (Data Definition Language) 
 * create table ���̺��(Į��1 Ÿ��(����), Į��2 Ÿ�� (����), ...);
 * */
create table customer(
seq_id int primary key auto_increment,
name varchar(20),
address varchar(100),
tel varchar(20),
s_no varchar(14)
);

/* ���̺� ����
 * alter table ���̺� �� modify Į���� ����Ÿ Ÿ��; */
alter table customer modify s_no varchar(20);
