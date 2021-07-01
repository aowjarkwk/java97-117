package examples;
//클래스 this, super 예약어
class King {
	String name = "아빠왕";
	public King() {
		System.out.println( "King 생성자 함수 호출됨." );
	}
	public King(String name) {
		this();            //this() : 생성자함수를 호출함. 첫줄에 위치해야 됨.
		this.name = name;  //this.  : 멤버변수 접근
		System.out.println( "SonKing 생성자 매개변수함수 호출됨." );
	}
}
class SonKing extends King {
	String name = "아들왕";
	public SonKing() {
		System.out.println( "SonKing 생성자 함수 호출됨." );
	}
	public SonKing(String name) {
		super( "아빠왕2" );  //super() : 부모클래스의 생성자함수를 호출됨.
		System.out.println( super.name ); //super. : 부모클래스의 멤버변수를 접근함.
		System.out.println( "SonKing 생성자 매개변수함수 호출됨." );
	}
}
public class ex98 {
	public static void main(String[] args) {
		SonKing son = new SonKing( "아들왕2" );
	}
}