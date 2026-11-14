public class inventario {
    public static int resta(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    public static void main(String[] args) {
        int minuendo = 73;
        int sustraendo = 29;
        int resultado = resta(minuendo, sustraendo);
        System.out.println(minuendo + " - " + sustraendo + " = " + resultado);
    }
}