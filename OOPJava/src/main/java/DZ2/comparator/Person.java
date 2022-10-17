package DZ2.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int weight;
    private int height;




    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }


//    @Override
//    public int compareTo(Person o) {
//        if (this.name.compareTo(o.name)==0){
//            if(this.age == o.age) return 0;
//            else if(this.age > o.age) return 1;
//            else return -1;
//        }
//        return this.name.compareTo(o.name);
//    }



//    @Override
//    public int compareTo(Person o) {
//        if (this.name.compareTo(o.name)==0){
//            if(this.weight == o.weight) return 0;
//            else if(this.weight > o.weight) return 1;
//            else return -1;
//        }
//        return this.name.compareTo(o.name);
//    }



//    @Override
//    public int compareTo(Person o) {
//        if (this.name.compareTo(o.name)==0){
//            if(this.height == o.height) return 0;
//            else if(this.height > o.height) return 1;
//            else return -1;
//        }
//        return this.name.compareTo(o.name);
//    }


    @Override
    public int compareTo(Person o) {
         return this.name.length()-o.getName().length();
    }


    public static void main(String[] args) {
        ArrayList<Person> piple = new ArrayList<>();
        piple.add(new Person("Grigoriy", 25, 44, 144));
        piple.add(new Person("Ivan", 25, 44, 144));
        piple.add(new Person("Ivan", 25, 44, 123));
        piple.add(new Person("Dasha", 29, 23, 112));
        piple.add(new Person("Andrey", 23, 15, 183));
        piple.add(new Person("Dasha", 17, 27, 112));
        piple.add(new Person("Andrey", 22, 15, 181));
        piple.add(new Person("Ivan", 22, 29, 152));
        piple.add(new Person("Ivan", 56, 125, 211));
        piple.add(new Person("Dasha", 3, 15, 234));
        piple.add(new Person("Andrey", 15, 23, 234));
        piple.add(new Person("Dasha", 55, 56, 211));
        piple.add(new Person("Andrey", 2, 56, 186));
        piple.add(new Person("Yan", 2, 56, 186));
        Collections.sort(piple);
        System.out.println(piple);
    }
}
