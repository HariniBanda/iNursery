import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iNurseryLoginPage {

        public static WebDriver driver;

        @BeforeClass
        public static void setup() {
            WebDriverManager.chromiumdriver().setup();
            driver = new ChromeDriver();
            driver.get("https://inurseryqa.technified.com/#inlogin");
            driver.manage().window().maximize();


        }

        @AfterClass
        public static void tearDown() {
            driver.close();
        }


        @Test
        public void verifyPageTittle()
        {
            //Arrange
            String expectedPageTitle = "iNursery";
            //Act
            String actualPageTitle = driver.getTitle();
            //Assert
            Assert.assertEquals(expectedPageTitle,actualPageTitle);
        }
    }






