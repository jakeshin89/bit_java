package day02;

public class test01 {
	// Data(변수) + Method(기능)
	
	public static void main(String[] args) {
	
	int num = 99;
	
	int numx;		//변수 선언
	numx = 10;		//값 입력
	
	long num1 = 99;
	//이처럼 선언과 동시에 값을 대입하는데, 이걸 초기화라고 함
	//byte b1 = 128; 오류
		
	boolean flag = true;
	char c = 'b';
	float f1 = 55.9f;				// 55.9 얘 더블형 아니고 플롯형이야 라고 알려주기 위해 숫자 옆에 f 입력
	float f2 = (float)55.9;		// 더블형을 플롯형으로 형변환을 시켜주세요 라고 casting(float)하기
	
	double d1 = 55.9;
	// 데이터 손실(공간) 우려되지 않을 경우 자동으로 promotion 해줌
	// 그래서 이건 문제 없음
	double d2 = 55.9;
	
	}
}

// num 변수명 만들거면 앞에 data type 꼭 정의해야 함. ← 이건 PDT의 특징
// 앞에 int 붙이면 됨. 왜 자바는 type 선언을 해야하나요?
// num이라는 공간에 제약(메모리 할당량)을 가하는 장점.
// long도 가능, 메모리 공간범위가 달라지는 것.
// 즉, datatype 변수 = 
// memory 아낀다고 int에서 byte로 하지마. 성능저하의 원인이 됨.
// 자바는 =을 기준으로 좌우로 datatype 확인함.
