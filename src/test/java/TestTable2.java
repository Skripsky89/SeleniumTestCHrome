public class TestTable2 {

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
        java.util.List<org.openqa.selenium.WebElement> rows = driver.findElements(org.openqa.selenium.By.xpath("//table/tbody/tr"));
        //System.out.println(rows);
        for (org.openqa.selenium.WebElement row : rows) {
            System.out.println(row.getText());

        }

    }

    @org.junit.After
    public void tearDone() {
    //driver.quit();
    }
}