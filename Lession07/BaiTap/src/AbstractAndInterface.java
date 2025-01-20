package src;

import src.animal.Animal;
import src.animal.Chicken;
import src.animal.Tiger;
import src.edible.Edible;
import src.fruit.Apple;
import src.fruit.Fruit;
import src.fruit.Orange;

public class AbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSound());

            if (a instanceof Chicken) {
                Edible edible = (Chicken) a;
                System.out.println(edible.howtoEat());
            }
        }

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();

        for (Fruit f : fruit) {
            System.out.println(f.howtoEat());
        }
    }
}
