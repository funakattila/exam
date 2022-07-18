import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDropDownPage extends TestBase {

    @Test
    public void testDay() {
        DropDownPage dropDownPage = new DropDownPage(driver, wait);

        dropDownPage.navigate();
        dropDownPage.selectDay();

        String expected = "Day selected :- Tuesday";
        String actual = dropDownPage.getValue();

        Assertions.assertEquals(expected, actual);
    }
}
