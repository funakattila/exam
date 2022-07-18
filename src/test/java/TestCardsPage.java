import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCardsPage extends TestBase{

    @Test
    @Description("test the name on the second card")
    public void testName() {
        CardsPage cardsPage = new CardsPage(driver, wait);

        cardsPage.navigate();

        String expected = "Brenda Tree";
        String actual = cardsPage.getname();

        Assertions.assertEquals(expected, actual);
    }

}
