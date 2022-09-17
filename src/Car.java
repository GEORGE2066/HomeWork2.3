public class Car extends BaseTransport {

    public Car(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    @Override
    public void check() {
        System.out.println("Мы обслуживаем " + getModelName());
        System.out.println("Проверяем двигатель");
        System.out.println("Меняем покрышку");
        System.out.println();
    }
}
