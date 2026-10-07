/** Practica 2 patrones
*@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  29/09/2026
*/
// Paso 2
public class Civilizacion {

    // Paso 3
    private String Nombre;
    private String Era;
    private int Poblacion;
    private int Alimento;
    private int Madera;
    private int Oro;

    // Paso 4
    public Civilizacion(String n) {
        Nombre = n;
        Era = "I";
        Poblacion = 0;
        Alimento = 0;
        Madera = 0;
        Oro = 0;
    }


    public String getNombre() {
        return Nombre;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    // Paso 5
    public int getAlimento() {
        return Alimento;
    }

    public void setAlimento(int alimento) {
        if (alimento >= 0) {
            this.Alimento = alimento;
        }
    }

    public int getMadera() {
        return Madera;
    }

    public void setMadera(int madera) {
        if (madera >= 0) {
            this.Madera = madera;
        }
    }

    public int getOro() {
        return Oro;
    }

    public void setOro(int oro) {
        if (oro >= 0) {
            this.Oro = oro;
        }
    }

    // Paso 6
    public void crearAldeano() {
        if (Alimento >= 50) {
            Alimento = Alimento - 50;
            Poblacion = Poblacion + 1;
        }
    }

    // Paso 7
    public static void main(String[] args) {

        Civilizacion civilizacion1 = new Civilizacion("Gatos");
        Civilizacion civilizacion2 = new Civilizacion("Geckos");

        System.out.println("===== ESTADO INICIAL =====");

        System.out.println("Civilización 1: " + civilizacion1.getNombre());
        System.out.println("Alimento: " + civilizacion1.getAlimento());
        System.out.println("Madera: " + civilizacion1.getMadera());
        System.out.println("Oro: " + civilizacion1.getOro());
        System.out.println("Población: " + civilizacion1.getPoblacion());

        System.out.println();

        System.out.println("Civilización 2: " + civilizacion2.getNombre());
        System.out.println("Alimento: " + civilizacion2.getAlimento());
        System.out.println("Madera: " + civilizacion2.getMadera());
        System.out.println("Oro: " + civilizacion2.getOro());
        System.out.println("Población: " + civilizacion2.getPoblacion());


        civilizacion1.setAlimento(100);
        civilizacion1.setMadera(50);
        civilizacion1.setOro(30);

        civilizacion2.setAlimento(200);
        civilizacion2.setMadera(80);
        civilizacion2.setOro(60);


        civilizacion1.crearAldeano();
        civilizacion1.crearAldeano();

        civilizacion2.crearAldeano();

        System.out.println("\n===== ESTADO FINAL =====");

        System.out.println("Civilización 1: " + civilizacion1.getNombre());
        System.out.println("Alimento: " + civilizacion1.getAlimento());
        System.out.println("Madera: " + civilizacion1.getMadera());
        System.out.println("Oro: " + civilizacion1.getOro());
        System.out.println("Población: " + civilizacion1.getPoblacion());

        System.out.println();

        System.out.println("Civilización 2: " + civilizacion2.getNombre());
        System.out.println("Alimento: " + civilizacion2.getAlimento());
        System.out.println("Madera: " + civilizacion2.getMadera());
        System.out.println("Oro: " + civilizacion2.getOro());
        System.out.println("Población: " + civilizacion2.getPoblacion());
    }
}
