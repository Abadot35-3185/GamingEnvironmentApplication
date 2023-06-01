import GameServer.GameServer;
import SocialPlatfrom.Social;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDatabase userDB = new UserDatabase();
        Scanner scanner = new Scanner(System.in);

        // REGISTRATION
        System.out.println("\t\t\t\t\t\t-----Sign Up your Account-----");
        System.out.print("Enter your Username: ");
        String username = scanner.nextLine();
        if (userDB.userExists(username)) {
            System.out.println("Username already exists. Please choose another one.");
            return;
        }

        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your E-mail: ");
        String email = scanner.nextLine();

        User user = new User(username, password, email);
        userDB.addUser(user);
        System.out.println("Registration successful!!!\n\n");

        // LOGIN
        System.out.println("\t\t\t\t\t\t\t-----Login Page-----");
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        if (userDB.validateUser(username, password)) {
            User u1 = new User();
            u1.test();

            while (true) {
                System.out.println("\t\t\t\t\t\t********************* BONY GAMER ZONE ********************");
                System.out.println("\t\t\t\t\t\t----------------------------------------------------------");
                System.out.println("1. Games list");
                System.out.println("2. Game Servers");
                System.out.println("3. Softwares and Modding Tools");
                System.out.println("4. Social Community");
                System.out.println("5. Helpline");
                System.out.println("6. Exit");

                System.out.print("\nEnter an Option: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {

                    case 1:
                        System.out.println("\nCHECK YOUR GAME TYPE---->>>\n" +
                                "1. Shooting Games\n" +
                                "2. Horror Games\n" +
                                "3. Sports Games\n" +
                                "4. Racing Games\n" +
                                "5. Puzzle Games\n" +
                                "6. Simulation Games\n" +
                                "More...");
                        break;

                    case 2:
                        GameServer team = new GameServer("", "", "", "", "", "");
                        team.code();
                        break;

                    case 3:
                        System.out.println("\nCLICK HERE TO DOWNLOAD---->>>\n" +
                                "\n * Steam – Best Gaming Library" +
                                "\n * Razer Cortex: Game Booster – Marks up the Gaming Performance" +
                                "\n * CPU-Z – System Information Software" +
                                "\n * F.lux – Protects you from the Blue Light" +
                                "\n * Team Speak – Top-notch communication facility" +
                                "\n * LogMeIn Hamachi – Covers your VPN needs" +
                                "\n * MSI Afterburner – Unleash the true potential of your GPU" +
                                "\n * Piriform CCleaner – Best Gaming Software in town");
                        break;

                    case 4:
                        System.out.println("\nChoose your Option\n" +
                                "\n 1. Profile" +
                                "\n 2. Add friends" +
                                "\n 3. ChatBox " +
                                "\n 4. Discord Server" +
                                "\n 5. Market Place" +
                                "\n 6. LIVE");
                        Social Socialteam = new Social("", "", "", "", "", "");
                        Socialteam.codesocial();
                        break;

                    case 5:
                        System.out.println("\nContact Us:" +
                                "\nE-mail: abadot35-3185@diu.edu");
                        break;

                        case 6:
                        System.out.println("Exiting the program...");
                        return;

                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                        break;
                }
            }
        }
    }
}