import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPaginationPage extends TestBase{

    @Test
    public void testCount(){
        PaginationPage paginationPage = new PaginationPage(driver, wait);

        paginationPage.navigate();
        int actual = paginationPage.countTableRows();
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }

}
