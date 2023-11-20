// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * Número de trtabajadores con sueldo entre 1000 y 1750
     *
     */
            static Integer contador1750 =0;
    /**
     * Número de trabajadores sueldo menor de 1000
     */
    static Integer contador1000 =0;
    /**
     * Número de trabajadores ricos
     *
     */
   static Integer contadorMás1750 =0;
    //trabajador

    /**
     * Aumenta contador según rango del sueldo del trabajador
     * @param args no recibe parámetros
     */


    public static void main(String[] args) {
        Trabajador auxTrabajador;
        //Funciones obxFunciones = new Funciones();
        do{
            auxTrabajador = Funciones.darAltaTrabajador();
            actualizarContadores(auxTrabajador);
        }while(auxTrabajador.getSueldo() !=0);

        mostrarContadores();
    }

    /**
     * Aumenta contadores según rango
     */
                public static void actualizarContadores(Trabajador auxTrabajador){
                    if(Funciones.obtenerSueldo1750(auxTrabajador.getSueldo())){
                        contador1750++;

                    }else if (Funciones.obtenerSueldo1000(auxTrabajador.getSueldo())){
                        contador1000++;
                    }
                }

                public static void mostrarContadores(){
                    System.out.println("Entre 1000-1750: "+ contador1750 + "\nMenos de 1000: "+contador1000);
                }

}