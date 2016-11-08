import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImpostoTest {

    public ImpostoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalcula() {
        System.out.println("entrou teste...");
        Orcamento orcamento = new Orcamento(100.0);
        Imposto imposto = new Imposto();
        // valor esperado, valor obtido
        assertEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
        System.out.println("saiu teste...");
    }

}