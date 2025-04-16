import java.util.Scanner;
class FirmVacation extends Employee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        String staff;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your field: ");
        staff = scanner.nextLine();
        if (staff.equals("cleaner")) {
            emp.Cleaner();
        } else if (staff.equals("manager")) {
            emp.Manager();
        }
        else if (staff.equals("worker")) {
            emp.worker();
        }
        else if (staff.equals("receptionist")) {
            emp.Receptionist();
        }
        else {
            System.out.println("access denied");
        }
    }
}
