package ru.geekbrains.DZ7;

import ru.geekbrains.DZ6.Animal;
import ru.geekbrains.DZ6.Dog;

public class Main {
    public static void main(String[] args) {

        Cat[] arrCat = {new Cat("Пряня", 200, true),
                new Cat("Пушок", 300, true),
                new Cat("Мася", 280, true)};
        Plate plate = new Plate(500);
        plate.info();
        for (int f = 0; f < arrCat.length; f++) {
            for (int i = 0; i < arrCat.length; i++) {
                if (arrCat[i].getHunger() == false) {
                    System.out.println(arrCat[i].getName() + " сыт");
                }else {
                    if (plate.getFood() >= arrCat[i].getAppetite()) {
                        arrCat[i].eat(plate);
                        System.out.println(arrCat[i].getName() + " покушал");
                        arrCat[i].setHunger(false);
                    } else {
                        System.out.println(arrCat[i].getName() +  " остался голодным");
                    }
                }
            }
            plate.info();
            for (int j = 0; j < arrCat.length; j++) {
                if (arrCat[j].getHunger() == true) {
                    System.out.println("Добавляем в миску еды");
                    plate.appFood(150);
                    break;
                }
            }
            plate.info();
        }
    }
}
