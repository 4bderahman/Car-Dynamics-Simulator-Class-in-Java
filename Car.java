public class Car {
    private int speed;
    private String color;
    private boolean nitroSpeed;
    private String model;

    public Car(int speed, String color, boolean nitroSpeed, String model) {
        this.speed = speed;
        this.color = color;
        this.nitroSpeed = nitroSpeed;
        this.model = model;
    }

    public void turn(String direction) {
        System.out.println("The car turns " + direction);
    }

    public void accelerate() {
        this.speed += 10;
        System.out.println("The car accelerates to " + this.speed + " km/h");
    }

    public void brake() {
        this.speed -= 10;
        System.out.println("The car slows down to " + this.speed + " km/h");
    }

    public void boost() {
        if (this.nitroSpeed) {
            this.speed += 50;
            System.out.println("Boost activated! Speed is now " + this.speed + " km/h");
        }
    }

    public void info() {
        System.out.println("Car Information:");
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Nitro Speed: " + (this.nitroSpeed ? "Enabled" : "Disabled"));
    }
}
