import java.util.Scanner;
import java.util.InputMismatchException;

public class kasir_mini
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hargaTotal = 0;

        System.out.println("=== Sistem Kasir ===");
        System.out.println("(Ketik 0 untuk selesai)");
        
        while(true)
        {
            try 
            {
                System.out.print("Masukkan harga barang: ");
                int harga = input.nextInt();
                input.nextLine();  

                hargaTotal += harga;
               
                if (harga == 0)
                {
                    System.out.println("Total belanja anda: Rp " + hargaTotal);
                    break;
                }
            } 
            
            catch (InputMismatchException e) 
            {
                System.out.println("Input tidak valid, masukkan angka aja");
                input.nextLine();
            }
        }
        input.close();  
    }    
}
