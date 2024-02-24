public class CklicMeTests {

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

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            driver.findElement(org.openqa.selenium.By.id("clickMe")).click();
            org.junit.Assert.assertEquals(("Špatně přičetlo:"),String.valueOf(i),driver.findElement(org.openqa.selenium.By.id("clicks")).getText());
            System.out.println("Jen tak dál:");
            if (i == 1){
                org.junit.Assert.assertEquals("klik",driver.findElement(org.openqa.selenium.By.className("description") ).getText());
            }


            if (i >= 2 && i<=4){
                org.junit.Assert.assertEquals("kliky",driver.findElement(org.openqa.selenium.By.className("description") ).getText());
            }


            if (i > 4){
                org.junit.Assert.assertEquals("klikov",driver.findElement(org.openqa.selenium.By.className("description") ).getText());
            }
            System.out.println( driver.findElement(org.openqa.selenium.By.className("description")).getText());

        }
        System.out.println("Cyklus se ti podařil:");



    }

    @org.junit.After
    public void tearDown(){
        driver.quit();
    }

}
