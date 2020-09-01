package test.auto;

public class Bicycle {
	//필드
	private Engine personPower;
	
	public Bicycle(Engine personPower) {
		this.personPower = personPower;
	}
	public void drive() {
		if(personPower==null) {
			System.out.println("동력이 없어서 달릴 수가 없어요ㅜㅜ");
		}else {
			System.out.println("힘차게 달려요!");
		}
	}
}
