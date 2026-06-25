import os

# ngmabil lokasi
lokasi_sekarang = os.getcwd()

# baca isi folder
isi_folder = os.listdir(lokasi_sekarang)

for item in isi_folder:

    if os.path.isfile(item):
        nama, ekstensi = os.path.splitext(item)
        print("nama", nama, "| ekstensi:", ekstensi)

