public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,3,4,5,6,7);
        imprimirNumeros(0,1);
        variosParametros("Lorena", "Artieda",2,4,5,6);
    }

    private static void variosParametros(String nombre, String apellido,int ...numeros){
        System.out.println("Nombre: "+nombre+ "\nApellido: "+ apellido);

        for(int i=0; i<numeros.length;i++){
            imprimirNumeros(numeros[i]);
        }
    }
    private static void imprimirNumeros(int ...numeros){
        for(int i =0; i < numeros.length; i++){
            System.out.println("Elementos: "+ numeros[i]);
        }

    }
}