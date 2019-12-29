package application;

import eatables.Cone;
import eatables.Cone.Flavor;
import eatables.Eatable;
import eatables.IceRocket;
import eatables.Magnum;
import eatables.Magnum.MagnumType;
import seller.IceCreamCar;
import seller.PriceList;
import seller.Stock;

public class IceCreamAppV2 {

	public static void main(String[] args) {


		IceCreamCar car = new IceCreamCar(new PriceList(10, 11, 12), new Stock(10, 2,10, 15));



		Cone cone1 = car.orderCone(new Flavor[] { Flavor.BANANA, Flavor.CHOCOLATE });

		Cone cone2 = car.orderCone(new Flavor[] { Flavor.VANILLA });

		Cone cone3 = car.orderCone(new Flavor[] { Flavor.VANILLA, Flavor.LEMON, Flavor.MOKKA, Flavor.PISTACHE });

		IceRocket iceRocket = car.orderIceRocket();

		Magnum magnum1 = car.orderMagnum(MagnumType.MILKCHOCOLATE);

		Magnum magnum2 = car.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);



		Eatable[] iceCreams = new Eatable[] { cone1, cone2, cone3, iceRocket, magnum1, magnum2 };

		

		for(int i = 0;i < iceCreams.length;i++) {

			if(iceCreams[i]!=null) {

				iceCreams[i].eat();

			}

		}



		System.out.println("Profit");

		System.out.println(car.getProfit());

	}

}
