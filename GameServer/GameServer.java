package GameServer;

import java.util.ArrayList;
import java.util.Scanner;

public class GameServer{
    public String GameName;
    public String Server1;
    public String Server2;
    public String Server3;
    public String Server4;
    public String Server5;

    public GameServer(String GameName, String Server1, String Server2, String Server3, String Server4, String Server5) {
        this.GameName = GameName;
        this.Server1 = Server1;
        this.Server2 = Server2;
        this.Server3 = Server3;
        this.Server4 = Server4;
        this.Server5 = Server5;
    }

    public final Scanner input = new Scanner(System.in);

    public void code() {
        IncludedGame IncludedGame = new IncludedGame();
        ArrayList<GameServer> Game = IncludedGame.Included_Game();


        System.out.print("Enter the exact Game Name: ");
        this.GameName = input.nextLine().toUpperCase();

        boolean isGameServerFound = false;
        GameServer currentGameServer = new GameServer("", "", "", "", "", "");


        for (int i=0 ; i < Game.size() ; i++) {
            if (!GameName.equals(Game.get(i).GameName.toUpperCase())) {
                isGameServerFound = false;
            } else {
                isGameServerFound = true;
                currentGameServer = new GameServer(Game.get(i).GameName, Game.get(i).Server1, Game.get(i).Server2,
                        Game.get(i).Server3, Game.get(i).Server4, Game.get(i).Server5);
                break;
            }
        }
        if (!isGameServerFound) {
            System.out.println("Sorry!!! The Game is not included or The Game is not Correct");
        } else {

            System.out.println("Server-1 (USA): " + currentGameServer.Server1);
            System.out.println("Server-2 (UK): " + currentGameServer.Server2);
            System.out.println("Server-3 (Germany): " + currentGameServer.Server3);
            System.out.println("Server-4 (Japan): " + currentGameServer.Server4);
            System.out.println("Server-5 (China): " + currentGameServer.Server5);
        }

    }
}

