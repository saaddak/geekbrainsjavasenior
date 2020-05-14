package lessonone;

abstract class Fruit {
    private String shape;
    private String colouring;
    private String freshness;
    private float weight;

    Fruit(String shape, String colouring, String freshness, float weight) {
        this.shape = shape;
        this.colouring = colouring;
        this.freshness = freshness;
        this.weight = weight;
    }

    String getShape() {
        return shape;
    }
    void setShape(String shape) {
        this.shape = shape;
    }

    String getColouring() {
        return colouring;
    }
    void setColouring(String colouring) {
        this.colouring = colouring;
    }

    String getFreshness() {
        return freshness;
    }
    void setFreshness(String freshness) {
        this.freshness = freshness;
    }

    float getWeight() {
        return weight;
    }
    void setWeight(float weight) {
        this.weight = weight;
    }
}
