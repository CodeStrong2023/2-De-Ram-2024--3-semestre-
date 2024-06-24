package Enumeraciones;

public enum Continentes  {
    AFRICA(53, "1.2 Billones"),
    EUROPA(46, "1.1 Billones"),
    ASIA(44, "1.9 Billones"),
    AMERICA(34, "1.2 Billones"),
    OCEANIA(14, "0.3 Billones");

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return paises;
    }
    public String getHabitantes() {
        return habitantes;
    }

}
