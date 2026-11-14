import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void restaLosValoresAsignados() {
        assertEquals(44, inventario.resta(73, 29));
        

    }

    @Test
    void restaDosValoresIguales(){
        assertEquals(0, inventario.resta(12, 12));
    }
    
}
