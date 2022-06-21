package unitTest;
import altin.capitalcityweb.Controller.CapitalController;
import org.junit.*;

public class CapitalTest {
    @Test
    public void testAustria(){
        CapitalController c  = new CapitalController();

        String excepted = "Vienna";
        String actual = c.returnCapital("Austria");

        Assert.assertEquals("Should be Vienna",excepted,actual);
    }
    @Test
    public void testGermany(){
        CapitalController c  = new CapitalController();

        String excepted = "Berlin";
        String actual = c.returnCapital("Germany");

        Assert.assertEquals("Should be Berlin",excepted,actual);
    }
}
