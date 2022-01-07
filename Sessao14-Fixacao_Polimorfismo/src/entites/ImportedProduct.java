package entites;

public class ImportedProduct extends Product{
		
	private Double customFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		return super.getName()
				+ " $ " 
				+ String.format("%.2f", super.getPrice())
				+ " (Customs fee: $  "
				+ customFee
				+ ")";
	}
	
	public double totalPrice() {
		return customFee + getPrice();
	}
}
