public class Car extends Wcmn{

    public Car(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
