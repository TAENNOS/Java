package week03;

//       [우리가 클래스를 만들기 위해서는 4가지 STEP 이 필요합니다.]

//      1. 만들려고하는 설계도를 선언합니다. (클래스 선언)
//      2. 객체가 가지고 있어야할 속성(월드)을 정의합니다.
//      3. 객체를 생성하는 방식을 정의합니다. (생성자 - construct)
//      4. 객체가 가지고 있어야할 행위(메서드)를 정의합니다.
public class Car {
    // <필드 영역>

    // 1) 고유 데이터 영역
    String company; // 자동차 회사
    String model = "GV80"; // 자동차 모델
    String color; // 자동차 색
    double price; //자동차 가격

    // 2) 상태 데이터 영역
    double speed; // 자동차 속도, km/h
    char gear; // 자동차 기어 상태(P, R, N, D)
    boolean lights = true; // 자동차 조명의 상태

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // <생성자 영역>
    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 들어와야 하는지 정의!
    public  Car () {
        // logic
        // 아무것도 없는 생성자의 형태 -> 기본생성자 : 생략 가능
    }

    // <메서드 영역>

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type) { // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        changeGear(type);
        speed = kmh;
        return speed;
    }

    // brakePedal
    // input : x
    // output : speed
    double brakePedal () {
        speed = 0;
        return speed;
    }

    //changeGear
    // input : gear (char type)
    // output : gear
    char changeGear (char type) {
        gear = type;
        return gear;
    }
    //onOffLight
    // input : x
    // output : Light(boolean)
    boolean onOffLight () {
        lights = !lights;
        return lights;
    }

    //horn
    // input : x
    // output : x
    void horn () {
        System.out.println("빵빵!");
    }

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeed(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
