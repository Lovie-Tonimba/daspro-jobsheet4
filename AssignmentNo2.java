import java.util.Scanner;
public class AssignmentNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter attack distance: ");
        int range = sc.nextInt();
        
        if (range<5)  {
            System.out.println("Melee weapons");
        } else if (range>=5 && range<=1000) {
            System.out.println("Ranged weapons");
        } else {
            System.out.println("cannot identify");
        }
    }
}