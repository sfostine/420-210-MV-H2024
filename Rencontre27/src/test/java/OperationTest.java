import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void diviserCasNormal() {
        Operation operation = new Operation();
        assertEquals(2.5, operation.diviser(5.0, 2.0));
    }

    @Test
    void VérificationNombrePair() {
        Operation operation = new Operation();
        assertEquals(true, operation.estPair(6));
        assertTrue(operation.estPair(6));
        assertFalse(operation.estPair(7));
    }





}