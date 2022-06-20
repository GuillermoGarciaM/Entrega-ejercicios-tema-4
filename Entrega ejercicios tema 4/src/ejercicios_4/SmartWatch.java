package ejercicios_4;

public class SmartWatch extends SmartDevice{
	int pila;
	int metrosSumergibles;
	String compatible;
	
	public SmartWatch() {}
	
	public SmartWatch(String Modelo,int precio,String color, int memoria,int pila,int metrosSumergibles,String compatible) {
		super (Modelo,precio,color,memoria);
		this.pila=pila;
		this.metrosSumergibles=metrosSumergibles;
		this.compatible=compatible;
		
	}
	
	public String toString() {
		return "SmartWatch \n" +
                "Modelo=" + Modelo + ",\n" +
                "precio=$" + precio + ",\n" +
                "color=" + color + ",\n" +
                "memoria=" + memoria + " GB\n" +
                "Duracion de la bateria=" + pila + " horas \n" +
                "Metros que se puede sumergir=" + metrosSumergibles + "m \n" +
                "Es compatilbe con su telefono = " + compatible ;
		
	}
}
