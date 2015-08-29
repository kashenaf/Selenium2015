import org.testng.annotations.Test;
import util.DataReader;

import java.io.IOException;

/**
 * Created by rrt on 8/29/2015.
 */
public class Search extends CnnBase {

    DataReader dr = new DataReader();
    String path = "Cnn\\data\\file1.xls";
    @Test
    public void searchItems() throws IOException {
        String[][] itemLocator = dr.fileReader(path);
        for (int i = 1; i<itemLocator.length; i++){
            typeByCssThenEnter(itemLocator[i][0], itemLocator[i][1]);
        }
    }
}

