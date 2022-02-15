import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exo2Test {
    @Test
    public void testSomme(){
        //Acteur;
        Exo2 frac = new Exo2();

        //Action + Assertion
        assertEquals(1,frac.somme((float) (1.0/2.0), (float) (1.0/2.0)));
        assertEquals(0,frac.difference((float) (1.0/2.0), (float) (1.0/2.0)));
        assertEquals(0.25,frac.product((float) (1.0/2.0), (float) (1.0/2.0)));
        assertEquals(1,frac.division((float) (1.0/2.0), (float) (1.0/2.0)));
        assertEquals(0.5,frac.reduction((float)(1.0/2.0)));

    }
}