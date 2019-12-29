package seller;

public class WaffleShop implements WaffelSeller {

	private double profit;



	@Override

	public double getProfit() {



		return profit;

	}



	@Override

	public Waffle orderWaffle() {

		Waffle waffle = new Waffle(12);

		this.profit += waffle.getPrize();

		return waffle;

	}

}
