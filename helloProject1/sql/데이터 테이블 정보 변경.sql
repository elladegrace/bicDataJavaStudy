/* 고객이 이사한 경우 같은 구내로 이사한 경우 */
update address set address3='D아파트 2동 303호'where client_id=321;

/* 고객이 서울시으 다른구로 이사한 경우 */
update address set address2='강서구 방화동 22번지', address3='E아파트 1동 101호' where client_id=321;

/* 고객이 다른 도시로 이사한 경우 */
update address set address1='제주도', address2='서귀포시 색달동', address3='청아아파트 11동 11호', postal_code=34567 where client_id=321;