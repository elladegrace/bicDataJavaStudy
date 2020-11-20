select * from address;
select seq_id, address1 from address;
select seq_id, client_id, address1, address2 from address;
select seq_id as "순번", client_id as "고객번호", address1 as "거주지" from address;
select * from address where address1='경기도';
select seq_id, client_id as "고객번호", postal_code from address where address1='경기도';