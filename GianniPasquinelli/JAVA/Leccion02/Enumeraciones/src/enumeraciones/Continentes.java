package enumeraciones;

public enum Continentes {
    AMERICA(33, "1.2 billones"),
    ASIA(27, "20.4 billones"),
    OCEANIA(8, "7 billones"),
    AFRICA(53, "12.8 billones"),
    EUROPA(26, "17.6 billones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
