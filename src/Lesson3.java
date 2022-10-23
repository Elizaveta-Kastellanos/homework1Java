import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lesson3 {
    public long WorkTimeArrayList(){
        List<Integer> myList = new ArrayList<>();
        for (int i = 0;i < 10000;i++){
            myList.add(0,new Random().nextInt(-100,100));

        }
        long start = System.nanoTime();
        for (int i = 0; i < myList.size()/2;i++){
            int a = myList.get(new Random().nextInt(0, myList.size() - 1));
        }
        long end = System.nanoTime();
        return end - start;
    }

    public long WorkTimeLinkedList(){
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0;i < 10000;i++){
            myList.add(0,new Random().nextInt(-100,100));
        }
        long start = System.nanoTime();
        for (int i = 0; i < myList.size()/2;i++){
            int a = myList.get(new Random().nextInt(0, myList.size() - 1));
        }
        long end = System.nanoTime();
        return end - start;
    }
    // It is from the class program
//    Lesson3 ls3 = new Lesson3();
//    long t1 = ls3.WorkTimeArrayList();
//    long t2 = ls3.WorkTimeLinkedList();
//        System.out.println(t1 + "ns");
//        System.out.println(t2 + "ns");
//        System.out.println(t2-t1 + "ns");

}
