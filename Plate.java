package ru.geekbrains.DZ7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void appFood(int value) {
        food = food + value;
    }

    public void decreaseFood(int minus) {
        if (food < minus){
            System.out.println("В миске кончилась еда!");
        }else {
            food -= minus;
        }
    }

    public void info() {
        if (food > 0){
            System.out.println("В миске: " + food + " граммов корма");
        }else {
            System.out.println("В миске кончилась еда!");
        }
    }
}
