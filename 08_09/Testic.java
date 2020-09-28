import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Date;

public class Testic {
    @BeforeMethod
    public void testPreMetode(){
        System.out.println("Ovo ide pre svake metode");
    }

    @BeforeSuite
    public void testPreSuite(){
        System.out.println("Ovo ide pre seta testova");
    }

    @BeforeClass
    public void testPreClass(){
        System.out.println("Ovo ide pre svake klase");
    }

    @AfterMethod
    public void testPosleMetode(){
        System.out.println("Ovo ide posle svake metode");
    }

    @AfterSuite
    public void testPosleSuite(){
        System.out.println("Ovo ide posle seta testova");
    }

    @AfterClass
    public void testPosleClass(){
        System.out.println("Ovo ide posle svake klase");
    }


    @Test
public void metodaTest1(){
    System.out.println("Pocetak metode Test1");
    Date d=new Date();
    Zaposleni z1=new Zaposleni("Pera",1980,d);
    Assert.assertEquals(z1.getNaziv(), "Pera");
    Assert.assertEquals(z1.getGodRodjenja(),1980);
    Assert.assertEquals(z1.getDatumZap(),d);
}
    @Test
    public void metodaTest2() {
        System.out.println("Pocetak metode Test2");
        Date d = new Date();
        Zaposleni z1 = new Zaposleni("Pera", 1980, d);
        Assert.assertEquals(z1.getGodRodjenja(), 1980);
    }

    @Test
    public void metodaTest3() {
        System.out.println("Pocetak metode Test3");
        Date d = new Date();
        Zaposleni z1 = new Zaposleni("Pera", 1980, d);
        Assert.assertEquals(z1.getDatumZap(), d);
    }

    @Test
    public void metodaTest4() {
        System.out.println("Pocetak metode Test4");
        Date d = new Date();
        Magacioner m1 = new Magacioner("Zika", 1981, d);
        m1.setNazivMagacina("Krselomija");
        Assert.assertEquals(m1.getNazivMagacina(), "Krselomija");
    }

    }

