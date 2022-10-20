package DZ3;

import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> {
    private List<T> fruitList;

    private double totalWeight;


//    Box
    public Box() {
        this.fruitList = new ArrayList<>();
    }

//    Add fruit to box
    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

// Weight Box
    public double getTotalWeight() {
        totalWeight = 0;
    for (Fruit f: fruitList) {
        totalWeight += f.getWeight();
    }
        return totalWeight;
    }

//   Empty box ??
    public boolean isEmpty(){
        return fruitList.isEmpty();
    }


//    Box Comparison
    public boolean compare(Box box) {
        if (totalWeight == box.totalWeight)
            return true;
        return false;
    }


    public List<T> getFruitList() {
        return fruitList;
    }


    void transferTo(Box box){

        for (T fruit: fruitList) {
            box.addFruit(fruit);
        }

        fruitList.clear();
    }

}
