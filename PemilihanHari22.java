import java.util.Scanner;

public class PemilihanHari22 {

    public static void main(String[] args) {
        Scanner utill = new Scanner(System.in);
        String dayName,dayType;
        System.out.println("Input day name:");
        dayName = utill.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekend";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
                
            default:
                dayType = "invalid day name";
        }
        System.out.println(dayName + "is a" + dayType);
    }
    
}