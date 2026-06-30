import java.util.ArrayList; //library untuk array, biar bisa nymipan data
import java.util.Scanner; // library untuk input
import java.util.InputMismatchException; // library biar terhindar dari kesalahan input yang tak cocok

public class Todolist
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // definisi input
        ArrayList<String> daftarTugas = new ArrayList<>(); // definisi tempat nyimpan data melalui array

        while (true) // perulangan selagi ngga ditutup aplikasinya
        {
            System.out.println("APLIKASI TO-DO LIST SEDERHANA");
            System.out.println("1. Cek Tugas");
            System.out.println("2. Tambah Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            // kalau misalnya salah, dia akan coba ulang lagi
            try
            {
                int pilihan = input.nextInt();
                input.nextLine(); 

                if (pilihan == 1)
                {
                    System.out.println("Cek Tugas: ");
                    if (daftarTugas.isEmpty()) // cek isinya kosong atau engga
                    {
                        System.out.println("Daftar tugas ada saat ini sedang kosong");
                    
                    } 
                    else 
                    {
                        for (int i = 0; i < daftarTugas.size(); i++) // perulangan untuk ngeluarin penomoran berdasarkan isi array daftar tugas
                        {
                            System.out.println((i+1) + ". " + daftarTugas.get(i)); // ynag get(i) itu untuk ambil data dari array
                        }
                    }

                } 
                
                else if (pilihan == 2)
                {
                    System.out.print("Tambahkan Tugas: ");
                    String tugasBaru = input.nextLine(); // tempat nyimpan data sementara sebelum dimaukin ke array daftar tugas
                    daftarTugas.add(tugasBaru); // menambahkan data yang diinput ke array tugas 

                    System.out.println("Tugas " + tugasBaru + " telah berhasil ditambahkan");
                
                }

                else if (pilihan == 3) 
                {
                    if (daftarTugas.isEmpty()) 
                    {
                        System.out.println("Daftar Tugas saat ini sedang Kosong");
                    } 
                    else 
                    {
                        while (true) 
                        {
                            for (int i = 0; i < daftarTugas.size(); i++)
                            {
                                System.out.println((i+1) + ". "+ daftarTugas.get(i));
                            }
                            System.out.print("Pilih Daftar Tugas yang Ingin Dihapus: ");
                            int nomorUrutan = input.nextInt();
                            input.nextLine();

                            if (nomorUrutan > 0 && nomorUrutan <= daftarTugas.size()) // validasi agar user hanya milih berdsarkan pilihan yang tertera
                            {
                                int urutan = nomorUrutan - 1;
                                daftarTugas.remove(urutan);
                                break;
                            }
                            else
                            {
                                System.out.println("Pilihan tidak tersedia");
                            }
                        }
                    
                    }     
                
                } 
                else if (pilihan == 4 ) 
                {
                    break;
                
                } 
                else 
                {
                    System.out.println("Pilihan tidak tersedia, silahkan ulangi pilihan");
                }
            } 
            catch (InputMismatchException e) // ini yang bikin aplikasinya ngga langsung ketutp gegara salah format input
            {
                System.out.println("Terdapat kesalahan input, silahkan ulangi lagi");
                input.nextLine();
            }
        }
        input.close(); // tambahan aja, biar memorinya ngga bocor
    }
}

