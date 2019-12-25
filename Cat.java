package ru.geekbrains.DZ7;

public class Cat {

    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getHunger() {
        return hunger;
    }
    public void setHunger(boolean c) {
        this.hunger = c;
    }

    public void info() {
        System.out.println("");
    }
}
