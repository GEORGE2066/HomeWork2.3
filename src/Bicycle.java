public class Bicycle extends Wcmn{

    public Bicycle(String modelName, int whillsCount) {
        super(modelName, whillsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
