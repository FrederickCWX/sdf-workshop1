package cart;
import java.util.*;;

public class DataStructure {

  public static void main(String[] args) {
    System.out.println("Data Structure");
    List<Integer> intList = new LinkedList<Integer>();

    intList.add(Integer.parseInt("12"));
    intList.add(15);
    intList.add(3);
    intList.add(1, 109);

    System.out.println(intList);

    for(int i=0;i<intList.size();i++){
      System.out.printf("idx: %d \n", i);
      System.out.printf("Val: %d \n", intList.get(i));
    }
  }
  
}
