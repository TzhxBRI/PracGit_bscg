
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Wile_EdadBscg {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anioAct, anioNac, edad;
        int n = 1;

        while (n <= 3) {
            System.out.print("Teclea el año actual: ");
            anioAct = sc.nextInt();

            System.out.print("Teclea el año de nacimiento: ");
            anioNac = sc.nextInt();

            edad = anioAct - anioNac;

            System.out.println("Su edad es: " + edad);

            n = n + 1;
        }

        sc.close();
    }
}