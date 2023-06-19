import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        //TreeList
        List<Integer> hundredThousandsList = TestTreeList.generateRandomList(100000);
        List<Integer> updatedList = TestTreeList.insertRandomNumbers(hundredThousandsList, 10000);
        System.out.println(updatedList);

        //ArrayList
        List<Integer> arrayList = TestArrayList.generateRandomList(100000);
        List<Integer> updatedArrayList = TestArrayList.insertRandomNumbers(arrayList, 10000);
        System.out.println("ArrayList: " + updatedArrayList);

        //LinkedList
        List<Integer> linkedList = TestLinkedList.generateRandomList(100000);
        List<Integer> updatedLinkedList = TestLinkedList.insertRandomNumbers(linkedList, 10000);
        System.out.println("LinkedList: " + updatedLinkedList);
    }
}