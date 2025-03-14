from flask import Flask, jsonify
import json
import os

app = Flask(__name__)

# Funktion zum Laden von JSON-Daten
def load_json(file_path):
    try:
        with open(file_path, "r") as file:
            data = json.load(file)
            return data
    except Exception as e:
        return {"error": str(e)}

# API-Endpunkt für die "IO_data.json"-Datei
@app.route('/IO_data', methods=['GET'])
def get_io_data():
    data = load_json("/workspace/transfer/tmp/data/IO_data.json")
    if "error" in data:
        return jsonify(data), 500
    return jsonify(data)

# API-Endpunkt für die "resistanceValue_data.json"-Datei
@app.route('/resistanceValue_data', methods=['GET'])
def get_resistance_value_data():
    data = load_json("/workspace/transfer/tmp/data/resistanceValue_data.json")
    if "error" in data:
        return jsonify(data), 500
    return jsonify(data)

# API-Endpunkt für die "temperature_data.json"-Datei
@app.route('/temperature_data', methods=['GET'])
def get_temperature_data():
    data = load_json("/workspace/transfer/tmp/data/temperature_data.json")
    if "error" in data:
        return jsonify(data), 500
    return jsonify(data)

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)
