import os #library buat akses sistem operasi
import shutil # library buat mindahin file

# dictionary untuk menyimpan ekstensi file dan folder tujuan
sortingan_folder = {
    ".jpg": "images",
    ".png": "images",
    ".pdf": "documents",
    ".docx": "documents",
    ".txt": "Notes",
    ".mp4": "Videos"
}

# ngamabil lokasi sekarang
lokasi_sekarang = os.getcwd()

# baca isi folder
isi_folder = os.listdir(lokasi_sekarang)

for item in isi_folder:
    if os.path.isfile(item):
        # misahin nama file dan ekstensinya 
        nama, ekstensi = os.path.splitext(item)

        # pencegahan jika ekstensi tidak ada di dictionary
        folder_tujuan = sortingan_folder.get(ekstensi, "lainnya")
        # ngebuat folder baru kalo folder tujuan belum ada
        os.makedirs(folder_tujuan, exist_ok=True)
        # ngegabungin lokasi sekarang sama nama file buat alamat asal dan tujuan
        alamat_asal = os.path.join(lokasi_sekarang, item)
        # ngegabungin lokasi sekarang sama nama folder tujuan sama nama file buat alamat tujuan
        alamat_tujuan = os.path.join(lokasi_sekarang, folder_tujuan, item)
        # perpindahan file
        shutil.move(alamat_asal, alamat_tujuan)

        print(f"File {item} akan dipindahkan ke folder {folder_tujuan}")



