
public class Item {

	 int price;
	 String nameOfProduct;
	 int times;

	public Item(int price, String nameOfProduct) {
		this.price = price;
		this.nameOfProduct = nameOfProduct;
	}

	/*public Item(int times) {
		this.times = times;
	}*/

	public static Item returnBook(int price) {
		return new Item(price, "book");
	}
	
	public static Item returnFood(int price) {	
		return new Item(price, "food");
	}
	
	public static Item returnMedicine(int price) {
		return new Item(price, "medicine");
	}

	/*public Cost calculateCostOfitemsBought(int times) {
		int product = this.price * times;
		return new Item(product, this.nameOfProduct);
	}*/
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nameOfProduct == null) ? 0 : nameOfProduct.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (nameOfProduct == null) {
			if (other.nameOfProduct != null)
				return false;
		} else if (!nameOfProduct.equals(other.nameOfProduct))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}
