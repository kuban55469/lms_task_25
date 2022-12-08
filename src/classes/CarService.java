package classes;

import enums.Color;

import java.math.BigDecimal;
import java.time.Year;

public class CarService {
    private Year year;
    private String model;
    private BigDecimal price;
    private Color color;

    public CarService(Year year, String model, BigDecimal price, Color color) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nyear=" + year +
                "\nmodel='" + model +
                "\nprice=" + price +
                "\ncolor=" + color
                +"\n~~~~~~~~~~~~~~~~~";
    }
}
