package ru.netology.java;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int allStations = 10;
    private int minStation = 0;

    public Radio(int allStations) {
        this.allStations = allStations;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > allStations - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < allStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = allStations - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        } else if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        } else
        currentVolume = newCurrentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
}