import praktikum.Bun;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BunTest {
    private Bun bun;

    @Before
    public void createNewInstance(){
        bun = new Bun("Краторная", 200.0f);

    }

    @Test
    public void getName(){
        String expected = "Краторная";
        String actual = bun.getName();

        assertEquals("Неверное название булочки", expected,actual);
    }

    @Test
    public void getPrice(){
        float expected = 200.0f;
        float actual = bun.getPrice();

        assertEquals("Неверная цена булочки", expected, actual, 0);
    }
}
