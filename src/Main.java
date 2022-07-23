public class Main {
    public static void main(String[] args) {


        // If loop
        System.out.println("If loop");
        int numeroIf = 0;

        if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        }


        //While loop
        System.out.println("While loop");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }


        //Do while loop
        System.out.println("Do While loop");
        int numeroDoWhile = 0;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);


        //For loop
        System.out.println("For loop");
        int numeroFor = 0;

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }


        //Switch loop
        System.out.println("Switch loop");
        var estacion = "Invierno";

        switch (estacion) {
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            default:
                System.out.println("No es una estación válida");
        }
    }
}