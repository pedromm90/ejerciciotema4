public class Main {
    public static void main(String[] args) {
        System.out.println("**Ejercicios tema 4**");
            int numeroIf = 0; // Inicialmente es 0
            int numeroWhile = 1; // Variable While
            int numeroDoWhile = 3; // Variable Do While
            var estacion = "Verano"; // Inicialmente Verano


        System.out.println("** Parte1: Compare si la variable numeroIf es positivo, negativo o 0");
        if (numeroIf < 0) {
            System.out.println(numeroIf+" es un número negativo, y es menor que 0");
        } else if (numeroIf > 0) {
            System.out.println(numeroIf+" es un número positivo, y es mayor que 0");
        } else {
            System.out.println("El valor de la variable numeroIf es "+numeroIf);
        }

        System.out.println("** Parte 2: Crear un bucle While donde tendrá como condición variable numeroWhile que sea inferior a 3");
        while (numeroWhile < 3) {
            numeroWhile++; //incremento de a 1
            System.out.println("La variable numeroWhile ahora vale: "+numeroWhile);

            System.out.println("** Parte 3: Bucle Do While. Una sola ejecución");
            do {
                numeroDoWhile++; // incremento de a 1
                System.out.println("La variable numeroDoWhile ahora vale: "+numeroDoWhile);
            } while (numeroDoWhile < 3);

            System.out.println("** Parte 4: Bucle For variable numeroFor = 0 con condición de que sea menor o igual a 3 y con incremento de a 1");
            for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
                System.out.println(numeroFor);
            }
        }

        System.out.println("** Parte 5: Switch y cases de las estaciones del año");
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
            break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
            default:
                System.out.println("No es una estación");
        }
    }
}