package ejercicios_4;

public class SmartDevice {
	String Modelo;
	int precio;
	String color;
	int memoria;
	
	
	public SmartDevice() {
		
	}
	
	public SmartDevice(String Modelo,int precio,String color, int memoria) {
		this.Modelo=Modelo;
		this.precio=precio;
		this.color=color;
		this.memoria=memoria;
		
	}
	
	public String toString() {
		return "SmartDevice \n" +
                "Modelo=" + Modelo + ",\n" +
                "precio=$" + precio + ",\n" +
                "color=" + color + ",\n" +
                "memoria=" + memoria + " GB\n" 
                ;
		
	}
}
