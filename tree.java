import java.util.*;

import org.apache.commons.collections4.list.TreeList;

public class tree {
	
	public static void main(String[] args) {
        List<Integer> treeList = new TreeList<Integer>();
        Random random = new Random();

        
        for (int a = 0; a < 100000; a++) {
            treeList.add(random.nextInt());
        }

       
        for (int b = 0; b < 10000; b++) {
            int randomNumber = random.nextInt();
            int randomIndex = random.nextInt(treeList.size());
            
            treeList.add(randomIndex, randomNumber);
        }

        System.out.println("Die Listenlänge beträgt: " + treeList.size());
    }
}
}
