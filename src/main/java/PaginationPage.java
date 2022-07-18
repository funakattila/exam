import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class PaginationPage extends BasePage{

    private final String URL = "https://demo.seleniumeasy.com/table-pagination-demo.html";
    private final By tableRow = By.xpath("//*[@style=\"display: table-row;\"]");
    private final By nextLink = By.xpath("//*[@id=\"myPager\"]/li[last()]/a");


    public PaginationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    public int countTableRows(){
        int result = 0;
        boolean isLast = false;

        while(!isLast) {

            String classOfNext = driver.findElement(nextLink).getAttribute("style");

            List<WebElement> list = driver.findElements(tableRow);
            for (WebElement item:list) {
                result += 1;
                }

            if(!classOfNext.equals("display: none;")) {
                driver.findElement(nextLink).click();
            } else {

                isLast = true;
            }


        }


        return result;
    }





}
