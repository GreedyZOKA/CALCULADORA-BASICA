import java.util.Scanner;

import static java.util.Scanner.*;

public class PrincipalCalculadora {

   static Scanner scanner=new Scanner(System.in);
    public static void menu(){
        escan.escribirLn("######### MENU PRINCIPAL #########");
        escan.escribirLn("0- Salir");
        escan.escribirLn("1- Sumar");
        escan.escribirLn("2- Restar");
        escan.escribirLn("3- Multiplicar");
        escan.escribirLn("4- Dividir");
    }

    public static int suma(int num1, int num2){
        int suma=0;
        suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2){
        int resta=0;
        resta = num1 - num2;
        return resta;
    }
    public static int multplicar(int num1,int num2){
        int multiplicar=0;
        multiplicar = num1 * num2;
        return multiplicar;
    }
    public static float division (float num1,float num2){
        float division=0;
        division = num1 / num2;
        return division;
    }

    public static void main(String[] args) {

        int num1;
        int num2;
        // Tiene que escribirse siempre
        menu();
        int opcion =0;
        opcion = escan.leerEntero(">> Ingrese una opción");
        do {
            escan.escribirLn("######### MENU PRINCIPAL #########");
            escan.escribirLn("0- Salir");
            escan.escribirLn("1- Sumar");
            escan.escribirLn("2- Restar");
            escan.escribirLn("3- Multiplicar");
            escan.escribirLn("4- Dividir");
            opcion=scanner.nextInt();
            switch ( opcion ){
                case 0:
                    escan.escribirLn("Adios, vuelva pronto.");
                    break;
                case 1:
                    escan.escribirLn("##### Vamos a sumar ####");
                    num1 = escan.leerEntero("\tIngrese el primer sumando");
                    num2 = escan.leerEntero("\tIngrese el segundo sumando");
                    escan.escribirLn("La suma de "+ num1 + " + " + num2 + " es: " + suma(num1, num2));
                    break;
                case 2:
                    escan.escribirLn("##### Vamos a restar ####");
                    num1 = escan.leerEntero("\tIngrese el minuendo");
                    num2 = escan.leerEntero("\tIngrese el sustraendo");
                    escan.escribirLn("La diferencia de "+ num1 + " - " + num2 + " es: " + resta(num1, num2));
                    break;
                case 3:
                    escan.escribirLn("#### Vamos a multiplicar");
                    num1 = escan.leerEntero("\tIngresa el primer factor");
                    num2 = escan.leerEntero("\tIngresa el segundo factor");
                    escan.escribirLn("El resultado "+ num1+" * "+ num2+" es: "+  multplicar(num1,num2));
                    break;
                case 4:
                    escan.escribirLn("#### Vamos a dividir");
                    num1 = escan.leerEntero("\tIngresa el primer dividiendo");
                    num2 = escan.leerEntero("\tIngresa el segundo divisor");
                    escan.escribirLn("El resultado "+ num1+" / "+ num2+" es: "+  division(num1,num2));
                    break;

            }
        }
        while (opcion!=0);
        // Haste este punto deberá repetirse
    }
}

