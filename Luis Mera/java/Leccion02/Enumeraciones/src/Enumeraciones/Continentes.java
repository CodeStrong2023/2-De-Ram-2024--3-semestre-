package Enumeraciones;

public enum Continentes {
    AFRICA(53, "1.2 Billones"), AMERICA(34, "1.1 Billones" ), ASIA(44, "1.6 Billones"), EUROPA(46, "1.1 Billones"), OCEANIA(14, "1.5 Billones");

    private final int paises;
    private final String habitantes;


    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes= habitantes;
    }
    public int getPaises(){
        return this.paises;
    }

    public String getHabitantes(){
        return this.habitantes;
    }
}