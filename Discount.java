
public class Discount {

	private double discount;
	private Cost c;
	private Item i;

	public Discount(double discount) {
	    this.discount = discount;
	}
    
	public double getDiscount() {
		Cost discountedCost = c.calculateCostOfItemBought(i);
		double d = Double.valueOf(discountedCost.toString());
		return discount * d ;
	}
	
	/*public double getOverallDiscount(){
		return discount;
	}*/

}
