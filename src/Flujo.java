
public class Flujo {
	
	public static void main(String[] args) throws MiException2{
		System.out.println("ini de main");
		try {
			metodo1();
		} catch (ArithmeticException | MiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("fin de main");
	}
	
	private static void metodo1() throws MiException2 {
		System.out.println("ini de metodo1");
			metodo2();
		System.out.println("Fin de metodo1 ");
	}
	
	private static void metodo2() throws MiException2{
		System.out.println("ini de metodo2");
		int a = 20/0;
		throw new MiException2("Mi excepcion fue lanzada");
	}
	
	
}

