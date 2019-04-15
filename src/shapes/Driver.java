/**
 * @author William Deprez
 * @date
 */
package shapes;
import java.util.Scanner;
import java.util.Locale;
import java.lang.StringBuilder;
class Driver {

    /**
     * Main method, manages user input and passes to Parser object to understand,
     * it then asks for further user input on what to do with the object.
     * @param args the System.in arguments for the program.
     */
    public static void main (String[] args) {
        if(args.length > 0) {
            switch(args[1].charAt(1)) {
                case 'h':
            }
        }

        Scanner scanner = new Scanner(System.in);
        String user;

        System.out.print("Enter your name: ");
        user = scanner.nextLine().trim();
        boolean valid = !(user.length() < 3); // Valid is true if user name is
        while(!valid) {
            String temp = user;
            System.out.print("That name is too short...\nplease enter a name greater than or equal to 3 characters: ");
            user = scanner.nextLine().trim();
            while(temp.equalsIgnoreCase(user)) {
                System.out.print("Please enter a different name: ");
                user = scanner.nextLine().trim();
            }
            valid = !(user.length() < 3);
        }
        StringBuilder greeter = new StringBuilder();
        greeter.append(String.format("Hello %s, welcome to William's interactive shape calculator!\n", user.substring(0, 1).toUpperCase(Locale.ENGLISH) + user.substring(1).toLowerCase()));
        greeter.append(new String(new char[greeter.length()-1]).replace('\0', '=') + '\n');
        greeter.append("To get a list of commands, type 'help', for further\ndocumentation... read the wiki!\n");
        flush(greeter);
        while(true) {
            System.out.print("> ");
            String cmd = scanner.nextLine();
            if(cmd.equalsIgnoreCase("circle")) {
                Circle circle;
                if(cmd.indexOf("r=") > 0) {

                } else {
                    System.out.print("Need radius to calculate circle...\nInput radius: ");
                    circle = new Circle(scanner.nextDouble());
                }
            } else if (cmd.equalsIgnoreCase("")) {

            }
        }

        /*
         * TODO:
         * Plan for ammending linebreak locations:
         * count chars between newline characters,
         * while any line of chars is longer than the ========= break,
         *  then move the line break one word backward
         *
         *  TODO:
         *  Implement buffered reader for shell input
         *
         *  TODO:
         *  Dynamic Bitset or vector<bool> for bits?
         *
         */
    }

    /**
     * Prints to standard out
     * @param sb StringBuilder who's toString is called (using toString to avoid multiple stream flushes and recreation of Strings)
     */
    private static void flush (StringBuilder sb) {
        System.out.print(sb.toString());
    }
}
