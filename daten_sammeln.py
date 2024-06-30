mport requests
import random
import time

while True:
    messwert = f"Messwert-{random.randint(1, 100)}"
    daten = {"messwert": messwert}
    response = requests.post("http://<VM_IP>:8080/api/daten", json=daten)
    print(response.status_code, response.json())
    time.sleep(60)  # 60 Sekunden Pause1~0~mport requests
import random
import time

while True:
    messwert = f"Messwert-{random.randint(1, 100)}"
    daten = {"messwert": messwert}
    response = requests.post("http://<VM_IP>:8080/api/daten", json=daten)
    print(response.status_code, response.json())
    time.sleep(60)  # 60 Sekunden Pause
