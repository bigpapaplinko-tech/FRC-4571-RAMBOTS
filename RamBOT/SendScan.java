import java.util.Scanner;

public class SendScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an FRC team number in the console: ");
        String teampicker = scanner.nextLine();
        
        CallScan.displayTeam(teampicker.trim());
        
        scanner.close();
    }
}
