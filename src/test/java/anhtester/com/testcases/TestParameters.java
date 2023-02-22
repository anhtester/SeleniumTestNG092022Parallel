package anhtester.com.testcases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @Test
    @Parameters({"number1", "number2"})
    public void Cong2So(int num1, @Optional("15") int num2){
        System.out.println(num1 + num2);
    }

    @Test
    @Parameters({"message"})
    public void notifications(String mess){
        System.out.println(mess);
    }

}
