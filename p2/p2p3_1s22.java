public class p2p3_1s22{
	public static void main(String[] args) {
		int a=0;

		while(a<10){
			System.out.println("el valor de a vale "+a);
			a++;
		}

		a=0;
		while(true){
			System.out.println("nuevamente a vale "+a);
			if (a>10) break;
			a++;
		}

		boolean estado = false;

		while(estado){
			System.out.println("se montrara esta linea?");
		}
	}
}