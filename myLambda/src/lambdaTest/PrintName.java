package lambdaTest;

//Form 인터페이스

//함수형 인터페이스로 선언 : 추상메소드 1개 선언
@FunctionalInterface
public interface PrintName {
//성과 이름을 전달받은 후 String으로 리턴하는 추상메소드 선언
	public String getFullName(String firstName, String lastName);
	
	
//	String fullName(String lastName, String firstName);
	
}
