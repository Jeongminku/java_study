package test.ch10.resource;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyResource implements AutoCloseable { //AutoCloseable = 리소스를 자동으로 닫아주는 기능을 사용하기 위해서 쓰는 인터페이스.
	
	//필드
	private String name;
	
	//생성자
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource"+ name + "열기");
	}
	
	//메소드
	
	public String read1() {
		System.out.println("MyResource"+ this.name + "읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResource"+ this.name + "읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception { // 닫아주는기능, 
		//파일을 닫을때 실행시키고 싶은 코드를 사용.
		System.out.println("MyResource " + name +" 자동닫기");
		
		
	}
	
	
	
	
}
