package webanalyz;
import java.util.Scanner;
import java.util.ArrayList;
public class Webanalyz {
    public static void main(String[] args) {
       try {
                java.net.URL url = new java.net.URL("http://www.xmu.edu.cn/");
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext()){
                    String line = input.nextLine();
                     if(line.contains("¿ìËÙÁ´½Ó"))
                         break;
                }
               int num = 1;
                while (input.hasNext()) {
                    String line = input.nextLine();
                    if (line.contains("</ul>"))
                        break;
                    if(line.contains("href=\"")){
                        int index1 = line.indexOf("</i>");
                        int index2 = line.indexOf("</a>");
                        int index3 = line.indexOf(" href=");
                        int index4 = line.indexOf("\" target=");
                        System.out.print("["+num+"]");
                        num++;
                        for(int i=index1+4;i<index2;i++)
                            System.out.print(line.charAt(i));
                        for(int i=index3+7;i<index4;i++)
                            System.out.print(line.charAt(i));
                        System.out.println();

                }
               
       }
       }
       catch (java.net.MalformedURLException ex) {
           System.out.println("Invalid URL");
       } 
       catch (java.io.IOException ex) {
           System.out.println("I/O Errors: no such file");
       }
    }
}
