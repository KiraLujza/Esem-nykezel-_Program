package modell;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EsemenyTest {

    private Esemeny esemenykezelo;

    @BeforeEach
    void setUp() {
        esemenykezelo = new Esemeny();

        esemenykezelo.addEsemeny(
                new Adatok(1, "Vizsga", "Kiss Péter", LocalDateTime.now())
        );
        esemenykezelo.addEsemeny(
                new Adatok(2, "Konferencia", "Nagy Anna", LocalDateTime.now())
        );
    }

    @Test
    void addEsemenyTeszt() {
        assertEquals(2, esemenykezelo.osszEsemeny().size());
    }

    @Test
    void keresesTipusSzerintTeszt() {
        List<Adatok> eredmeny = esemenykezelo.keresesTipusSzerint("Vizsga");

        assertEquals(1, eredmeny.size());
        assertEquals("Kiss Péter", eredmeny.get(0).getSzemely());
    }

    @Test
    void keresesSzemelySzerintTeszt() {
        List<Adatok> eredmeny = esemenykezelo.keresesSzemelySzerint("Nagy Anna");

        assertEquals(1, eredmeny.size());
        assertEquals("Konferencia", eredmeny.get(0).getTipus());
    }

    @Test
    void keresesIdSzerintTeszt() {
        Adatok adat = esemenykezelo.keresesIdSzerint(2);

        assertNotNull(adat);
        assertEquals("Nagy Anna", adat.getSzemely());
    }
}