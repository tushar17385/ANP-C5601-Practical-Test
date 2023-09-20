import java.util.Scanner;

// switch case Program
//Student name,student 10 scores
//score print as 85> A grade
// score print as75-85 -B grade
//score print as 65-75- c grade
//score print 50-60 - d grade
//Last output name and score
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        double[] sscore = new double[10];
        double tscore = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the marks of subject: ");
            sscore[i] = sc.nextDouble();
            tscore = tscore + sscore[i];
        }
        double Avg = tscore/10;
        char grade;
        switch ((int) Avg) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                System.out.println("Student Name:" + name);
                System.out.println("Student Total Score is" + tscore);
                System.out.println("Student Grade is A");
                break;
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:
            case 79:
            case 78:
            case 77:
            case 76:
            case 75:
                if (tscore >= 75 && tscore < 85) {
                    System.out.println("Student Name:" + name);
                    System.out.println("Student Total Score is" + tscore);
                    System.out.println("Student Grade is B");
                }
                break;
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:
                System.out.println("Student Name:" + name);
                System.out.println("Student Total Score is" + tscore);
                System.out.println("Student Grade is C");
                break;
            case 64:
            case 63:
            case 62:
            case 61:
            case 60:
            case 59:
            case 58:
            case 57:
            case 56:
            case 55:
            case 54:
            case 53:
            case 52:
            case 51:
            case 50:
                System.out.println("Student Name:" + name);
                System.out.println("Student Total Score is" + tscore);
                System.out.println("Student Grade is D");
                break;
            default:
                System.out.println("Student Name:" + name);
                System.out.println("Student Total Score is" + tscore);
                System.out.println("Student Grade is Fail");
        }
    }
}