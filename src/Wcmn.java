public abstract class Wcmn {
    private String modelName;
    private int whillsCount;

    public Wcmn(String modelName, int whillsCount) {
        this.modelName = modelName;
        this.whillsCount = whillsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWhillsCount() {
        return whillsCount;
    }

    public void setWhillsCount(int whillsCount) {
        this.whillsCount = whillsCount;
    }
}
