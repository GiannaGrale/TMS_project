package src.clothes;

import src.clothes.jackets.Jacket;
import src.clothes.shoes.Shoes;
import src.clothes.trousers.Trousers;

public class Human implements Jacket, Shoes, Trousers {
    private String name;
    Jacket jacket;
    Trousers trousers;
    Shoes shoes;

    public Human(String name, Jacket jacket, Shoes shoes, Trousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    @Override
    public void takeOn() {
        jacket.takeOn();
        trousers.takeOn();
        shoes.takeOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
    }
}
