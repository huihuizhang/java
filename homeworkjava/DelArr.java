package delarray;
import java.util.*;
public class DelArray {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    System.out.println("���������飺");
    list.add(input.nextInt());
    while(input.hasNextInt()){
        list.add(input.nextInt());
    }
    removeDuplicate(list);
    System.out.println("�õ��Ĳ��ظ�����Ϊ��");
C
C
     for (int i = 0; i < list.size()-1; i++){
         System.out.print(list.get(i) + "  ");
     }
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size()-1; i++){
            for ( int j = i+1; j < list.size()-1; j++){
                if(list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
    }
}
