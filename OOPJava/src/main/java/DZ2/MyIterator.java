package DZ2;

import java.util.Iterator;
import java.util.Random;
public class MyIterator implements Iterable<Integer>{

    Random rnd;
    private final int size;

    public MyIterator(int size){
        this.size = size;
        this.rnd = new Random();
    }



    @Override
    public Iterator<Integer> iterator() {
        return new Iterator() {
            private int counter = 1;
            @Override
            public boolean hasNext() {
                return counter <= size;
            }

            @Override
            public Integer next() {
                int num = rnd.nextInt(1,100);
                counter++;
                return num;
            }
        };
    }

    public static void main(String[] args) {
        MyIterator iter = new MyIterator(25);
        for (Integer integer : iter) {
            System.out.println(integer);
        }
    }
}
