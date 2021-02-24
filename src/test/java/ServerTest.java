package test.java;

import main.java.Server;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ServerTest {
    Server server;

    @BeforeMethod
    public void setUp() {
        server = new Server();
    }

    @Test(dataProvider = "dp")
    /*@Test(dataProvider = "DataProvider")*//* esli my hotim zdes ukazat drugoe nazvanie metoda - krasivo ego obozvat*/
    public void setAgeTestForStudent(int age, String expectedStatus ) {
        server.setAge(age);
        String actualStatus = server.getStatus();
        assertEquals(actualStatus, expectedStatus);
    }

    @DataProvider
   /* @DataProvider(name = "DataProvider") togda dopisyvaem takuyu konstrukcyyu, dlya togo chtob po drugomu nazvat nash metod vyshe*/
    public Object[][] dp() { //forma zapisi data provider
        return new Object[][] {
                {15,"student"},
                {25,"worker"},
                {65,"pensioner"},
                {0,"student"},
                {-1,"student"},
                {101,"student"},
                {100,"pensioner"},
                //massivy massivov { {},{},{} }
        };
    }

/*   @Test
    public void setAgeTestForWorker() {
        server.setAge(25);

        String expectedStatus = "worker";
        String actualStatus = server.getStatus();

        assertEquals(actualStatus, expectedStatus);

    }ubiraem testy, ispolzuem data provider vmesto mnojestvennogo chisla testov*/

   /* @Test
    public void setAgeTestForPensioner() {
        server.setAge(65);

        String expectedStatus = "pensioner";
        String actualStatus = server.getStatus();

        assertEquals(actualStatus, expectedStatus);

    }*/
}
