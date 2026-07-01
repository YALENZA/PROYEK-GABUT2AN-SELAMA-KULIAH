import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random; //library untuk angka random

public class tebak_angka
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random pengacak = new Random();

        int min = 1;
        int max = 15;
        int angkaAcak = pengacak.nextInt(max - min + 1) + min;
        int nyawa = 5;
        
        System.out.println("GAME TEBAK ANGKA");
        System.out.println("RULE");
        System.out.println("1. Anda memiliki 5 nyawa");
        System.out.println("2. Anda diberikan kesempatan menebak sebanyak nyawa yang dimiliki");
        System.out.println("3. Jika anda salah menebak, maka nywa anda akan dkurangi sebanyak satu");
        System.out.println("4. Jika tebakan anda benar, maka anda menang");
        System.out.println("5. Rentang nilai yang ditebak dimulai dari 1 - 15");

        while (nyawa > 0 )
        {
            System.out.print("\n Masukkan tebakkan anda: ");
            
            try 
            {
                int tebakan = input.nextInt();
                input.nextLine();    

                if (tebakan == angkaAcak)
                {
                    System.out.println("SELAMAT TEBAKAN ANDA BENAR!!!");
                    break;
                } 
                
                else if (tebakan > angkaAcak)
                {
                    nyawa--;
                    System.out.println("Sayang sekali, nilai tebakan anda lebih besar dari nilai yang ditebak");
                    System.out.println("Nyawa anda tersisa " + nyawa);
                }

                else 
                {
                    nyawa--;
                    System.out.println("Sayang sekali, nilai tebakan anda lebih kecil dari nilai yang ditebak");
                    System.out.println("Nyawa anda tersisa " + nyawa);
                }
            } 
            
            catch (InputMismatchException e) 
            {
                System.out.println("Terdapat kesalahan input, silahkan ulangi lagi");
                input.nextLine();
            }

        }

        if (nyawa == 0) 
        {
            System.out.println("ANDA KALAH!!!");
            System.out.println("Angkanya adalah " + angkaAcak);
        }

        input.close();
    }
    
}

