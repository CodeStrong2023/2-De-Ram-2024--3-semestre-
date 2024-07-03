package enumeraciones;

public enum Continentes {
        America (34, "1.2 billones"),
        Africa (53, "1.2 billones"),
        Oceania (14, "1.3 billones"),
        Europa (46, "1.1 billones"),
        Asia (44, "1.9 billones");
        
        private final int paises;
        private String habitantes;
        
        Continentes(int paises, String habitantes){
            this.paises = paises;
            this.habitantes = habitantes;
        }
        
        
        //Metodo GET
        public int getPaises(){
            return this.paises;
        }
        
        public String getHabitantes(){
            return this.habitantes;
        }
}
