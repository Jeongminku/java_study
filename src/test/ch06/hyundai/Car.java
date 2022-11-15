package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	//SnowTire SnowT = new SnowTire();//SnowTire는 다른 패키지에 있으므로 import를 해야합니다. 3번 import~~
	//다른 패키지에 있는 class를 사용하고싶다면 import 하셔야합니다.
	SnowTire SnowT = new SnowTire();
	Test TestHyundai = new Test(); //Test 클래스는 같은 패키지에 있으므로 그냥 바로 해도 된다.
	AllSeasonTire allT = new AllSeasonTire(); // 당연하게 올시즌타이어도 다른 패키지에 있으므로 임포트해야 사용이 가능합니다.
	
	
	//참고용 : import 없이 사용하는 방법인데 잘 사용되지 않음(딱 보기에도 불편하고 지저분함)
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
	
	
}
