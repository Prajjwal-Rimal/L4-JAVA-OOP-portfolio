import java.util.Scanner;
class Employee {
    void Cleaner(){
        Scanner inp =new Scanner(System.in);
        System.out.println("enter the number of days u have came to the office");
        int roll=inp.nextInt();
        if (roll>25) {
            System.out.println("u can have vacation");
        }
        else{
            System.out.println("request denied");
        }
    }
    void Manager(){
        Scanner inp =new Scanner(System.in);
        System.out.println("enter the number of days u have came to the office");
        int roll=inp.nextInt();
        if (roll>15) {
            System.out.println("u can have vacation");
        }
        else{
            System.out.println("request denied");
        }
    }
    void worker(){
        Scanner inp =new Scanner(System.in);
        System.out.println("enter the number of days u have came to the office");
        int roll=inp.nextInt();
        if (roll>29) {
            System.out.println("u can have vacation");
        }
        else{
            System.out.println("request denied");
        }
    }
    void Receptionist(){
        Scanner inp =new Scanner(System.in);
        System.out.println("enter the number of days u have came to the office");
        int roll=inp.nextInt();
        if (roll>45) {
            System.out.println("u can have vacation");
        }
        else{
            System.out.println("request denied");
        }
    }
}

