import java.util.Scanner;

public class p3p6_1s22{
	public static void main(String[] args) {
		int sum=0;
		for (int num : a)
		sum+=num;
        sum=sum/(a.length);
        return sum;
	}

	public static int[] captura(){
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int x=0;x<10;x++){
		System.out.println("valores que tiene en la posicion["+(x+1)+"]: ");
		numeros[x]=teclado.nextInt();
		}
		return numeros;
	}
	    public static void main(String[] args) {
	    	int[] arreglo = captura();
	    	System.out.println("el promedio de los numeros es " +promedio(arreglo));
	    }
}