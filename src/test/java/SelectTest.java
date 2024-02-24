public class SelectTest {

    private org.openqa.selenium.WebDriver driver;
    private final String BASE_URL = "http://localhost/vybersi.php";

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

        new org.openqa.selenium.support.ui.Select(driver.findElement(org.openqa.selenium.By.className("form-control"))).selectByIndex(1);
        System.out.println("Vybral jsi charmandra");
        new org.openqa.selenium.support.ui.Select(driver.findElement(org.openqa.selenium.By.className("form-control"))).selectByValue("02");
        System.out.println("Vybral jsi bulbasaura");
        new org.openqa.selenium.support.ui.Select(driver.findElement(org.openqa.selenium.By.className("form-control"))).selectByVisibleText("Geodude");
        System.out.println("Vybral jsi geodude");
        org.junit.Assert.assertTrue(driver.findElement(org.openqa.selenium.By.xpath("//div/h3")).getText().contains("Geodude"));
    }


}