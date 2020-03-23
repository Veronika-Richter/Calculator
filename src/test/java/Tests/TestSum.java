package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSum {

    private Calculator calculator;
    @BeforeClass
    public void addCalculator(){
        calculator =new Calculator();
    }
    @DataProvider(name = "Данные для суммирования")
    public Object[][] dataForSum() {
        return new Object[][]{
                {1,2,3},
                {-1,-2,-3},
                {0,2,2},
                {1.2,2.3,3.5}
        };
    }
    @Test(dataProvider = "Данные для суммирования")
    public void testSum(double a, double b, double expectedResult){
        double sum =calculator.sum(a,b);
        Assert.assertEquals(sum,expectedResult,"Суммирование");
    }
}

