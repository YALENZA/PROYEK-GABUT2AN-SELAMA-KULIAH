import java.util.ArrayList;
import java.util.Scanner;

public class Todolist{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> daftarTugas = new ArrayList<>();

        while (true) {
            System.out.println("APLIKASI TO-DO LIST SEDERHANA");
            System.out.println("1. Cek Tugas");
            System.out.println("2. Tambah Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1){
                System.out.println("Cek Tugas: ");
                if (daftarTugas.isEmpty()){
                    System.out.println("Daftar tugas ada saat ini sedang kosong");
                
                } else {
                    for (int i = 0; i < daftarTugas.size(); i++){
                        System.out.println((i+1) + ". " + daftarTugas.get(i));
                    }
                }

            } else if (pilihan == 2){
                System.out.print("Tambahkan Tugas: ");
                String tugasBaru = input.nextLine();
                daftarTugas.add(tugasBaru);

                System.out.println("Tugas " + tugasBaru + " telah berhasil ditambahkan");
            
            } else if (pilihan == 3) {
                if (daftarTugas.isEmpty()) {

                
                } else {
                    for (int i = 0; i < daftarTugas.size(); i++){
                        System.out.println((i+1) + ". "+ daftarTugas.get(i));
                    }
                    System.out.print("Pilih Daftar Tugas yang Ingin Dihapus: ");
                    int nomorUrutan = input.nextInt();
                    input.nextLine();

                    int urutan = nomorUrutan - 1;
                    daftarTugas.remove(urutan);
                
                }     
            
            } else if (pilihan == 4 ) {
                break;
            
            } else {
                System.out.println("Pilihan tidak tersedia, silahkan ulangi pilihan");
            }
        }
        input.close();
    }
}