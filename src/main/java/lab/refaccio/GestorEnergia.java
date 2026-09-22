package lab.refaccio;

 
public class GestorEnergia {

    public static double calcularProduccio(String tipusPanell, double horesSol, int temperatura) {
        double produccioBase = 0;
        double rendimentFinal = 0;

        if (tipusPanell.equals("MONO")) {
            produccioBase = horesSol * 250; // 250W per hora per defecte
            if (horesSol > 7) {
                produccioBase = produccioBase + 50; // Bonus per alta exposició
            }
            if (temperatura > 25) {
                rendimentFinal = produccioBase - (produccioBase * 0.05); // 5% pèrdua calor
            } else {
                rendimentFinal = produccioBase;
            }
            System.out.println("Panell Monocristal·lí: " + rendimentFinal + " watts generats.");
            return rendimentFinal;

        } else if (tipusPanell.equals("POLY")) {
            produccioBase = horesSol * 200; // 200W per hora per defecte
            if (horesSol > 7) {
                produccioBase = produccioBase + 30; // Bonus per alta exposició
            }
            if (temperatura > 25) {
                rendimentFinal = produccioBase - (produccioBase * 0.08); // 8% pèrdua calor
            } else {
                rendimentFinal = produccioBase;
            }
            System.out.println("Panell Policristal·lí: " + rendimentFinal + " watts generats.");
            return rendimentFinal;

        } else if (tipusPanell.equals("FILM")) {
            produccioBase = horesSol * 150; // 150W per hora per defecte
            if (temperatura > 25) {
                rendimentFinal = produccioBase - (produccioBase * 0.02); // 2% pèrdua calor
            } else {
                rendimentFinal = produccioBase;
            }
            System.out.println("Panell Capa Fina: " + rendimentFinal + " watts generats.");
            return rendimentFinal;

        } else {
            System.out.println("Error: Tipus de panell no reconegut.");
            return -1;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        calcularProduccio("MONO", 8, 30);
        calcularProduccio("POLY", 6, 20);
        calcularProduccio("FILM", 9, 28);
        calcularProduccio("UNKNOWN", 5, 22);
    }
}
