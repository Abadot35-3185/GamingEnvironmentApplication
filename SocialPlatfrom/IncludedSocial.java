package SocialPlatfrom;
import java.util.ArrayList;

public class IncludedSocial{
    static ArrayList<Social> Gamesocial = new ArrayList<Social>();
    public static ArrayList<Social> Included_social(){
        Gamesocial.add(new Social("1","Name: Abadot Hossain Khan","GameID: #8130",
                "Birthdate: 2 February 2002","Friends list","Photos, Videos, Posts"));

        Gamesocial.add(new Social("2","Rahid Hassan ---> [Add friend][View Profile]","Mera Sinha ---> [Add friend][View Profile]",
                "John Day ---> [Add friend][View Profile]","Linda Amanda ---> [Add friend][View Profile]",">>More...<<<"));

        Gamesocial.add(new Social("3","------Chats------","Eyeasin Arafat",
                "Battle Of Nerves","Alamin Mustaq","বাংলা গেম গ্রুপ"));

        Gamesocial.add(new Social("4","You've been invited to join",">>>BONYGAMERZONE Server<<<",
                "6,156,790 Online","10,518,429 Members","[ACCEPT INVITE]"));

        Gamesocial.add(new Social("5","--->LAPTOPS, PC","--->Gaming PHONES",
                "--->GADGETS","--->OFFICE EQUIPMENTS",">>More...<<<"));

        Gamesocial.add(new Social("6","o Mr. Tripple R LIVE","o Fuga Gaming LIVE",
                "o Darkz Modez Gamerboy LIVE","o Dj Gaming LIVE",">>More...<<<"));

        return Gamesocial;
    }
}

