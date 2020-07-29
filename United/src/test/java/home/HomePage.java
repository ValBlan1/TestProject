package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test

    public void homePage(){
        clickOnElement("ml-0 my-1 lg-my-0.lg-ml-0 lg-mr-3 ");
    }
}
