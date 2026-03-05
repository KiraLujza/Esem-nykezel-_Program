import modell.Adatok;
import modell.Esemeny;
import java.time.LocalDateTime;

public class Program {

    //kész

    public static void main(String[] args) {

        Esemeny esemenykezelo = new Esemeny();

        esemenykezelo.addEsemeny(
                new Adatok(1, "Vizsga", "Kiss Péter", LocalDateTime.now())
        );

        System.out.println("Összes esemény száma: "
                    + esemenykezelo.osszEsemeny().size());
        }



}
