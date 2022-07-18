import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CardsPage extends BasePage{

    private final String URL = "https://demo.seleniumeasy.com/data-list-filter-demo.html";
    private final By name = By.xpath("//*[@class=\"searchable-container\"]/div[2]//h4");

    public CardsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    public String getname() {
        String text = driver.findElement(name).getText();
        return text.replace("Name: ", "");
    }


}
