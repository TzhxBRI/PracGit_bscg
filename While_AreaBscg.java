
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class While_AreaBscg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, altura, area;
        int n = 1;

        while (n <= 5 ) {
            System.out.print("Teclea la base del rectangulo: ");
            base = sc.nextInt();

            System.out.print("Teclea la altura del rectangulo: ");
            altura = sc.nextInt();

            area = base * altura;

            System.out.println("El area del rectangulo es: " + area);

            n++;
        }

        sc.close();
    }
}