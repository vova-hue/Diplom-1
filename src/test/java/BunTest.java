import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
String expectedName = "Сдобная булочка";
float expectedPrice = 50.0f;

@Test
public void testConstructor() {
    Bun bun = new Bun(expectedName, expectedPrice);
    assertEquals(expectedName, bun.getName());
    assertEquals(expectedPrice, bun.getPrice(), 0.0f);
}
}
