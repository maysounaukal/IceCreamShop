package seller;

import eatables.Cone;
import eatables.Cone.Flavor;
import eatables.IceRocket;
import eatables.Magnum;
import eatables.Magnum.MagnumType;

public interface IceCreamSeller extends Profitable {

		Cone orderCone(Flavor[] flavors);

		IceRocket orderIceRocket();

		Magnum orderMagnum(MagnumType magnumType);

	
}
