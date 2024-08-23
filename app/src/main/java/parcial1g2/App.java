
package parcial1g2;


public class App {


    

     public static void main(String[] args) {

        Scanner Juan = new Scanner(System.in);
        int cantidadVehiculoss = 0;
 
        while (true) {
            try {
                System.out.print("¿Cuantos vehículos quiere calcular? ");
                cantidadVehiculoss = Juan.nextInt();
 
                if (cantidadVehiculoss <= 0) {
                    System.out.println("El número de vehículos tiene que ser mayor que 0.");
                    continue;
                }
                break; 
 
            } catch (InputMismatchException e) {
                System.out.println("Error. ingrese un número entero.");
                Juan.next(); 
            }
        }
 
        for (int i = 1; i <= cantidadVehiculoss; i++) {
            int decada = 0;
            double avaluo = 0.0;
 
            while (true) {
                try {
                    System.out.print("\nVehículo " + i + ": Ingrese la década del modelo del vehículo (90, 00, 10, 20): ");
                    decada = Juan.nextInt();
 
                    if (decada != 90 && decada != 00 && decada != 10 && decada != 20) {
                        System.out.println("Error en la década. Debe ser 90, 00, 10 o 20.");
                        continue;
                    }
                    break; 
 
                } catch (InputMismatchException e) {
                    System.out.println("Error. ingrese un número entero.");
                    Juan.next(); 
                }
            }
 
            while (true) {
                try {
                    System.out.print("Ingrese el avalúo del vehículo: ");
                    avaluo = Juan.nextDouble();
 
                    if (avaluo <= 0) {
                        System.out.println("El avalúo debe ser un número entero");
                        continue;
                    }
                    break; 
 
                } catch (InputMismatchException e) {
                    System.out.println("Error. ingrese un número válido.");
                    Juan.next(); 
                }
            }
 
            double tasaRodamiento = obtenerTasaRodamiento(decada);
            double tasaSeguro = obtenerTasaSeguro(decada);
            double impuestoRodamiento = avaluo * tasaRodamiento;
            double seguro = avaluo * tasaSeguro;
            double totalAPagar = impuestoRodamiento + seguro;
 
            System.out.println("Avalúo: $" + avaluo);
            System.out.println("Década del vehículo: " + decada);
            System.out.println("Total a pagar: $" + totalAPagar);
        }
 
        Juan.close();
    }

    public static double obtenerTasaRodamiento(int decada) {
        switch (decada) {
            case 90:
                return 0.0409;
            case 00:
                return 0.0434;
            case 10:
                return 0.0493;
            case 20:
                return 0.0568;
            default:
                return 0.0; 
        }
    }
 
    public static double obtenerTasaSeguro(int decada) {
        switch (decada) {
            case 90:
                return 0.00816;
            case 00:
                return 0.00798;
            case 10:
                return 0.00712;
            case 20:
                return 0.00699;
            default:
                return 0.0; 
        }
    }

    }
    
   
        
        

    }
   


// Logica de solución
    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------


