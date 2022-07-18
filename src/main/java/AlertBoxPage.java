import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBoxPage extends BasePage {

    private final String URL = "https://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    private final By clickButton = By.xpath("//*[@onclick=\"myAlertFunction()\"]");

    public AlertBoxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    public void clickButton() {
        driver.findElement(clickButton).click();
    }

    public String alertMessage() {
        return driver.switchTo().alert().getText();
    }


}
