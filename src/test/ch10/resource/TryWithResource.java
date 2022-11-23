package test.ch10.resource;

public class TryWithResource {
	
	public static void main(String[] args) {
		//try안에 열고 싶은 리소스 객체 생성.
		try(MyResource res = new MyResource("아주그냥막그냥확그냥")) {
			String data = res.read1();
			int value = Integer.parseInt(data); //int형 변환
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========구분선=======");
		
		try(MyResource res = new MyResource("아주그냥막그냥확그냥")) {
			String data = res.read2(); //NumberFormatException 에러 발생함 , return을 abc를 받는데 그걸 int형으로 바꿔줄수 없기 때문입니다.
			int value = Integer.parseInt(data); //int형 변환
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
