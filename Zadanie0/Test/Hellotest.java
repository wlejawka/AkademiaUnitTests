package zadanie0.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import zadanie0.Main.*;

public class Hellotest {
    @Test
    public void meh(){
        //Arrange
        HelloWorld hejka = new HelloWorld();
        //Act
        String greeting = hejka.getGreeting();
        //Assert
        assertEquals("HelloWorld!!one",greeting);
    }
}
