package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMultiplication {

    private Calculator calculator;
    @BeforeClass
    public void addCalculator(){
        calculator =new Calculator();
    }
    @DataProvider(name = "Данные для умножения")
    public Object[][] dataForMultiplication() {
        return new Object[][]{
                {1,2,2},
                {-1,-2,2},
                {0,1,0},
                {1.4,1.2,1.68}
        };
    }
    @Test(dataProvider = "Данные для умножения")
    public void testMultiplication(double a, double b, double expectedResult){
        double multiplication =calculator.multiplication(a,b);
        Assert.assertEquals(multiplication,expectedResult,"Ошибка во время умножении");
    }
}
