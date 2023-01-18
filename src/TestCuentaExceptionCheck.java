
public class TestCuentaExceptionCheck {
	
	public static void main(String[] args) throws MiException2 {
		
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		} catch (MiException2 ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
}
