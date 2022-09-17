public class Bicycle extends BaseTransport {

    public Bicycle(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    @Override
    public void check() {
        System.out.println("Мы обслуживаем " + getModelName());
        System.out.println("Меняем покрышку");
        System.out.println();
    }
}
