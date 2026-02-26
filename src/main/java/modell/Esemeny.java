package modell;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Esemeny {

    private List<Adatok> esemenyek = new ArrayList<>();

    public void addEsemeny(Adatok adat) {
        esemenyek.add(adat);
    }

    public List<Adatok> osszEsemeny() {
        return new ArrayList<>(esemenyek);
    }

    public List<Adatok> keresesTipusSzerint(String tipus) {
        return esemenyek.stream()
                .filter(e -> e.getTipus().equalsIgnoreCase(tipus))
                .collect(Collectors.toList());
    }

    public List<Adatok> keresesSzemelySzerint(String szemely) {
        return esemenyek.stream()
                .filter(e -> e.getSzemely().equalsIgnoreCase(szemely))
                .collect(Collectors.toList());
    }

    public List<Adatok> keresesIdopontSzerint(LocalDateTime idopont) {
        return esemenyek.stream()
                .filter(e -> e.getIdopont().equals(idopont))
                .collect(Collectors.toList());
    }

    public Adatok keresesIdSzerint(int id) {
        return esemenyek.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}