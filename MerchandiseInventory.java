package labExam1;

public class MerchandiseInventory {
	private String itemCode;
	private int quantity;
	private Double unitPrice;
	
	public MerchandiseInventory() {}

	public MerchandiseInventory(String itemCode, int quantity, Double unitPrice) {
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Merchandize [itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	
	

}
