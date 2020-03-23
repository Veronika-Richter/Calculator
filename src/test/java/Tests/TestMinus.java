package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMinus {

    private Calculator calculator;
    @BeforeClass
    public void addCalculator(){
        calculator =new Calculator();
    }
    @DataProvider(name = "Данные для вычитания")
    public Object[][] dataForMinus() {
        return new Object[][]{
                {2,1,1},
                {-1,-2,-3},
                {0,1,-1},
                {3.4,3.2,0.2}
        };
    }
    @Test(dataProvider = "Данные для вычитания")
    public void testMinus(double a, double b, double expectedResult){
        double minus =calculator.minus(a,b);
        Assert.assertEquals(minus,expectedResult,"Ошибка при вычитании");
    }
}
