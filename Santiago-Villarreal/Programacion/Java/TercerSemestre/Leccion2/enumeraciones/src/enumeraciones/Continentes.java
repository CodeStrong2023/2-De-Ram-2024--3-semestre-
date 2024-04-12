package TercerSemestre.Leccion2.enumeraciones.src.enumeraciones;

public enum Continentes {
    AFRICA(56, "1.216 millones"),
    EUROPA(50,"746,4 millones"),
    ASIA(51,"4.561 millones"),
    AMERICA(35, "1002 millones"),
    OCEANIA(14,"43 millones");

    private final int paises;
    private String habitantes;

    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return paises;
    }

    public String getHabitantes(){
        return this.habitantes;
    }

}
