public class Truck extends BaseTransport {
    public Truck(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    @Override
    public void Сheck(Car car, Bicycle bicycle, Truck truck) {
        if (truck != null) {
            System.out.println("Мы обслуживаем " + truck.getModelName());
            System.out.println("Проверяем прицеп");
            System.out.println("Проверяем двигатель");
            System.out.println("Меняем покрышку");
            System.out.println();
        }
    }
}
