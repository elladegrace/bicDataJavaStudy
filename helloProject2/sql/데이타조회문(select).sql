/*����Ÿ ��ȸ (DML)
 * select Į���� from ���̺�� [where ����= ��]
 */
/* customer ���̺��� ȸ������ �̸��� �ּҸ� ��ȸ*/
select name,address from customer;

/* customer ���̺��� ȸ������ �̸��� �ּҸ� ��ȸ �̸��� ������������ ���� */
select name,address from customer order by name;

/* customer ���̺��� ȸ������ �̸��� �ּҸ� ��ȸ �̸��� ������������ ���� */
select name,address from customer order by address;

/* customer ���̺��� ȸ������ �̸��� �ּҸ� ��ȸ �̸��� ������������ ���� */
select name,address from customer order by name desc;

/* customer���̺��� ȸ������ ������ ��½� head�κ��� ��Ī���� ���� */
select seq_id as "ȸ����ȣ", name as "ȸ����", address as "�ּ�", tel as "��ȭ��ȣ" from customer order by name;

/* �� �� �����ÿ� �����ϴ� �� ��ȸ */
select * from customer where address like '������%';

/* �� �� ���� �� ��ȸ */
select * from customer where s_no like '-2';

/* ��ȭ��ȣ�� 4�� ������ �� ����Ʈ ��ȸ */
select * from customer where tel like '%4';

/* �̸��� '��'�ڰ� ���Ե� �� ����Ʈ ��ȸ */
select * from customer where name like '%��%';


select * from customer;