

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CssSelektor {
    private org.openqa.selenium.WebDriver driver;
    private final String BASE_URL = "http://localhost/kalkulacka.php";

    //  public static void main(String[] args) {
    @After
    public void tearDone (){
        driver.quit();

    }
    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Michal\\Desktop\\JAVA\\chromedriver-win64\\chromedriver.exe");
        org.openqa.selenium.chrome.ChromeOptions cop = new org.openqa.selenium.chrome.ChromeOptions();
        cop.setBinary("C:\\Users\\Michal\\Desktop\\JAVA\\chrome-win64\\chrome.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver(cop);
    }
    @Test
    public void test (){
        driver.get(BASE_URL);
        driver.findElement(org.openqa.selenium.By.cssSelector("button#count")).click();

    }


}