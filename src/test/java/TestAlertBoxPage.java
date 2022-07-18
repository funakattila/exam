import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAlertBoxPage extends TestBase{

    @Test
    public void testAlertBox() {
        AlertBoxPage alertBoxPage = new AlertBoxPage(driver, wait);

        alertBoxPage.navigate();
        alertBoxPage.clickButton();

        String expected = "I am an alert box!";
        String actual = alertBoxPage.alertMessage();

        Assertions.assertEquals(expected, actual);
    }

}
