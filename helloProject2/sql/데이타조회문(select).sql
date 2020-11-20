/*데이타 조회 (DML)
 * select 칼럼명 from 테이블명 [where 조건= 값]
 */
/* customer 테이블에서 회원들의 이름과 주소만 조회*/
select name,address from customer;

/* customer 테이블에서 회원들의 이름과 주소만 조회 이름의 오름차순으로 정렬 */
select name,address from customer order by name;

/* customer 테이블에서 회원들의 이름과 주소만 조회 이름의 오름차순으로 정렬 */
select name,address from customer order by address;

/* customer 테이블에서 회원들의 이름과 주소만 조회 이름의 내림차순으로 정렬 */
select name,address from customer order by name desc;

/* customer테이블에서 회원들의 정보를 출력시 head부분을 별칭으로 선언 */
select seq_id as "회원번호", name as "회원명", address as "주소", tel as "전화번호" from customer order by name;

/* 고객 중 성남시에 거주하는 고객 조회 */
select * from customer where address like '성남시%';

/* 고객 중 여성 고객 조회 */
select * from customer where s_no like '-2';

/* 전화번호가 4로 끝나는 고객 리스트 조회 */
select * from customer where tel like '%4';

/* 이름에 '아'자가 포함된 고객 리스트 조회 */
select * from customer where name like '%아%';


select * from customer;