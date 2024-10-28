import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //// en este ejercicio se tiene que tomar en cuenta que piden en la guia dos
        ///tipos de datos para los array el de trimestre y los vendedores

        Scanner teclado = new Scanner(System.in);

        //Ingresar cantidad de vendedores
        System.out.println("Ingrese cantidad de vendedores");
        int cantidadVendedores = teclado.nextInt();

        //declaramos los arregos y llenamos el primero con lo del teclado
        String[] nombres = new String[cantidadVendedores];
        double[][] ventasTrimestrales = new double[cantidadVendedores][4];

        // con for llenamos los nombres y las ventas de cada vendedor

        for(int i = 0;i<cantidadVendedores;i++){
            System.out.println("ingrese el nombre vendedor "+(i+1)+" :");
            nombres[i] = teclado.next();

            ///imporante que el segundo for recorra dentro del otro
            for (int j = 0; j<4;j++){
                System.out.println("ingrese venta trimestre "+(j+1)+" del vendedor :" + nombres[i]);
                ventasTrimestrales[i][j] = teclado.nextDouble();
            }
        }

         ///ahora calculamos el promedio y lo guardamos en un arreglo

        double[] promedioVentas = new double[cantidadVendedores];

        for (int k = 0;k<cantidadVendedores;k++){
           double sumaPromedios = 0;

           for (int l=0; l<4; l++){
               sumaPromedios += ventasTrimestrales[k][l];
           }

           promedioVentas[k] = sumaPromedios/4;
        }

         ///7Mosramos los promedios de los trimetres de lod vendedores

        System.out.println("\nInforme de promedios de ventas por vendedor:");
        double sumaPromedios = 0;

        for (int i = 0; i < cantidadVendedores; i++) {
            System.out.println("Vendedor: " + nombres[i] + " - Promedio de ventas: " + promedioVentas[i]);
            sumaPromedios += promedioVentas[i]; // Sumar cada promedio al total
        }

         // Calculamos el promedio general de todos los vendedores
        double promedioGeneral = sumaPromedios / cantidadVendedores;
        System.out.println("\nPromedio general de ventas de todos los vendedores: " + promedioGeneral);


    }
}


//////Sergio_Urrieta