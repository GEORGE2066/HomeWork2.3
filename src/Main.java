public class Main implements Method {
    public static void main(String[] args) {
        Car car1 = new Car("car1", 1);
        Car car2 = new Car("car2", 2);

        Truck truck3 = new Truck("truck3", 3);
        Truck truck4 = new Truck("truck4", 4);

        Bicycle bicycle5 = new Bicycle("bicycle5", 5);
        Bicycle bicycle6 = new Bicycle("bicycle6", 6);

        Method.printCheck(car1, bicycle5, truck3);
    }
}