import java.util.Scanner;
public class PemilihanHariDenganIf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String dayType;
        System.out.print("Input day number: ");
        String number = sc.nextLine();

        switch (number) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                dayType = "Weekday";
            break;
            case "6":
            case "7":
                dayType = "Weekend";
            break;
            default:
                dayType = "Invalid Number";
        } System.out.println(number + " is a " + dayType);
    }
}
