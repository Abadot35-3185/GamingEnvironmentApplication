package GameServer;

import java.util.ArrayList;

public class IncludedGame{
    ArrayList<GameServer> Game = new ArrayList<GameServer>();
    public ArrayList<GameServer> Included_Game(){
        Game.add(new GameServer("Call Of Duty","21.41.88.424:24567","51.38.60.53:27015",
                "74.91.120.145:27020","139.144.176.22:27128","64.94.100.200:28960"));

        Game.add(new GameServer("Counter Strike","51.81.48.224:14567","51.38.60.53:27015",
                "74.91.120.145:24010","139.144.176.22:20139","64.94.100.225:28960"));

        Game.add(new GameServer("Battlefield","51.81.48.224:14567","51.38.60.53:27015",
                "74.91.120.145:27020","139.144.176.22:27128","64.94.100.200:28960"));

        Game.add(new GameServer("Half Life","51.81.48.224:14567","51.38.60.53:27015",
                "74.91.120.145:27020","139.144.176.22:27128","64.94.100.200:28960"));

        Game.add(new GameServer("Team Fortress","51.81.48.224:14567","51.38.60.53:27015",
                "74.91.120.145:27020","139.144.176.22:27128","64.94.100.200:28960"));

        Game.add(new GameServer("Battalion","51.81.48.224:14567","18.98.65.43:81014",
                "71.20.120.249:37040","130.184.176.22:21029","14.44.109.150:26900"));

        return Game;
    }
}
