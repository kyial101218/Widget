package uiTest.widgetTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uiTest.BaseUITest;

public class OneWayTest extends BaseUITest {
    @Test
    public void startReservation(){
        oneWayPage.clickBookNow();

    }
//    @Test
//    public void ass (){
//        String expect = "";
//        Assert.assertEquals();
//    }
}
