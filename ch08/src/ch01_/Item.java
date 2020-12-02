package ch01_;

public class Item {
	private String itemCode;//상품코드
	private String name;//상품명
	private int price;
	private int qty;//재고수량
	public Item(String itemCode, String name,int price, int qty) {
		this.itemCode=itemCode;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}