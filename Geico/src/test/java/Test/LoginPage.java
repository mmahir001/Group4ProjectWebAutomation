package Test;

import base.MainAPI;
import org.testng.annotations.Test;

public class LoginPage extends MainAPI {

    @Test
    public void test1(){
        String title = driver.getTitle();

        driver.getTitle();
        System.out.println(title);

    }
}
