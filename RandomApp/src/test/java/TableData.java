import CommonApi.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 8/30/2015.
 */
public class TableData extends Base {

    @Test
    public void table(){
        List<WebElement> listOfTD = getWebElementsByCss(".reference.notranslate tr:nth-child(3) td");
     for (int i=1; i<8; i++) {
         String data = getTextByCss(".reference.notranslate tbody>tr:nth-child(3) td:nth-child("+i+")");
         System.out.print(data+" ");
     }
    }
}
