import java.util.Scanner;

public class PemilihanHariDenganIf07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dayName;
        String dayType;

        System.out.println("Input day name: ");
        dayName = sc.nextInt();

        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
            default:
                dayType = "Invalid";
        }
        System.out.println(dayName + " is a " + dayType);
    }
}
