import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); //creating input capabilities
        System.out.print("enter the text to reverse: ");
        String txt=sc.nextLine(); // read ans store
        String r=""; // blank string
        for (int i=0;i<txt.length();i++){
            r=r+txt.charAt(txt.length()-i -1);
        }
        System.out.println("reversed text: "+r);
    }
}