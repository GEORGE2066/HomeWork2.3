public class Car extends BaseTransport {

    public Car(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    @Override
    public void Сheck(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Мы обслуживаем " + car.getModelName());
            System.out.println("Проверяем двигатель");
            System.out.println("Меняем покрышку");
            System.out.println();
        }
    }
}
