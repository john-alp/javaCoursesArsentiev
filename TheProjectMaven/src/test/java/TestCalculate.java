import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    final double ARG1 = 3;
    final double ARG2 = 3;
    final int DELTA = 1;
    Operation operation = new Operation();
    @Test
    public void MethodSubtractionShouldReturnZero() throws Exception {
        Assert.assertEquals(0, operation.ArgsAndSym(ARG1, ARG2, "-"), DELTA);
    }
    @Test
        public void MethodAdditionShouldReturnSix() {
        Assert.assertEquals(6, operation.ArgsAndSym(ARG1, ARG2, "+"), DELTA);
    }
    @Test
    public void MethodMultiplicationShouldReturnNine() {
        Assert.assertEquals(9, operation.ArgsAndSym(ARG1, ARG2, "*"), DELTA);
    }
    @Test
    public void MethodDivisionShouldReturnOne(){
    Assert.assertEquals(1,operation.ArgsAndSym(ARG1, ARG2, "/"),DELTA);
}
}
