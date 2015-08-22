package amazon;

import CommonApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by rrt on 8/22/2015.
 */
public class Retail extends Base{

    @Test
    public void home(){
       typeByCssThenEnter("#twotabsearchtextbox", "books");
    }
}
