public class Alertt {

    private org.openqa.selenium.WebDriver driver;
    private final String BASE_URL = "http://localhost/redalert.php";


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
        driver.findElement(org.openqa.selenium.By.id("alert1")).click();
        org.openqa.selenium.Alert alert =driver.switchTo().alert();
        alert.accept();
        //Kirov reporting
        System.out.println(driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/h1")).getText());


        driver.findElement(org.openqa.selenium.By.id("alert2")).click();
        org.openqa.selenium.Alert alertA =driver.switchTo().alert();
        //Jeden Second alert
        org.junit.Assert.assertEquals("Second alert!",alertA.getText());
        System.out.println(alertA.getText());
        alertA.dismiss();

        // negativ
        org.junit.Assert.assertEquals("Negative",driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/h1")).getText());
        System.out.println(driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/h1")).getText());

        driver.findElement(org.openqa.selenium.By.id("alert3")).click();
        org.openqa.selenium.Alert alertB =driver.switchTo().alert();
        alertB.sendKeys("Yuri");
        alert.accept();
        //Celá hláška
        org.junit.Assert.assertEquals("Waiting for your commands Yuri",driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/h1")).getText());
       //Obsahuje slovo Yuri
        org.junit.Assert.assertTrue(driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/h1")).getText().contains("Yuri"));
        System.out.println(driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/h1")).getText());

    }

    @org.junit.After
    public void tearDone() {

        driver.quit();
    }
}