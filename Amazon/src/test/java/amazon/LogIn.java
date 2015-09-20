package amazon;
import org.testng.annotations.Test;
import CommonApi.Base;


/**
 * Created by rrt on 8/30/2015.
 */
public class LogIn extends Base {

    @Test
    public void logIn()throws InterruptedException{
       // sleepFor(5);
       // mouseHoverByXpath("//html/body/div[1]/header/div/div[2]/div[2]/div/a[1]");
       // mouseHoverByCSS("#nav-tools#nav-link-yourAccount span.nav-line-2"); //nav-a nav-a-2
        //sleepFor(2);
        clickByCss(".nav-signin-tt.nav-flyout #nav-signin-tooltip #nav-signin-tooltip .nav-action-button span.nav-action-inner");
        clickByCss(".nav-action-button span.nav-action-inner");
        //clickByXpath("html/body/div[1]/header/div/div[1]/div[4]/div[1]/div[1]/a/span");
        sleepFor(2);
    }
}
