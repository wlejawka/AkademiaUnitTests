package Zadanie4.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Zadanie4.Main.Discount;

public class DiscountTest {
    @ParameterizedTest
    @CsvSource({"-50,-50",
    "0,0",
    "5000,5000",
    "5001,3500.7",
    "15000,10500",
    "15001,9000.6",
    "50000,30000",
    "50001,10000.2"})
    void calculateDiscount(Double orderPrice, Double withDiscount){
        //Arrange
        Discount app = new Discount();
        //Act
        double result = app.calculateDiscount(orderPrice);
        //Assert
        assertEquals(withDiscount, result, 0.1);
    }
    

}
