package amazon;

import CommonApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import search.DropDownSearchList;

import java.util.List;

/**
 * Created by rrt on 8/22/2015.
 */
public class Retail extends DropDownSearchList {

    @Test
    public void home() throws InterruptedException{
       List<String> searchItems = getDropDownList("#searchDropdownBox option");
        for(int i=0; i<searchItems.size(); i++) {

            typeByCssThenEnter("#twotabsearchtextbox", searchItems.get(i));
            sleepFor(2);
            clearInputBox("#twotabsearchtextbox");
            sleepFor(2);
        }
    }
}
