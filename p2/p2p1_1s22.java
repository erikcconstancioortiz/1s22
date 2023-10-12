import java.util.Scanner;

public class p2p1_1s22{
	public static void main(String[] args) {
		int opc = 3;
		int a,b,resultado;
		/*
		switch(opc){
		case 1:
            System.out.println("Aqui estamos en la primera opcion");
        case 2:
        	System.out.println("Aqui estamos en la segunda opcion");
        case 3:
        	System.out.println("Aqui estamos en la tercera opcion");
        	break;
        default:
        	System.out.println("No existe el valor dentro de los casos");
		}

		char opc1='a';
		switch(opc1){
		case 'a':
			System.out.println("selecciono A");
			break;
		case 'b':
			System.out.println("selecciono B");
			break;
		case 'c':
			System.out.println("selecciono C");
			break;
		default:
			System.out.println("no esta dentro de las opciones");
		}
		*/

        char opc2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introdusca una opcion s,r,m,d");

        opc2 = teclado.next().charAt(0);
        switch(opc2){
        case 's':
        	System.out.println("aqui iran las operaciones de suma");
        	System.out.println("introducir el primer numero");
        	a = teclado.nextInt();
        	System.out.println("introducir el segundo numero");
        	b = teclado.nextInt();
        	resultado = a+b;
        	System.out.println("el resultado es suma" + resultado);
        	break;
        case 'r':
        	System.out.println("aqui iran las operaciones de las resta");
        	System.out.println("introducir el primer numero");
        	a = teclado.nextInt();
        	System.out.println("introducir el segundo numero");
        	b = teclado.nextInt();
        	resultado = a-b;
        	System.out.println("el resultado es resta" + resultado);
        	break;
        case 'm':
        	System.out.println("aqui iran las operaciones de multiplicacion");
        	System.out.println("introducir el primer numero");
        	a = teclado.nextInt();
        	System.out.println("introducir el segundo numero");
        	b = teclado.nextInt();
        	resultado = a*b;
        	System.out.println("el resultado es multiplicacion" + resultado);
        	break;
        case 'd':
        	System.out.println("aqui iran las operaciones de la division");
        	        	System.out.println("introducir el primer numero");
        	a = teclado.nextInt();
        	System.out.println("introducir el segundo numero");
        	b = teclado.nextInt();
        	resultado = a/b;
        	System.out.println("el resultado es division" + resultado);
        	break;
        default:
        	System.out.println("no existe operacion a realizar");
        }
	}
}