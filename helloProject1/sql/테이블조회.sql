select * from address;
select seq_id, address1 from address;
select seq_id, client_id, address1, address2 from address;
select seq_id as "����", client_id as "����ȣ", address1 as "������" from address;
select * from address where address1='��⵵';
select seq_id, client_id as "����ȣ", postal_code from address where address1='��⵵';