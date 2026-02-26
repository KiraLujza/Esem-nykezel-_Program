package modell;

import java.time.LocalDateTime;

public class Adatok  {

    private int id;
    private String tipus;
    private String szemely;
    private LocalDateTime idopont;

    public Adatok(int id, String tipus, String szemely, LocalDateTime idopont) {
        this.id = id;
        this.tipus = tipus;
        this.szemely = szemely;
        this.idopont = idopont;
    }

    public int getId() {
        return id;
    }

    public String getTipus() {
        return tipus;
    }

    public String getSzemely() {
        return szemely;
    }

    public LocalDateTime getIdopont() {
        return idopont;
    }
    //kivettem a setter-eket hogy ne lehessen az adatokat utólag változtatni

    @Override
    public Adatok clone() {
        try {
            return (Adatok) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Klónozás nem sikerült");
        }
    }
}