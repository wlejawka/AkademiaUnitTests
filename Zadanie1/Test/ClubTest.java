package Zadanie1.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Zadanie1.Main.Club;
public class ClubTest {
   @Test 
   public void testAge(){
    //Arrange
    Club club = new Club();
    //Act
    boolean newAge = club.age(17);
    //Assert
    assertTrue(newAge);

    }
    
}


