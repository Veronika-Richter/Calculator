package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDivision {
    private Calculator calculator;
    @BeforeClass
    public void addCalculator(){
        calculator =new Calculator();
    }
    @DataProvider(name = "Данные для деления")
    public Object[][] dataForDivision() {
        return new Object[][]{
                {2,1,2},
                {-2,-1,2},
                {0,1,0},
                {5,2.5,2}
        };
    }
    @Test(dataProvider = "Данные для деления")
    public void testDivision(double a, double b, double expectedResult){
        double division =calculator.division(a,b);
        Assert.assertEquals(division,expectedResult,"Ошибка во время деления");
    }

}
