package UI.pages.widget;

import UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneWayPage extends BasePage {
    @FindBy(xpath = "//*[@id='widget-by-bookinglane']/div")
    public WebElement circleBookNow;

    @FindBy(xpath = "//div/span[contains(text(),'One way')]")
    public WebElement oneWayBtn;

    public OneWayPage clickOneWay(){
        elementActions.moveTo(oneWayBtn);
        elementActions.click(oneWayBtn);
        return this;
    }
    public OneWayPage clickBookNow(){
        elementActions.click(circleBookNow);
        return this;
    }

}
