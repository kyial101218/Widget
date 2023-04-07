package uiTest;

import UI.dataProviders.ConfigReader;
import UI.driverFactory.Driver;
import UI.pages.webApplication.WebElementActions;
import UI.pages.widget.OneWayPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public abstract class BaseUITest {
    public WebElementActions elementActions;
    public OneWayPage oneWayPage;
    WebDriver driver;
    @BeforeClass
    public void openWidgetTest(){

        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));

        elementActions = new WebElementActions();
        oneWayPage = new OneWayPage();

    }
}
