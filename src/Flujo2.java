
public class Flujo2 {
	
	public static void main(String[] args) {
		System.out.println("ini de main");
		metodo1();
			System.out.println("fin de main");
	}
	
	private static void metodo1() {
		System.out.println("ini de metodo1");
		try {
			metodo2();
			
		}catch(MiException me){
			me.printStackTrace();
		}
		System.out.println("Fin de metodo1 ");
	}
	
	private static void metodo2(){
		System.out.println("ini de metodo2");
		throw new MiException("Mi excepcion fue lanzada");
	}
	
	
}

