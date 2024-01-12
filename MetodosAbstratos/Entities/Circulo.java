package MetodosAbstratos.Entities;

import MetodosAbstratos.Entities.Enums.Color;

public class Circulo extends Shape {

    private Double radius;

    public Circulo() {
        super();
    }

    public Circulo(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
