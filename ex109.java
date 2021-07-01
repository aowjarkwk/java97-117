package examples;
//제네릭(Generic) : 형(type)에 따른 데이타전송을 편하게 하기위해.
//jdk 1.5부터 도입
class Keyboard1 {
	//Object타입 : 최상위 객체타입 - 모든 종류의 클래스(객체)을 담을 수 있다. 다형성.
	private Object object;
	//Getter
	public Object getObject() {
		return object;
	}
	//Setter
	public void setObject(Object object) {
		this.object = object;
	}
}
//제네릭 사용
class Keyboard2<Type> {
	                     //<Type>은 가변타입으로 클래스 객체도 들어감.
	private Type object;
	public Type getObject() {
		return object;
	}
	public void setObject(Type object) {
		this.object = object;
	}
}
public class ex109 {
	public static void main(String[] args) {
		Keyboard1 k1 = new Keyboard1();
		k1.setObject( "키보드" );
		String str =  (String)k1.getObject();
		System.out.println( str );
		
		k1.setObject( new Integer( 10 ) );
		Integer intObj = (Integer)k1.getObject();
		System.out.println( intObj.intValue() );
		
		Keyboard2<String> k2 = new Keyboard2<String>();
		k2.setObject( "키보드2" );
		System.out.println( k2.getObject() );
		
		Keyboard2<Integer> k3 = new Keyboard2<Integer>();
		k3.setObject( 10 );
		System.out.println( k3.getObject() );
	}
}