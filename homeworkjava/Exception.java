package exeptiondeal;
import java.util.*;
public class ExeptionDeal {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double []array = new double [100];
       int number = 0;
       boolean continueInput = false;
       for (int i =0; i < 100; i++)
           array[i] = Math.random();
        do{
        try{
            System.out.println("please input index:");
            number = input.nextInt();
            System.out.println(array[number]);
            break;
        }
        catch(InputMismatchException ex1){
            System.out.println("Input Mismatch.");
            input.next(); //�ú������������input�����¿�ʼһ���µ�input
           continue;
        }
        catch(IndexOutOfBoundsException ex2){
            System.out.println("Out of Bounds.");
            continue;
        }
        
        }while(true);   
        
    }
}
