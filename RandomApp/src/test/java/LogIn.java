import CommonApi.Base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by rrt on 8/30/2015.
 */
public class LogIn extends Base {

    @Test
    public void logIn()throws InterruptedException{
        clickByCss(".login_btn.link_button.cursor-pointer");
        WebElement element = getWebElementByCss("#surf-xdm iframe:nth-child(1)");
        iframeHandle(element);
        WebElement innerFrame = getWebElementByCss("#display-frame");
        iframeHandle(innerFrame);
        typeByCss("#input_username", "test123789ui88");
        typeByCss("#input_password", "test123789ui88");
        clickByCss("#button_submit");
        sleepFor(2);
        driver.switchTo().defaultContent();
    }
}
