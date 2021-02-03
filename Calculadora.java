/*
  Angel Santiago Marquez Lopez 
 */
package calculadora.app1;

import java.util.Scanner;

public class Calculadora1app {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while(bandera){
        System.out.println("\tCalculadora");
        System.out.println("1.Sumar \n2.Restar \n3.Multiplicar \n4.dividir \n5.Seno \n6.Coseno \n7.Tangente \n8.Radicacion \n9.Potenciacion \n10Iva \n11.Salir");
        System.out.println("ingrese la opcion deseada");
        int opcion;
        opcion = entrada.nextInt();
        
        switch(opcion)
        {
            case 1:
                System.out.println("\tSuma");
                System.out.println("ingrese cantidad de numeros para sumar");
                int cantidad = entrada.nextInt();
                float suma = 0;
                for(int i=0;i<cantidad;i++)
                {
                    System.out.println("ingrese el numero:"+(i+1));
                    suma =suma+entrada.nextInt();
                }
            {         
                System.out.println("\n\t|1La suma es = "+ suma+"\n");
            }
            break;
            case 2:
                System.out.println("\tResta");
                System.out.println("ingrese cantidad de numeros para restar");
                cantidad = entrada.nextInt();
                float resta = 0;
                System.out.println("Ingrese el primer numero para restar");
                resta=entrada.nextInt();
                for(int i=0;i<(cantidad-1);i++)
                {
                    System.out.println("ingrese el numero:"+(i+2));
                    resta =resta-entrada.nextInt();
                }
            {         
                System.out.println("\n\tLa resta es = "+ resta+"\n");
            }
            break;
            case 3:
                System.out.println("\tMultiplicacion");
                System.out.println("ingrese cantidad de numeros para multiplicar");
                cantidad = entrada.nextInt();
                float multiplicacion = 1;
                for(int i=0;i<cantidad;i++)
                {
                    System.out.println("ingrese el numero:"+(i+1));
                    multiplicacion = multiplicacion*entrada.nextInt();
                }
            {         
                System.out.println("\n\tLa multiplicacion es = "+ multiplicacion+"\n");
            }
            break;
            case 4:
                System.out.println("\tDivicion");
                System.out.println("ingrese el dividendo");
                float dividendo,divisor,division;
                dividendo = entrada.nextInt();
                System.out.println("ingrese el divisor");
                divisor = entrada.nextInt();
                division= dividendo/divisor;
            {         
                System.out.println("\n\tLa division es = "+ division+"\n");
            }
            break; 
            case 5:
                System.out.println("\tSeno");
                System.out.println("ingrese el valor al cual aplicar el seno");
                float num;
                num = entrada.nextInt();
                System.out.println(("El seno del numero es = " )+(Math.sin(Math.toRadians(num)))+"\n");
            break;
            case 6:
                System.out.println("\tCoseno");
                System.out.println("ingrese el valor al cual aplicar el coseno");
                num=0;
                num = entrada.nextInt();
                System.out.println(("El coseno del numero es = " )+(Math.cos(Math.toRadians(num)))+"\n");
            break;
            case 7:
                System.out.println("\tTangente");
                System.out.println("ingrese el valor al cual aplicar la tangente");
                num=0;
                num = entrada.nextInt();
                System.out.println(("La tangente del numero es = " )+(Math.tan(Math.toRadians(num)))+"\n");
            break;
            case 8:
                System.out.println("\tRadicación");
                double indice, radicando,resultado;
                System.out.println("Ingrese el radicando");
                radicando = entrada.nextInt();
                System.out.println("Ingrese el indice");
                indice = entrada.nextInt();
                resultado = (float) Math.pow(radicando, 1 / indice);
                System.out.println("La raiz " + indice + " de " + radicando + " es : " + resultado+"\n");
                break;
            case 9:
                System.out.println("\tPotenciacion");
                indice=0;
                resultado=0;
                double base=0;
                
                System.out.println("Ingrese la base");
                radicando = entrada.nextInt();
                System.out.println("Ingrese el indice");
                indice = entrada.nextInt();
                resultado = (float) Math.pow(radicando,indice);
                System.out.println("la potecia de " + radicando +"a la " + indice + " es : " + resultado+"\n");
                break;
            case 10:
                System.out.println("\tIva");
                System.out.println("Ingrese el precio del producto");
                double ptotal,Iva, precio= entrada.nextInt();
                Iva=precio*0.19;
                ptotal=precio+Iva;
                System.out.println("el iva del producto es: "+Iva+" el precio total es: "+ptotal);
                break;
            case 11:
                System.out.println("\tSALIR");
                bandera=false;
        }
        
        }
        
    }
    
}
