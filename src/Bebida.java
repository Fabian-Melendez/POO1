import java.util.Scanner;

public class Bebida {
    private String mar;
    private String tam;
    private int val;
    private String sab;

    public Bebida() {
    }

    public Bebida(String mar, String tam, int val, String sab) {
        this.mar = mar;
        this.tam = tam;
        this.val = val;
        this.sab = sab;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getSab() {
        return sab;
    }

    public void setSab(String sab) {
        this.sab = sab;
    }

    @Override
    public String toString() {
        return "bebida{" +
                "marca='" + mar + '\'' +
                ", tamaño='" + tam + '\'' +
                ", precio=" + val +
                ", sabor='" + sab + '\'' +
                '}';
    }
    public static Bebida proceso1() {
        Scanner tlc = new Scanner(System.in);

        System.out.println("Seleccione la marca de la bebida: ");
        System.out.println("1. Coca-Cola");
        System.out.println("2. Pepsi");
        System.out.println("3. Fanta");
        int opcm = tlc.nextInt();
        tlc.nextLine();

        String mar;
        switch (opcm) {
            case 1 -> mar = "Coca-Cola";
            case 2 -> mar = "Pepsi";
            case 3 -> mar = "Fanta";
            default -> {
                System.out.println("Opción no válida, se seleccionará una marca genérica.");
                mar = "Marca generica";
            }
        }

        System.out.println("Elija el tamaño de la bebida: ");
        System.out.println("1/pequeño");
        System.out.println("2/mediano");
        System.out.println("3/grande");
        int opct = tlc.nextInt();
        tlc.nextLine();

        String tam;
        int val;
        switch (opct) {
            case 1 -> {
                tam = "pequeño";
                val = 2000;
            }
            case 2 -> {
                tam = "mediano";
                val = 3500;
            }
            case 3 -> {
                tam = "grande";
                val = 5000;
            }
            default -> {
                System.out.println("Opción no válida, seleccionando tamaño mediano.");
                tam = "Mediano";
                val = 3500;
            }
        }
        System.out.println("Ingrese el sabor de la bebida:");
        String sab = tlc.nextLine();
        return new Bebida(mar, tam, val, sab);
    }
}