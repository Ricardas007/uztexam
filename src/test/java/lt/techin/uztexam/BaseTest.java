package lt.techin.uztexam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("http://192.168.88.86/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    @AfterEach
    void closeDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
