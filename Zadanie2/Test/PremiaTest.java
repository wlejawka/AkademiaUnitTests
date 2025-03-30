package Zadanie2.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Zadanie2.Main.Premia;

public class PremiaTest {
    private Premia ttt = new Premia();
    @SuppressWarnings("deprecation")

    @Test
    public void testBonus0(){
       assertEquals(0.0, ttt.wysokoscPremii(3), 0.01);
    }
    @Test
    public void testBonus50(){
       assertEquals(0.5, ttt.wysokoscPremii(4), 0.01);
    }
    @Test
    public void testBonus501(){
       assertEquals(0.5, ttt.wysokoscPremii(8), 0.01);
    }
    @Test
    public void testBonus75(){
       assertEquals(0.75, ttt.wysokoscPremii(9), 0.01);
    }
    @Test
    public void testBonus751(){
       assertEquals(0.75, ttt.wysokoscPremii(11), 0.01);
    }
    @Test
    public void testBonus100(){
       assertEquals(1.0, ttt.wysokoscPremii(12), 0.01);
    }
    @Test
    public void testBonus1001(){
       assertEquals(1.0, ttt.wysokoscPremii(70), 0.01);
    }
    @Test
    public void testBonus700(){
       assertEquals(0.0, ttt.wysokoscPremii(71), 0.01);
    }
    
   
}
