package test.java.helpers;

import org.testng.annotations.DataProvider;

import java.util.ResourceBundle;


public class PropertyLoader {
    private static ResourceBundle res = ResourceBundle.getBundle("config");

    public static String getProperty(String key){
        return res.getString(key);
    }
}
//    static String[][] data;
//
//    @DataProvider(name = "brands1")
//    public static Object[][] supplyData() throws Exception {
//        return new Object[][]{
//                {"HP1", "Ace1r"},
//        };
//    }
//
//    private static Object[][] getdata() throws Exception {
//        return new Object[][]{
//                {"HP1", "Ace1r"},
//        };
//    }
//
//    public static void main(String[] args) throws Exception {
//        getdata();
//    }
//}
