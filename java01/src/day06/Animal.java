package day06;

public class Animal {							//동작여부 궁굼하다면 main method 밑에 만들어보면 돼
	
			private boolean live;				//생존여부
			private int age;						//나이
			private String name;				//이름			

			public void display() {
					System.out.printf("[이름 :  %3s, 나이 : %s, 생존여부 : %b]%n", this.name, age, this.live);
			}

			public boolean isLive() {
				return live;
			}
			public void setLive(boolean live) {
				this.live = live;
			}
			public String getName() {
				return name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public void setName(String name) {
				this.name = name;
			}

			public static void main(String[] args) {
						Animal ani = new Animal();
						ani.name = "호랑이";			//instance variable
						ani.display();						//instance method
						
																	//주소가 있어야만 호출 가능한 method, 인스턴스 매쏘드
}
			
}