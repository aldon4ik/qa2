package firstTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv/");
        driver.quit();

    }
}
/**
 * так остается
 * комментарий
 */

// ну или так

