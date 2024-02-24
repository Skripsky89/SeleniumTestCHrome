public class TableTest {

    private org.openqa.selenium.WebDriver driver;
    private final String BASE_URL = "http://localhost/tabulka.php";



    @org.junit.Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Michal\\Desktop\\JAVA\\chromedriver-win64\\chromedriver.exe");
        org.openqa.selenium.chrome.ChromeOptions cop = new org.openqa.selenium.chrome.ChromeOptions();
        cop.setBinary("C:\\Users\\Michal\\Desktop\\JAVA\\chrome-win64\\chrome.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver(cop);

    }

    @org.junit.Test
    public void test() {
        driver.get(BASE_URL);

    System.out.println(driver.findElement(org.openqa.selenium.By.xpath("//table/tbody/tr[last()]/td[1]")).getText());
    int rows = Integer.parseInt(driver.findElement(org.openqa.selenium.By.xpath("//table/tbody/tr[last()]/td[1]")).getText());
    for (int i = 1; i < rows +1; i++ ) {
        //driver.findElement(org.openqa.selenium.By.xpath("//table/tbody/tr["+i+"]"));
        System.out.println(driver.findElement(org.openqa.selenium.By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
        org.junit.Assert.assertFalse(driver.findElement(org.openqa.selenium.By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText().isEmpty());
        }

    }

    @org.junit.After
    public void tearDone() {
        //driver.quit();

    }
}