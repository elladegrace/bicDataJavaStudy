package verify.stock;

public class Item {
	private String itemCode;// 상품코드
	private String name;// 상품명
	private int qty;// 재고수량
	
	// itemCode는 자동발번되기때문에 name,qty만 선택하면된다.
	public Item(String itemCode, String name, int qty) {
		this.name = name;
		this.qty = qty;
		this.itemCode = itemCode;
	}

	// Source->Generate Getter and Setter
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	// Source -> Generate toString
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", name=" + name + ", qty=" + qty + "]";
	}
	
}
