package examples;
import java.util.ArrayList;
//클래스객체 ArrayList에 넣는 연습문제
//몬스터 클래스객체를 여러개 만들어서 리스트에 넣어보자.
//1. "달걀몬스터"
//2. "햄스터몬스터"
//3. "헐크몬스터"의 이름으로 몬스터 객체를 만들어서
//4. monsters라는 Array List에 넣고,
//5. 전체 몬스터 객체 목록을 출력하시오.
//6. "햄스터몬스터"를 제거하고 "눈사람몬스터"를 그 자리에 넣으시오.
class Monster {
	private String name = "";
	//생성자
	public Monster(String name) {
		this.name = name;
	}
	//Getter
	public String getName() {
		return name;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}
}
public class ex117 {
	public static void main(String[] args) {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Monster("달걀몬스터"));
		monsters.add(new Monster("햄스터몬스터"));
		monsters.add(new Monster("헐크몬스터"));
		echo( monsters );
		//monsters.remove(1);
		//echo( monsters );
		monsters.set(1, new Monster("눈사람몬스터"));
		echo( monsters );
	}
	static void echo(ArrayList<Monster> monsters) {
		for( Monster monster : monsters ) {
			System.out.println( monster.getName() );
		}
		System.out.println();
	}
}