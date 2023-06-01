package SocialPlatfrom;

import java.util.ArrayList;
import java.util.Scanner;

public class Social{
    public String OptionChoose;
    public String Task1;
    public String Task2;
    public String Task3;
    public String Task4;
    public String Task5;

    public Social(String OptionChoose, String Task1, String Task2, String Task3, String Task4, String Task5) {
        this.OptionChoose = OptionChoose;
        this.Task1 = Task1;
        this.Task2 = Task2;
        this.Task3 = Task3;
        this.Task4 = Task4;
        this.Task5 = Task5;
    }

    public final Scanner input = new Scanner(System.in);

    public void codesocial() {
        IncludedSocial IncludeSocial = new IncludedSocial();
        ArrayList<Social> Gamesocial = IncludedSocial.Included_social();


        System.out.print("Choose you option: ");
        this.OptionChoose = input.nextLine().toUpperCase();

        boolean isSocialFound = false;
        Social currentSocial = new Social("", "", "", "", "", "");


        for (int i=0 ; i < Gamesocial.size() ; i++) {
            if (!OptionChoose.equals(Gamesocial.get(i).OptionChoose.toUpperCase())) {
                isSocialFound = false;
            } else {
                isSocialFound = true;
                currentSocial = new Social(Gamesocial.get(i).OptionChoose, Gamesocial.get(i).Task1, Gamesocial.get(i).Task2,
                        Gamesocial.get(i).Task3, Gamesocial.get(i).Task4, Gamesocial.get(i).Task5);
                break;
            }
        }
        if (!isSocialFound) {
            System.out.println("Sorry!!! The option is not Correct");
        } else {

            System.out.println("\n"+currentSocial.Task1);
            System.out.println(currentSocial.Task2);
            System.out.println(currentSocial.Task3);
            System.out.println(currentSocial.Task4);
            System.out.println(currentSocial.Task5);
        }

    }
}