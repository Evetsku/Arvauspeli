import java.util.Scanner;
public class Arvauspeli {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        String oikeanimi = "Emma";
        String nimi;

        System.out.println("Arvaa nimi!");

        do{
            System.out.println("Anna nimi!");
            nimi = in.nextLine();

            if (nimi.equals(oikeanimi)){
                System.out.println("Onnea!")
            }
        }


    }
}
