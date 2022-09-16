public class Bicycle extends BaseTransport {

    public Bicycle(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    @Override
    public void Сheck(Car car, Bicycle bicycle, Truck truck) {
        if (truck != null) {
            System.out.println("Мы обслуживаем " + getModelName());
            System.out.println("Меняем покрышку");
            System.out.println();
        }
    }
}
