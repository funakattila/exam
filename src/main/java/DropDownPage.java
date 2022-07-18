import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPage extends BasePage{

    private final String URL = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    private final By selectList = By.id("select-demo");
    private final By tuesday = By.xpath("//*[@value=\"Tuesday\"]");
    private final By selectedValue = By.className("selected-value");

    public DropDownPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    public void selectDay() {
        driver.findElement(tuesday).click();
    }

    public String getValue() {
        return driver.findElement(selectedValue).getText();
    }

}
