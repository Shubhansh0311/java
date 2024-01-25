import java.util.*;

public class Tut2_linkedListColl {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // System.out.println(list);
        // list.add("i");

        // list.add("am");
        // list.addLast("shubhansh");
        // System.out.println(list);
        // System.out.println(list.size());
        // list.removeFirst();
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
        // list.addFirst("i");
        // list.add("shubhansh");
        // System.out.println(list);
        // for (int i=0;i<list.size();i++) {
        // System.out.print(list.get(i)+" -> ");

        // }
        // System.out.print("Null");
        // removing element at the particular index
        // list.removeFirst();
        // list.remove(2);//inside bracket add index number
        // System.out.println();
        // System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(7);
        list1.add(3);
        list1.add(8);
        list1.add(2);
        list1.add(3);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " -> ");

        }
        System.out.println("null");

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == 7) {
                System.out.println("the element is found at the index number : " + i);
                break;
            }

        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element for linked list in the range of 1-50");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            list2.add(n);
        }
        System.out.println("the list two looks like");
        for (int i = 0; i <list2.size(); i++) {
            System.out.print(list2.get(i) + " -> ");
        }
        System.out.println();
        System.out.println("deleting element whose value is greater than 25");
        for (int i = 0; i <list2.size(); i++) {
         for (int j = i+1; j <list2.size()-1; j++) {
            if (list2.get(i) >= 25) {
                // System.out.println(list2.get(i));
                list2.remove(list2.get(i) );
            }
            
         }
        }
        System.out.println("list after deletion");

        System.out.print(list2 + " -> ");
    }
}
