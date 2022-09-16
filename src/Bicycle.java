public class Bicycle extends BaseTransport {

    public Bicycle(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    @Override
    public void Сheck(Car car, Bicycle bicycle, Truck truck) {
        if (bicycle != null) {
            System.out.println("Мы обслуживаем " + bicycle.getModelName());
            System.out.println("Меняем покрышку");
            System.out.println();
        }
    }
}
