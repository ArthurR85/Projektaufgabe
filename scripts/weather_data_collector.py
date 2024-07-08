import requests
import mysql.connector
from datetime import datetime

# URL der Wetter-API
API_URL = "https://api.openweathermap.org/data/2.5/weather?q=Wangen im Allgäu&appid=YOUR_API_KEY"

# MySQL-Datenbankkonfiguration
DB_CONFIG = {
    'user': 'your_db_user',
    'password': 'your_db_password',
    'host': 'localhost',
    'database': 'your_db_name',
}

def fetch_weather_data():
    response = requests.get(API_URL)
    return response.json()

def save_weather_data(weather_data):
    connection = mysql.connector.connect(**DB_CONFIG)
    cursor = connection.cursor()

    city = weather_data['name']
    temperature = weather_data['main']['temp']
    humidity = weather_data['main']['humidity']
    wind_speed = weather_data['wind']['speed']
    timestamp = datetime.now().strftime('%Y-%m-%d %H:%M:%S')

    query = ("INSERT INTO weather_data (city, temperature, humidity, wind_speed, timestamp) "
             "VALUES (%s, %s, %s, %s, %s)")
    data = (city, temperature, humidity, wind_speed, timestamp)

    cursor.execute(query, data)
    connection.commit()

    cursor.close()
    connection.close()

if __name__ == "__main__":
    weather_data = fetch_weather_data()
    save_weather_data(weather_data)
