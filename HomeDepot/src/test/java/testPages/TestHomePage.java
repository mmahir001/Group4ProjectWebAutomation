package testPages;

import base.MainAPI;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends MainAPI {
    HomePage hp;

    @Test
    public void testHomePage(){
        hp.title();

    }


}
