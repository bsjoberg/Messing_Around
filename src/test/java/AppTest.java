import org.example.Hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testHello(){
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void testSayingHi() {
        Assertions.assertEquals("hello world", new Hello().sayHi());
    }
}
