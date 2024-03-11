import junit.framework.TestCase;
import org.example.Triangulo;
import org.junit.Test;

public class MyTest extends TestCase {

    @Test
    public void testVerificaTriangulo() {

        int a = 8;
        int b = 10;
        int c = 3;

        Triangulo.verificaQualTipo(a,b,c);
//        assertTrue("ele NAO é um triangulo escaleno", Triangulo.verificaTringulo(a,b,c));
//
    }

    @Test
    public void testVerificaTringuloObstangulo() {
        int a = 10;
        int b = 10;
        int c = 5;

        assertTrue("ele NAO é um triangulo isoceles", Triangulo.verificaTringuloObstangulo(a, b, c));
    }

    @Test
    public void testVerificaTringuloAcutangulo() {
        // Arrange
        int a = 7;
        int b = 7;
        int c = 7;

        // Assert
        assertTrue( "ele NAO é um triango equilatero",Triangulo.verificaTringuloAcutangulo(a, b, c));
    }

    @Test
    public void testVerificaTringuloRetangulo() {
        // Arrange
        int a = 5;
        int b = 8;
        int c = 7;

        // Assert
        assertTrue("ele NAO e um tringulo ", Triangulo.verificaTringuloRetangulo(a, b, c));
    }

    @Test
    public void testVerificaTringuloIsosceles() {
        // Arrange
        int a = 5;
        int b = 5;
        int c = 7;

        // Assert
        assertTrue("Ele NAO e um tringulo isosceles",Triangulo.verificaTringuloIsosceles(a, b, c));
    }



}
