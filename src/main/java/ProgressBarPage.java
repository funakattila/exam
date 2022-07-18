import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class ProgressBarPage extends BasePage{

    private final String URL = "https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html";
    private final By startDownloadButton = By.id("downloadButton");

    private final By progressLabel = By.className("progress-label");

    public ProgressBarPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    public void clickDownloadButton() {
        driver.findElement(startDownloadButton).click();

        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(progressLabel, "Complete!"));
    }
}
