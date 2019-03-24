package pages;

import base.MainAPI;
import org.testng.annotations.Test;

public class HomePage extends MainAPI {
    public void title() {

        driver.getTitle();
        System.out.println(driver.getTitle());

    }

}
