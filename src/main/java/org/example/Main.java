
package org.example;

public class Main {
    public static void main(String[] args) {

        String[] dnaHorizontal = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        String[] dnaVertical = {"GTGCGA","GAGTGC","ATATGT","AGAAGG","ACGCTA","ACACTG"};
        String[] dnaDiagonal = {"ATGCGA","CAGTGC","TTATGT","AGGAGG","CCCCTA","TCACTG"};
        String[] dnaDiagonalInvertida = {"ATGCGA","CCCTGC","TTATGT","AGGAGG","CCCCTA","TCACTG"};
        String[] dnaNoMutante = {"AAAGAA","CCCGCC","TTTGTT","GGGAGG","AAAGAA","CCCGCC"};
        String[] dnaMenosDe4 = {"ATG","AAG","ATA"};

        Magneto magneto1 = new Magneto();

        boolean resultado = magneto1.isMutant(dnaNoMutante);

        if (resultado){
            System.out.println("Es Mutante");
        }else {
            System.out.println("No es Mutante");
        }
    }
}

