import string
import random

# karakter nerima semua huruf alfabet (besar dan kecil)
karakter = string.ascii_letters 

# bisa pakai angka
pakai_angka = input("Gunakan angka? (Y/N):").upper()
if pakai_angka == "Y":
    karakter += string.digits

#bisa pakai simbol
pakai_simbol = input("Gunakan simbol? (Y/N):").upper()
if pakai_simbol == "Y":
    karakter += string.punctuation

# sengaja kosong biar ntar bisa bikin pw otomatis (wadahnya) 
password_final = ""

# fungsi validasi panjang password
while True:
    try:
        input_panjang = input("masukka_genen panjang password (min: 8): ")
        panjang = int(input_panjang)

        if panjang < 8:
            print("Panjang password minimal 8 karakter.")
        else:
            break
    except ValueError:
        print("Silakan masukkan angka yang valid.")

# menghasilkan password berdasarkan panjang yang dimasukkan
for i in range(panjang):
    random_karakter = random.choice(karakter)
    password_final += random_karakter

print("Password anda:", password_final)

