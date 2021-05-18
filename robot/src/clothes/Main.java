package src.clothes;

import src.clothes.jackets.Black_Jacket;
import src.clothes.jackets.Blue_Jacket;
import src.clothes.jackets.Red_Jacket;
import src.clothes.shoes.Boots;
import src.clothes.shoes.Converse;
import src.clothes.shoes.Heels;
import src.clothes.trousers.Black_Trousers;
import src.clothes.trousers.Blue_Trousers;
import src.clothes.trousers.Red_Trousers;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Valerie", new Black_Jacket(), new Heels(), new Black_Trousers());
        human.getName();
        human.takeOn();

        Human person = new Human("Emily", new Red_Jacket(), new Converse(), new Red_Trousers());
        person.getName();
        person.takeOff();

        Human girl = new Human("Katherine", new Blue_Jacket(), new Boots(), new Blue_Trousers());
        girl.getName();
        girl.takeOn();

    }
}
