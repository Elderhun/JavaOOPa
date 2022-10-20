package DZ3;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Box<Fruit> boxF = new Box<>();
        boxF.addFruit(new Apple(1.5f));
        boxF.addFruit(new Orange(1.5f));

//        Apple Box

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        System.out.println(appleBox.getTotalWeight() + " Вес первой коробки");
        System.out.println(appleBox.isEmpty());


        Box<Apple> appleBox1 = new Box<>();
        appleBox1 = newBox(appleBox);

        System.out.println(appleBox.isEmpty());
        System.out.println(appleBox.getTotalWeight() + " Вес первой коробки после того как пересыпали");
        System.out.println(appleBox1.getTotalWeight() + " Вес новой коробки");

//        Orange Box

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        System.out.println(orangeBox.getTotalWeight());

        System.out.println(appleBox.compare(orangeBox));


//      Transfer box1 to box2 method Class Box.

        Box<Apple> b1 = new Box<>();
        b1.addFruit(new Apple(1.5));
        b1.addFruit(new Apple(1.5));
        System.out.println(b1.getTotalWeight() + " box 1");

        Box<Apple> b2 = new Box<>();
        b2.addFruit(new Apple(1.5));
        b2.addFruit(new Apple(1.5));
        System.out.println(b2.getTotalWeight() + " box 2");


        b1.transferTo(b2);
        System.out.println(b1.getTotalWeight() + " box 1");
        System.out.println(b2.getTotalWeight() + " box 2");


    }

    //  Transfer method in Main
    public static Box<Apple> newBox(Box<Apple> appleBox) {
        Box<Apple> appleBox1 = new Box<>();

        for (Apple ap : appleBox.getFruitList()) {
            appleBox1.addFruit(ap);
        }
        appleBox.getFruitList().clear();

        return appleBox1;
    }
}

