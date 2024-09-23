import java.util.Scanner;

public class Proyecto01_Sueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sueldos = new double[5];
        double totalSueldos = 0;

        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
            totalSueldos += sueldos[i];
        }

        double sueldoPromedio = totalSueldos / sueldos.length;

        System.out.println("Total de sueldos: " + totalSueldos);
        System.out.println("Sueldo promedio: " + sueldoPromedio);
    }
}
