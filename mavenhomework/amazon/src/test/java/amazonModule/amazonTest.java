package amazonModule;

public class amazonTest extends commonMethods {
    
    @Test
    public void testUSLink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\'nav\']/div[2]/div[2]/a[1]")).click();
        //driver.wait();
        Thread.sleep(5000);
    }

    @Test
    public void testSearchBar() throws Exception {
        driver.findElement(By.id("searchInputFooter")).sendKeys("Donald Trump", Keys.ENTER);
        Thread.sleep(5000);
    }
}

