/* ����Ÿ���� (Data Manipulation Language)
 * update ���̺�� set Į��1=��1, Į��2=��2,... where ����=��
 */

/* ȫ�浿 �� �̻� -> �������� ���޵� û�ƾ���Ʈ 111�� 11ȣ */
update customer set address='�������� ���޵� û�ƾ���Ʈ 111�� 11ȣ' where seq_id=1;

/* ������ �� ��ȭ��ȣ ���� 010-123-5678 */
update customer set tel='010-123-5678' where name='������';

/*�Ӳ��� �� ����, �̻�, ��ȭ��ȣ
 * �Ӿ�Ʈ, ���ֽ�, 010-1212-3434
 * 
 * */
update customer set name='�Ӿ�Ʈ',address='���ֽ�',tel='010-1212-3434' where name='�Ӳ���';