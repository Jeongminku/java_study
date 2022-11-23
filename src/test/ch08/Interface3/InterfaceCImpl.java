package test.ch08.Interface3;

public class InterfaceCImpl implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl이 methodA()를 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl이 methodB()를 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl이 methodC()를 실행");
		
	}

}
