import org.junit.Assert;
import org.junit.Test;

public class JadenCaseTestSuite {
    @Test
    public void jadenCaseTest() {
        //Given
        String phrase = "moST tREes are blue";
        JadenCase jadenCase = new JadenCase();
        //When
        String result = jadenCase.toJadenCase(phrase);
        //Then
        Assert.assertEquals("Most Trees Are Blue", result);
    }
}
