import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class Testic {

    private Bank b1;

    @BeforeClass
    public void testPreClass(){
        b1 = new Bank();
        System.out.println("Postavljanje Banke b1");
    }


   @BeforeMethod
    public void testPreMetode(){
       b1.reset();
       System.out.println("Reset Banke b1");
    }
    /*
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

        //Proveriti da li set metode dobro postavljaju odgovarajuće vrednosti, kao i da li get metode vraćaju odgovarajuće vrednosti.

        @Test
        public void metodaTest5() {
            System.out.println("Pocetak metode Test5");
            Account a1 = new Account("Pera","123");
            Assert.assertEquals(a1.getName(), "Pera");
        }
        @Test
        public void metodaTest6() {
            System.out.println("Pocetak metode Test6");
            Account a1 = new Account("Pera","123");
            Assert.assertEquals(a1.getNumber(), "123");
        }
        @Test
        public void metodaTest7() {
            System.out.println("Pocetak metode Test7");
            Account a1 = new Account("Pera","123");
            a1.setAmount(1000d);
            Assert.assertEquals(a1.getAmount(), 1000d);

        }
    //        return String.format("%s %s %.2f",number,name,amount);

        @Test
        public void metodaTest8() {
            System.out.println("Pocetak metode Test8");
            Account a1 = new Account("Pera","123");
            a1.setAmount(1.00d);
            //   System.out.println(a1.toString());
            Assert.assertEquals(a1.toString(), "123 Pera 1.00");
        }


     */
    @Test
    public void metodaTest9() {
        System.out.println("Pocetak metode Test9");
        //Bank b1=new Bank();
        Account a1=b1.openAccount("Pera");
        String  broj=a1.getNumber();
        b1.payInMoney(broj,1000d);
        Assert.assertEquals(a1.getAmount(),1000d);

    }

    @Test
    public void metodaTest10() {
        System.out.println("Pocetak metode Test10");

        //Bank b1=new Bank();
        Account ax1=b1.openAccount("Pera");
        Account ax2=b1.openAccount("Zika");
        String  broj=ax1.getNumber();
        String  broj2=ax2.getNumber();
        b1.payInMoney(broj,1000d);
        b1.payInMoney(broj2,2000d);
        b1.transferMoney(broj,broj2,1000d);
        Assert.assertEquals(ax1.getAmount(),0d,"aaaaa");

    }
    @Test
    public void metodaTest11() {
        System.out.println("Pocetak metode Test11");

        Account ax1=b1.openAccount("Pera");
        Account ax2=b1.openAccount("Zika");
        String  broj=ax1.getNumber();
        String  broj2=ax2.getNumber();
        b1.payInMoney(broj,1000d);
        b1.payInMoney(broj2,2000d);

        double suma= b1.getSumMoney();
        Assert.assertEquals(suma, 3000d);
        b1.payInMoney(broj2,2000d);
        suma= b1.getSumMoney();
        Assert.assertEquals(suma, 5000d);

    }

    @Test
    public void metodaTest12() {
        System.out.println("Pocetak metode Test12");


        Account ax1=b1.openAccount("Pera");
        Account ax2=b1.openAccount("Zika");
        Account ax3=b1.openAccount("Laze");
        Account ax4=b1.openAccount("Miki");
        Account ax5=b1.openAccount("Bane");

        String  broj=ax1.getNumber();
        String  broj2=ax2.getNumber();
        String  broj3=ax3.getNumber();
        String  broj4=ax4.getNumber();
        String  broj5=ax5.getNumber();

        SoftAssert sa1=new SoftAssert();
        sa1.assertEquals(b1.getAccount(broj).getName(), "Pera");
        sa1.assertEquals(b1.getAccount(broj2).getName(), "Zika");
        sa1.assertEquals(b1.getAccount(broj3).getName(), "Laze");
        sa1.assertEquals(b1.getAccount(broj4).getName(), "Miki");
        sa1.assertEquals(b1.getAccount(broj5).getName(), "Bane");
        sa1.assertAll();
    }

}


//Potrebno je napraviti test za ispravnost klase Bank. Za sve testove potrebno je napraviti jedinstvenu banku koja se
// na početku testa resetuje. Smatrati da ova banka ne može da ima nalog kod kojeg je stanje negativno.
// Ako se na osnovu testova nađe neka greška u kodu potrebno jej da se popravi originalni kod.
//
//Potrebno je ispitati da li adekvatno radi otvaranje naloga, tako što će se ubaciti 5 naloga i zatim ispitati
// da li se ti nalozi mogu dohvatiti.
//Proveriti da li dobro radi metoda za uplatu novca.
//Proveriti da li dobro radi metoda za transfer novca.
//Proveriti da li dobro radi metoda za računanje ukupnog novca u banci (getSumMoney).



