package lessonone;

class Orange extends Fruit {
    private String orangeSort;
    private float lAscorbicAcidConcentration;

    Orange(String shape, String colouring, String freshness, float weight, String orangeSort, float lAscorbicAcidConcentration) {
        super(shape, colouring, freshness, weight);
        this.orangeSort = orangeSort;
        this.lAscorbicAcidConcentration = lAscorbicAcidConcentration;
    }

    String getOrangeType() {
        return orangeSort;
    }
    void setOrangeType(String orangeSort) {
        this.orangeSort = orangeSort;
    }

    float getlAscorbicAcidContent() {
        return lAscorbicAcidConcentration;
    }
    void setlAscorbicAcidContent(float lAscorbicAcidConcentration) {
        this.lAscorbicAcidConcentration = lAscorbicAcidConcentration;
    }
}
