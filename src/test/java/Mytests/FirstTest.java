package Mytests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest
{
    @Test
    public void FacebookTest() throws Exception {
        Reporter.log(String.format("Facebook Test Started %s",Thread.currentThread().getId()),true);
        getDriver().navigate().to("http://www.facebook.com");
        Assert.assertEquals(getDriver().getTitle(), "Facebook – log in or sign up");
        Reporter.log(String.format("Facebook Test Ended %s",Thread.currentThread().getId()),true);
    }

    @Test
    public void GmailTest() throws Exception {
        Reporter.log(String.format("Gmail Test Started %s",Thread.currentThread().getId()),true);
        getDriver().navigate().to("http://www.gmail.com");
        Assert.assertEquals(getDriver().getTitle(), "Gmail");
        Reporter.log(String.format("Gmail Test Ended %s",Thread.currentThread().getId()),true);
    }

    @Test
    public void InstagramTest() throws Exception {
        Reporter.log(String.format("Instagram Test Started %s",Thread.currentThread().getId()),true);
        getDriver().navigate().to("https://www.instagram.com/");
        Assert.assertEquals(getDriver().getTitle(), "Instagram");
        Reporter.log(String.format("Instagram Test Ended %s",Thread.currentThread().getId()),true);
    }
}
