import java.util.Scanner;
public class SIAKAD10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String NIM;
        String kelas;
        byte attendanceNumber;
        double quizScore;
        double assignmentScore; 
        double utsScore;
        double uasScore;
        double finalScore;

        System.out.print("Enter name                : ");
        name = sc.nextLine();
        System.out.print("Enter NIM                 : ");
        NIM = sc.nextLine();
        System.out.print("Enter class               : ");
        kelas = sc.nextLine();
        System.out.print("Enter attendance number   : ");
        attendanceNumber = sc.nextByte();
        System.out.print("Enter quiz score          : ");
        quizScore = sc.nextDouble();
        System.out.print("Enter assignment score    : ");
        assignmentScore = sc.nextDouble();
        System.out.print("Enter uts score           : ");
        utsScore = sc.nextDouble();
        System.out.print("Enter uas score           : ");
        uasScore = sc.nextDouble();
        
        finalScore = ((quizScore * 0.20) + (assignmentScore * 0.15) + (utsScore * 0.30) + (uasScore * 0.35));
  
        System.out.println("Student with " + name + " NIM: " + NIM);
        System.out.println("Class: " + kelas + " Attendance number: " + attendanceNumber);
        System.out.println("Final score               : " + finalScore);

        if (finalScore>80 && finalScore<=100) {
            System.out.println("Final Score Letter  : A");
            System.out.println("Qualification       : Sangat Baik");
        }else if (finalScore>73 && finalScore<=80) {
            System.out.println("Final Score Letter  : B+");
            System.out.println("Qualification       : Lebih dari Baik");
        }else if (finalScore>65 && finalScore<=73) {
            System.out.println("Final Score Letter  : B");
            System.out.println("Qualification       : Baik");
        }else if  (finalScore>60 && finalScore<=65) {
            System.out.println("Final Score Letter  : C+");
            System.out.println("Qualification       : Lebih dari Cukup");
        }else if (finalScore>50 && finalScore<=60) {
            System.out.println("Final Score Letter  : C");
            System.out.println("Qualification       : Cukup ");
        }else if (finalScore>39 && finalScore<=50) {
            System.out.println("Final Score Letter  : D");
            System.out.println("Qualification       : Kurang");
        }else if (finalScore<=39) {
            System.out.println("Final Score Letter  : E");
            System.out.println("Qualification       : Gagal");
        }else {
            System.out.println("The final score cannot to be identify");
        }
    }
}