package ru.netology.radioupdate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioUpdateTest {

    @Test

    //переключение станции вперёд, если номер станции < 9
    public void shouldNextStationIfNumberLessThan9() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentStationNumber(8);

        radioUpdate.next();

        int expected = 9;
        int actual = radioUpdate.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    //переключение станции вперёд, если номер станции = 9
    public void shouldNextStationIfNumberIs9() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentStationNumber(9);

        radioUpdate.next();

        int expected = 0;
        int actual = radioUpdate.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    //переключение станции назад, если номер станции > 0
    @Test
    public void shouldPrevStationIfNumberMoreThan0() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentStationNumber(8);

        radioUpdate.prev();

        int expected = 7;
        int actual = radioUpdate.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //переключение станции назад, если номер станции = 0
    @Test
    public void shouldPrevStationIfNumberIs0() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentStationNumber(0);

        radioUpdate.prev();

        int expected = 9;
        int actual = radioUpdate.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //увеличение громкости звука, если громкость < 100
    @Test
    public void shouldIncreaseVolumeIfVolumeLessThan100() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(80);

        radioUpdate.increaseVolume();

        int expected = 81;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //увеличение громкости звука, если громкость = 100
    @Test
    public void shouldIncreaseVolumeIfVolumeIs100() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(100);

        radioUpdate.increaseVolume();

        int expected = 100;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость от 1 до 100
    @Test
    public void shouldDecreaseVolumeIfVolumeFrom1To100() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(18);

        radioUpdate.decreaseVolume();

        int expected = 17;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость 0
    @Test
    public void shouldDecreaseVolumeIfVolume0() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(0);

        radioUpdate.decreaseVolume();

        int expected = 0;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость -1
    @Test
    public void shouldDecreaseVolumeIfVolumeMinus1() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(-1);

        radioUpdate.decreaseVolume();

        int expected = 0;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость 101
    @Test
    public void shouldDecreaseVolumeIfVolume101() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(101);

        radioUpdate.decreaseVolume();

        int expected = 0;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость = 1
    @Test
    public void shouldDecreaseVolumeIfVolume1() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(1);

        radioUpdate.decreaseVolume();

        int expected = 0;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость = 99
    @Test
    public void shouldDecreaseVolumeIfVolume99() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(99);

        radioUpdate.decreaseVolume();

        int expected = 98;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //если устанавливают текущий номер станции <0
    @Test
    public void shouldNotWorkIfCurrentStationNumberLessThan0() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentStationNumber(-1);

        radioUpdate.getCurrentStationNumber();

        int expected = 0;
        int actual = radioUpdate.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //если устанавливают текущий номер станции > 9
    @Test
    public void shouldNotWorkIfCurrentStationNumberMoreThan9() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentStationNumber(10);

        radioUpdate.getCurrentStationNumber();

        int expected = 0;
        int actual = radioUpdate.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //тест для конструктора
    @Test
    public void constructorTest() {
        RadioUpdate radioUpdate = new RadioUpdate(10);

        radioUpdate.setCurrentStationNumber(9);

        int actual = radioUpdate.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

}

