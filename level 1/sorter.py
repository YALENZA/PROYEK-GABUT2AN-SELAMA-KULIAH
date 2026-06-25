import os

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
        print("nama", nama, "| ekstensi:", ekstensi)

        # pencegahan jika ekstensi tidak ada di dictionary
        folder_tujuan = sortingan_folder.get(ekstensi, "lainnya")
        print(f"File {item} akan dipindahkan ke folder {folder_tujuan}")



