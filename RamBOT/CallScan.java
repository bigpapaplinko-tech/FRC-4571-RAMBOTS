import javax.swing.JOptionPane;

// Make sure file name is Call.java and class name is Call
public class CallScan {
    
    public static void displayTeam(String teamNumber) {
        String message;
        
        switch (teamNumber) {
            case "254":
                message = "Team 254 (The Cheesy Poofs)\nLocation: San Jose, CA\nFun Fact: World championship regulars.";
                break;
            case "118":
                message = "Team 118 (The Robonauts)\nLocation: League City, TX\nFun Fact: Built alongside NASA engineers.";
                break;
            case "1678":
                message = "Team 1678 (Citrus Circuits)\nLocation: Davis, CA\nFun Fact: Known for flawless scouting systems.";
                break;
            default:
                message = "Team " + teamNumber + " not found in the system. Try 254, 118, or 1678.";
                break;
        }
        
        JOptionPane.showMessageDialog(null, message, "FRC Team Lookup", JOptionPane.INFORMATION_MESSAGE);
    }
}
