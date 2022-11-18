import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListConcept {

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<>(5);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(60);

        System.out.println("First value of array is = "+ a.get(0));

        a.stream().forEach(integer  -> System.out.println(a));


         }




    }

