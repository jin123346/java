package sub01;

//동적 변수를 가지는 제너릭 클래스 
public class FruitBox<T> {
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
