import java.util.Scanner;
public class Arvauspeli {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        String oikeanimi = "Emma";
        String nimi;


        do{
            System.out.println("Arvaa nimi!");
            nimi = in.nextLine();

            if (nimi.equals(oikeanimi)){
                System.out.println("Onnea!");
            } else {
                System.out.println("Väärin, yritä uudelleen.");
            }
        } while (!nimi.equals(oikeanimi));


    }
}
