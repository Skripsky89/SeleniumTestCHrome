public class ZakladKopirovani {

    private org.openqa.selenium.WebDriver driver;
    private final String BASE_URL = "http://localhost/registracia.php";

    @org.junit.After
    public void tearDone (){

        driver.quit();

    }
    @org.junit.Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Michal\\Desktop\\JAVA\\chromedriver-win64\\chromedriver.exe");
        org.openqa.selenium.chrome.ChromeOptions cop = new org.openqa.selenium.chrome.ChromeOptions();
        cop.setBinary("C:\\Users\\Michal\\Desktop\\JAVA\\chrome-win64\\chrome.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver(cop);

    }
    @org.junit.Test
    public void test (){
        driver.get(BASE_URL);
    }


}