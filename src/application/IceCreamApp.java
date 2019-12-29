package application;

import eatables.Cone;
import eatables.Cone.Flavor;
import eatables.Eatable;
import eatables.IceRocket;
import eatables.Magnum;
import eatables.Magnum.MagnumType;
import seller.IceCreamSalon;
import seller.IceCreamSeller;
import seller.PriceList;

public class IceCreamApp {

	public static void main(String[] args) {


		PriceList priceList = new PriceList(10, 12, 14);

		IceCreamSeller salon = new IceCreamSalon(priceList);

		

		Cone cone1 = salon.orderCone(new Flavor[] { Flavor.BANANA, Flavor.CHOCOLATE });

		Cone cone2 = salon.orderCone(new Flavor[] { Flavor.VANILLA });

		Cone cone3 = salon.orderCone(new Flavor[] { Flavor.VANILLA, Flavor.LEMON, Flavor.MOKKA, Flavor.PISTACHE });

		IceRocket iceRocket = salon.orderIceRocket();

		Magnum magnum1 = salon.orderMagnum(MagnumType.MILKCHOCOLATE);

		Magnum magnum2 = salon.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);

		

		Eatable[] iceCreams= new Eatable[] {cone1,cone2,cone3,iceRocket,magnum1,magnum2};



		for (Eatable e : iceCreams) {

			e.eat();

		}

		System.out.println("Profit");

		System.out.println(salon.getProfit());

	}

}
