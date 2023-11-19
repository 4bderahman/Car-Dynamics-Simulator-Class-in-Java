public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(200, "red", true, "Porsche");
        car1.info();
        car1.turn("left");
        car1.accelerate();
        car1.brake();
        car1.boost();
    }
}
