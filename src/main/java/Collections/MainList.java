package Collections;
import java.util.LinkedList;
import java.util.ArrayList;

public class MainList {

    public static void main(String[] args) {
        int i = 3;
/*
        Integer val = Integer.valueOf(i);
        ArrayList<Integer> intList = new ArrayList<>();

        intlist.add(Integer.value(1));
        intList.add(Integer.value(2));

        intList.add(val);



        //intList.add(val);

        for ( Integer ints : intList )
            System.out.println( ints + " ");

 */


        //String ArrayList

        ArrayList<String> arrList1 = new ArrayList<>();

        arrList1.add("E1");
        arrList1.add("E2");
        arrList1.add("E3");

        System.out.println(arrList1);
        arrList1.forEach(e -> System.out.println(e));  // Lambda expression

        arrList1.remove("E2");
        System.out.println(arrList1);

        //Check for an element
        if (arrList1.contains("E3")) {
            System.out.println("E3 exists");

        }
        //Check if the list is empty

        if(arrList1.isEmpty()){
            System.out.println("The lis is empty");

        }
        else {
            System.out.println("The lis is not empty");

        }

        //2. LinkedList

        LinkedList<Integer> lnkList1 = new LinkedList<>();

        lnkList1.add(0);
        lnkList1.add(1);
        lnkList1.add(2);
        System.out.println(lnkList1);
        lnkList1.remove(1);


        lnkList1.clear();
        lnkList1.offer(0);
        lnkList1.offer(1);
        lnkList1.offer(2);
        System.out.println(lnkList1);

        lnkList1.clear();
        lnkList1.offer(0);
        lnkList1.offer(1);
        lnkList1.offer(2);
        lnkList1.offer(1);

        System.out.println(lnkList1.poll());
        System.out.print(lnkList1);

        System.out.println(lnkList1.poll());
        System.out.println(lnkList1);



    }


}
