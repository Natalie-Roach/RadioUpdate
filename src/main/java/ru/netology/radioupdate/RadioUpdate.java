package ru.netology.radioupdate;

public class RadioUpdate {
    //поля
    private int currentStationNumber;
    private int currentVolume;
    private int numberOfStations;

    //конструкторы
    public RadioUpdate() {
        this.numberOfStations = 10;
    }

    public RadioUpdate(int numberOfStations) {
        this.numberOfStations = numberOfStations;

    }


    //переключение радиостанций вперёд
    public void next() {
        if (currentStationNumber < numberOfStations - 1) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    //переключение радиостанций назад
    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = numberOfStations - 1;
        }
    }

    // увеличение звука на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }


    // уменьшение звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    //getter текущий номер станции
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    //setter текущий номер станции
    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > numberOfStations - 1) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    //getter текущая громкость звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    //сеттер текущая громкость звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;

    }

}