/* 데이타수정 (Data Manipulation Language)
 * update 테이블명 set 칼럼1=값1, 칼럼2=값2,... where 조건=값
 */

/* 홍길동 고객 이사 -> 서귀포시 색달동 청아아파트 111동 11호 */
update customer set address='서귀포시 색달동 청아아파트 111동 11호' where seq_id=1;

/* 일지매 고객 전화번호 변경 010-123-5678 */
update customer set tel='010-123-5678' where name='일지매';

/*임꺽정 고객 개명, 이사, 전화번호
 * 임아트, 제주시, 010-1212-3434
 * 
 * */
update customer set name='임아트',address='제주시',tel='010-1212-3434' where name='임꺽정';