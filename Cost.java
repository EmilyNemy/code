
public class Cost {

	private int times;
    private Item anItemBought;
    
	public Cost(int times) {
		this.times = times;
	}
	
	public Cost calculateCostOfItemBought(Item anItemBought) {
		return new Cost(times * anItemBought.price);
	}

	public Item getAnItemBought() {
		return anItemBought;
	}

	public void setAnItemBought(Item anItemBought) {
		this.anItemBought = anItemBought;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anItemBought == null) ? 0 : anItemBought.hashCode());
		result = prime * result + times;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cost other = (Cost) obj;
		if (anItemBought == null) {
			if (other.anItemBought != null) {
				return false;
			}
		} else if (!anItemBought.equals(other.anItemBought)) {
			return false;
		}
		if (times != other.times) {
			return false;
		}
		return true;
	}

}
