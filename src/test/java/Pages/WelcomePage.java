package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[1]/table/tbody/tr/td[4]/a/div")
    public WebElement btnEngagement;

    public WelcomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    public void goToEngagement() throws InterruptedException {
        Thread.sleep(5000);
        btnEngagement.click();
    }



}
