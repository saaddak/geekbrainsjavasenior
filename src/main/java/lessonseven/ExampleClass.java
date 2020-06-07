package lessonseven;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExampleClass {
    @BeforeSuite
    public void methodTestBegin() { print("methodTestBegin"); }

    @Test(priority = 1)
    public void methodTest1() { print("methodTest1"); }

    @Test(priority = 2)
    public void methodTest2() { print("methodTest2"); }

    @Test(priority = 3)
    public void methodTest3() { print("methodTest3"); }

    @Test(priority = 4)
    public void methodTest4() { print("methodTest4"); }

    @AfterSuite
    public void methodTestEnd() { print("methodTestEnd"); }

    private void print(String methodName) {
        System.out.println("Class " + this.getClass().getSimpleName() + "Method " + methodName);
    }
}
