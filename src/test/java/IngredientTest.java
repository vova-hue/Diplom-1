import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTest {
    Ingredient ingredient;
    String expectedName = "hot sauce";
    float expectedPrice = 2.0f;

    @Test
    public void testGetName() {
        ingredient = new Ingredient(IngredientType.SAUCE, expectedName, expectedPrice);
        assertEquals(expectedName, ingredient.getName());
    }

    @Test
    public void testGetPrice() {
        ingredient = new Ingredient(IngredientType.SAUCE, expectedName, expectedPrice);
        assertEquals(expectedPrice, ingredient.getPrice(), 0.0f);
    }

    @Test
    public void testGetType() {
        ingredient = new Ingredient(IngredientType.SAUCE, expectedName, expectedPrice);
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}
