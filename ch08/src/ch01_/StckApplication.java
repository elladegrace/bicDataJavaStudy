package ch01_;



import java.util.Scanner;

import ch01_.Item;


public class StckApplication {
	private static Item[] accountArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq;// 0
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.재고등록 | 2.재고목록 | 3.입고처리| 4. 출고처리| 5.종료");
			System.out.println("--------------------------------------------");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createItem();
			} else if (selectNo == 2) {
				stockList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	// 재고등록하기
	private static void createItem() {
		// 상품코드 입력
		//System.out.println("상품코드>");
		//String itemCode=scanner.next();
		// 소유자 입력
		System.out.println("상품명>");
		String name = scanner.next();
		// 상품가격
		System.out.println("상품가격>");
		int price = scanner.nextInt();
		// 재고 수량
		System.out.println("재고수량>");
		int qty = scanner.nextInt();
		
		Item acc = new Item("88-"+String.format("%04d",++seq), name, price, qty);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=acc;
				break;
			}
		}
		
		
		
	}
	// 재고 목록보기
	private static void stockList() {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				Item acc = accountArray[i];
				System.out.println(acc.getItemCode()+","+acc.getName()+","+acc.getPrice()+","+acc.getQty());
			}
		}
	}
	// 입고처리
	private static void deposit() {
		// 상품코드 찾기
		System.out.println("상품코드");
		String itemCode=scanner.next();
		// 입고 수량
		System.out.println("입고수량");
		int qty = scanner.nextInt();
		
		Item acc = findItem(itemCode);
		if(acc!=null) {
			acc.setQty(acc.getQty()+qty);
		}else {
			System.out.println("해당 상품이 없습니다.");
		}
	}
	// 출고처리
	private static void withdraw() {
		// 상품코드 찾기
		System.out.println("상품코드");
		String itemCode = scanner.next();
		// 출고 수량
		System.out.println("출고수량");
		int qty=scanner.nextInt();
		
		Item acc = findItem(itemCode);
		if(acc!=null) {
			if(acc.getQty()-qty<0) {
				System.out.println("출고수량이 재고수량보다 많습니다.");
				return;
			}
			acc.setQty(acc.getQty()-qty);
		}else {
			System.out.println("해당계좌번호가 없습니다.");
		}
	}
	// 이미 있는상품코드 입력시 리턴
	private static Item findItem(String itemCode) {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				Item acc = accountArray[i];
				if(acc.getItemCode().equals(itemCode)) return acc;
			}
		}
		return null;
	}
	
	
}
