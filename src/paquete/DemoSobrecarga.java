package paquete;

public class DemoSobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sobrecarga objeto = new Sobrecarga();
		objeto.prueba();
		objeto.prueba(29);
		objeto.prueba(21, 19);
		objeto.prueba(-2.5, 10.5, 5.1);
	}

}

class Sobrecarga{
	public void prueba(){
		System.out.println("Metodos sin argumentos");
	}
	//Sobrecarga de prueba() con un parámetro int
	
	public void prueba(int x){
		System.out.println(" Metodo con 1 argumento. ");
		System.out.println(" x = "+x);
	}
	//Sobrecarga de prueba() con 2 parámetros
	
	public void prueba(int x, int y){
		System.out.println(" Metodo con 2 argumentos. ");
		System.out.println(" x = "+x+ " y = "+y);
	}
	//Sobrecarga de prueba() con 3 parámetros
	
	public void prueba(double x, double y, double z){
		System.out.println(" Metodo con 3 argumentos. ");
		System.out.println(" x = "+x+ " y = "+y+ " z = "+z);
	}
}