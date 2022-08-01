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

    //увеличение громкости звука, если громкость < 10
    @Test
    public void shouldIncreaseVolumeIfVolumeLessThan10() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(9);

        radioUpdate.increaseVolume();

        int expected = 10;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //увеличение громкости звука, если громкость = 10
    @Test
    public void shouldIncreaseVolumeIfVolumeIs10() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(10);

        radioUpdate.increaseVolume();

        int expected = 10;
        int actual = radioUpdate.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость от 1 до 10
    @Test
    public void shouldDecreaseVolumeIfVolumeFrom1To10() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(4);

        radioUpdate.decreaseVolume();

        int expected = 3;
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

    //уменьшение громкости звука, если громкость 11
    @Test
    public void shouldDecreaseVolumeIfVolume11() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(11);

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

    //уменьшение громкости звука, если громкость = 10
    @Test
    public void shouldDecreaseVolumeIfVolume10() {
        RadioUpdate radioUpdate = new RadioUpdate();
        radioUpdate.setCurrentVolume(10);

        radioUpdate.decreaseVolume();

        int expected = 9;
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

}

