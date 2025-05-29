import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CUENTA DE AHORROS");
        System.out.print("INGRESE SALDO INICIAL = $");
        double saldo = sc.nextDouble();

        System.out.print("INGRESE TASA DE INTERES ANUAL = ");
        double tasa = sc.nextDouble();

        PM_CuentaAhorros cuenta = new PM_CuentaAhorros(saldo, tasa);

        int opcion;
        do {
            System.out.println("\nSELECCIONE UNA OPCION");
            System.out.println("1. DEPOSITAR");
            System.out.println("2. RETIRAR");
            System.out.println("3. VER SALDO");
            System.out.println("4. SALIR");
            System.out.print("OPCION: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese monto a depositar: ");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    break;
                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    double ret = sc.nextDouble();
                    if (cuenta.retirar(ret)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("SALDO = $%.2f\n", cuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion = 4);

        sc.close();
    }
}
