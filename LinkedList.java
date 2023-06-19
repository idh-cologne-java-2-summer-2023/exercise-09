import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestLinkedList {
    public static List<Integer> generateRandomList(int size) {
        List<Integer> randomList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNum = random.nextInt(2);
            randomList.add(randomNum);
        }

        return randomList;
    }

    public static List<Integer> insertRandomNumbers(List<Integer> list, int count) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(list.size() + 1);
            int randomNumber = random.nextInt();
            list.add(randomIndex, randomNumber);
        }

        return list;
    }
}