public class CklicMeTest {

    private org.openqa.selenium.WebDriver driver;
    private final String BASE_URL ="http://localhost/clickmebaby.php";

    @org.junit.Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Michal\\Desktop\\JAVA\\chromedriver-win64\\chromedriver.exe");
        org.openqa.selenium.chrome.ChromeOptions cop = new org.openqa.selenium.chrome.ChromeOptions();
        cop.setBinary("C:\\Users\\Michal\\Desktop\\JAVA\\chrome-win64\\chrome.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver(cop);
    }
    @org.junit.Test
    public void Test(){
        driver.get(BASE_URL);
        //System.out.println(driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
        org.junit.Assert.assertEquals("Nerestartoval se prohlížeč. Inicializuj:","0",(driver.findElement(org.openqa.selenium.By.id("clicks")).getText()));
        System.out.println("Počáteční hodnota je ve stanovené normě:");
        driver.findElement(org.openqa.selenium.By.id("clickMe")).click();
        org.junit.Assert.assertEquals(("Špatně přičetlo:"),"1",driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
        System.out.println("Jen tak dál:");
        driver.findElement(org.openqa.selenium.By.id("clickMe")).click();
        org.junit.Assert.assertEquals(("Špatně přičetlo:"),"2",driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
        System.out.println("Jen tak dál:");
        driver.findElement(org.openqa.selenium.By.id("clickMe")).click();
        org.junit.Assert.assertEquals(("Špatně přičetlo:"),"3",driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
        System.out.println("Jen tak dál:");
        driver.findElement(org.openqa.selenium.By.id("clickMe")).click();
        org.junit.Assert.assertEquals(("Špatně přičetlo:"),"4",driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
        System.out.println("Jen tak dál:");
        driver.findElement(org.openqa.selenium.By.id("clickMe")).click();
        org.junit.Assert.assertEquals(("Špatně přičetlo:"),"5",driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
        System.out.println("Jen tak dál:");

    }

    @org.junit.After
    public void tearDown(){
        driver.quit();
    }

}
