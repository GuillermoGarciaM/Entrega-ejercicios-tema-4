package ejercicios_4;

public class Ejercicio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice device=new SmartDevice("Huawei", 2000, "blanco", 64);
		SmartPhone smartphone=new SmartPhone("Motorola", 1800, "negro", 128, 2.5, "Android", 8);
		SmartWatch smartwatch=new SmartWatch("Apple", 4000, "Azul", 32, 12, 8, "no");
		System.out.println(device);
		System.out.println(smartphone);
		System.out.println(smartwatch);
	
	}
}