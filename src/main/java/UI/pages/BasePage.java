package UI.pages;

import UI.driverFactory.Driver;
import UI.pages.webApplication.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    public WebElementActions elementActions = new WebElementActions();
//    public MockDataGenerator mock = new MockDataGenerator();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
