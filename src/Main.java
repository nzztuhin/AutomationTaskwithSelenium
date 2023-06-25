import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.lang.Thread;


import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","F://selenium//Drivers//chromedriver_win32//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://pw1.bpclient.click/");

//Open About dropdown and click on the Biography
        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='About']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();

        WebElement bio = driver.findElement(By.xpath("//a[normalize-space()='Biography']"));
        action.moveToElement(bio).perform();
        bio.click();


        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

//Open About dropdown and click on the Achievement
        WebElement ele1 = driver.findElement(By.xpath("//a[normalize-space()='About']"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(ele1).perform();

        WebElement ach = driver.findElement(By.xpath("//a[normalize-space()='Achievement']"));
        action1.moveToElement(ach).perform();
        ach.click();


        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

//Open Event page and scroll

        driver.findElement(By.xpath("//a[normalize-space()='Event']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

//Open News page by clicking news from navbar
        driver.findElement(By.xpath("//a[normalize-space()='News']")).click();

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,550)", "");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
// go to MORE NEWS and click on a story to see full story and scroll
        driver.findElement(By.xpath("//body/section/div/div[contains(@data-aos,'fade-up')]/div/div[1]/div[2]/a[1]")).click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,550)", "");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }


// click on one of the RECENT NEWS

        driver.findElement(By.xpath("//body/section[@id='news']/div[contains(@class,'md:py-20')]/div[1]")).click();
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,200)", "");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
//Open Media dropdown and click on the Publications

        WebElement media1 = driver.findElement(By.xpath("//a[normalize-space()='Media']"));
        Actions action3 = new Actions(driver);
        action3.moveToElement(media1).perform();

        WebElement pb= driver.findElement(By.xpath("//a[normalize-space()='Publications']"));
        action3.moveToElement(pb).perform();
        pb.click();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
//Open Media dropdown and click on the  Speeches

        WebElement media2 = driver.findElement(By.xpath("//a[normalize-space()='Media']"));
        Actions action4 = new Actions(driver);
        action4.moveToElement(media2).perform();

        WebElement sp= driver.findElement(By.xpath("//a[normalize-space()='Speeches']"));
        action4.moveToElement(sp).perform();
        sp.click();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

//Open Gallery dropdown and click on the  Photo Gallery

        WebElement gallery1 = driver.findElement(By.xpath("//a[normalize-space()='Gallery']"));
        Actions action5 = new Actions(driver);
        action5.moveToElement(gallery1).perform();

        WebElement pg= driver.findElement(By.xpath("//a[normalize-space()='Photo Gallery']"));
        action5.moveToElement(pg).perform();
        pg.click();
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,500)", "");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
//Open Gallery dropdown and click on the  Video Gallery

        WebElement gallery2 = driver.findElement(By.xpath("//a[normalize-space()='Gallery']"));
        Actions action6 = new Actions(driver);
        action6.moveToElement(gallery2).perform();

        WebElement vg= driver.findElement(By.xpath("//a[normalize-space()='Video Gallery']"));
        action6.moveToElement(vg).perform();
        vg.click();

        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,500)", "");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

//Open  Get Invoved  page by clicking Get Invoved from navbar

  driver.findElement(By.xpath("//a[normalize-space()='Get Invoved']")).click();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }


        driver.findElement(By.id("to_join0")).click();
        driver.findElement(By.id("to_join1")).click();
        driver.findElement(By.xpath("//button[normalize-space()='JOIN']")).click();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
//Open  Contuct us  page by clicking Get Contuct us from navbar

        driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();

        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("window.scrollBy(0,550)", "");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        driver.findElement(By.xpath("(//input[@id='grid-first-name'])[1]")).sendKeys("Nuruzzaman");


        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("ICT Division has taken initiatives to build Digital Bangladesh. " +
                "Our software and service industry is a billion-dollar market and is expected to grow our export to USD 5 Billion by 2025. " +
                "We are serving clients in the array of domains –Financial Services, Telecom companies,");

        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

        driver.quit();

    }
}