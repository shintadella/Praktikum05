import java.util.Scanner;

public class PemilihanHariDenganIf {
    
    public static void main(String[] args) {
        Scanner utill = new Scanner(System.in);
        String dayType;
        byte dayNumber;
        System.out.println("Input day number 1-5");
        System.out.println("Input day Number 6-7");

        dayNumber= utill.nextByte();
        dayType ="";
        
        if (dayNumber>=1 && dayNumber <=5) {
            dayType="Weekday";
        }
        else if (dayNumber>=6 && dayNumber<=7) {
            dayType="Weekend";
        }
        else {
            dayType= "invalid Number!";
        }
        
        System.out.println(dayNumber + "is a" + dayType);
        utill.close();
    }
}
