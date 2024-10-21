import java.util.Scanner;
public class Arvauspeli {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        String oikeanimi = "Emma";
        String nimi;
        int arvaustenMaara = 0;

        do{
            System.out.println("Arvaa nimi!");
            nimi = in.nextLine();
            arvaustenMaara++;

            if (nimi.equalsIgnoreCase("loppu")){
                System.out.println("Peli loppui.");
                break;
            }
            if (nimi.equals(oikeanimi)){
                System.out.println("Onnea, arvasit oikein " + arvaustenMaara + ". yrityksellä!");
            } else {
                System.out.println("Väärin, yritä uudelleen.");
            }
        } while (!nimi.equals(oikeanimi));


    }
}
