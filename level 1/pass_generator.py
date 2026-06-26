import string
import random

karakter = string.ascii_letters 

pakai_angka = input("Gunakan angka? (Y/N):").upper()
if pakai_angka == "Y":
    karakter += string.digits

pakai_simbol = input("Gunakan simbol? (Y/N):").upper()
if pakai_simbol == "Y":
    karakter += string.punctuation

password_final = ""

while True:
    input_panjang = input("masukkan panjang password (min: 8): ")
    panjang = int(input_panjang)

    if panjang < 8:
        print("Panjang password minimal 8 karakter.")
    else:
        break

for i in range(panjang):
    random_karakter = random.choice(karakter)
    password_final += random_karakter

print("Password yang dihasilkan:", password_final)

