package web.model;

public class Car {
    private long id;
    private String model;
    private String color;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }
}
