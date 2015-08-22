package home;

import CommonApi.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by rrt on 8/22/2015.
 */
public class HomePage extends Base {

    @Test
    public void navigateTabs(){
        clickByXpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[2]/a");
    }



}
