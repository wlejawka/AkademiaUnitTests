package Zadanie5.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import Zadanie5.Main.*;

public class RabatTest {
    @ParameterizedTest
    @CsvSource({"100,true,rabat wynosi 5 %",
    "101,true,rabat wynosi 10 %",
    "200,true,rabat wynosi 10 %",
    "201,true,rabat wynosi 15 %",
    "300,true,rabat wynosi 15 %",
    "301,true,rabat wynosi 20 %",
    "400,true,rabat wynosi 20 %",
    "401,true,rabat wynosi 25 %",
    "401,false,karta",
    "0,false,karta",})

    public void  testParameterFalse(double price, boolean klient, String komunikat){
        //Arrange
        Rabat rabat = new Rabat();
        //Act
        String actualResult = rabat.calculateRabat(price, klient);
        //Assert
        assertEquals(komunikat, actualResult);
    }
}
