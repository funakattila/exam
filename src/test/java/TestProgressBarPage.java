import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TestProgressBarPage extends TestBase{

    @Test
    public void testDownload() {
        ProgressBarPage progressBarPage = new ProgressBarPage(driver, wait);

        progressBarPage.navigate();

        Assertions.assertTimeout(Duration.ofSeconds(10), () -> progressBarPage.clickDownloadButton());

    }

}
