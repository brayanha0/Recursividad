package Recursividad;

public class NumerosPrimosCubos {
	public static void main(String[] args) {
        imprimirNumerosPrimosCubo(3, 1);
    }

    public static void imprimirNumerosPrimosCubo(int num, int count) {
        if (count <= 10) {
            System.out.println(num + "^3 = " + (Math.pow(num, 3)));
            imprimirNumerosPrimosCubo(num+2, count+1);
        }
    }
    public class NumerosParesCubos2 {
    	public static void main(String[] args) {
            imprimirNumerosParesCubos(2, 1);
        }

        public static void imprimirNumerosParesCubos(int num, int count) {
            if (count <= 10) {
                System.out.println(num + "^3 = " + (Math.pow(num, 3)));
                imprimirNumerosParesCubos(num+2, count+1);
            }
        }
    }
}
