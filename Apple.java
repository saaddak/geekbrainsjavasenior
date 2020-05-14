class Apple extends Fruit {
    private String appleSort;
    private float ferrumConcentration;

    Apple(String shape, String colouring, String freshness, float weight, String appleSort, float ferrumConcentration) {
        super(shape, colouring, freshness, weight);
        this.appleSort = appleSort;
        this.ferrumConcentration = ferrumConcentration;
    }

    String getAppleType() {
        return appleSort;
    }
    void setAppleType(String appleSort) {
        this.appleSort = appleSort;
    }

    float getFerrumContent() {
        return ferrumConcentration;
    }
    void setFerrumContent(float ferrumConcentration) {
        this.ferrumConcentration = ferrumConcentration;
    }
}
