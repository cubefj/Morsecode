import java.util.Scanner;


public class main {
    public static void main(String args[]) {
        double version = 0.12;
        final var stone_version = true;
        var all_text = "";
        String About_description =
                """
                Morse code™ V0.1 Pre-alpha
                All rights reserved
                
                The fun program for coding or texting(lol new word) of morse code
                By cubefj""";


        System.out.println("Morse code version:" + version + "\n"); // Version output
        System.out.println("Client Hello! \n"); // TODO: Add Connection to the remote cloud server

        Scanner action = new Scanner(System.in);
        System.out.println(" 1 - Morse coding\n 2 - About\n 3 - Exit");
        int action_do = action.nextInt();

        if (action_do == 1){
            while (true){
                System.out.println("All text is: " + all_text + "\n");
                Scanner enter_text = new Scanner(System.in);
                String text = enter_text.nextLine();
                if ("b".equals(text)) {
                    if (!all_text.isEmpty()) {
                        all_text = all_text.substring(0, all_text.length() - 1);
                    }
                } else if ("q".equals(text)) {
                    System.exit(0);
                }
                else {
                    all_text += text;
                }
            }
        } else if (action_do == 2){
            System.out.println(About_description);
        } else if (action_do == 3){
            System.out.println("Goodbye!");
            System.exit(0);
        }

    }
}