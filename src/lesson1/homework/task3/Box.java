package lesson1.homework.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<F extends Fruit> {

    private List<F> fruits = new ArrayList<>();

    public Box(F... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public float getBoxWeight() {
        float boxWeight = 0.0f;
        for (F fruit : fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<?> boxToCompare) {
        return Math.abs(this.getBoxWeight() - boxToCompare.getBoxWeight()) < 0.0001f;
    }

    public void moveToAnotherBox(Box<F> anotherBox) {
        for (F fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }


}