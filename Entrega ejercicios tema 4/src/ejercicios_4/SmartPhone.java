package ejercicios_4;

public class SmartPhone extends SmartDevice{
	double version;
	String sistemaOperativo;
	int ram;
	
	
	public SmartPhone() {}
	
	public SmartPhone(String Modelo,int precio,String color, int memoria, double version,String sistemaOperativo,int ram) {
		super(Modelo, precio,color,memoria);
		this.version=version;
		this.sistemaOperativo=sistemaOperativo;
		this.ram=ram;
		
	}
	
	public String toString() {
		return "SmartPhone \n" +
                "Modelo=" + Modelo + ",\n" +
                "precio=$" + precio + ",\n" +
                "color=" + color + ",\n" +
                "memoria=" + memoria + " GB\n" +
                "version=" + version + "\n"+
                "Sistema Operativo=" + sistemaOperativo + "\n" +
                "Memoria RAM=" + ram + " GB\n"
                ;
		
	}
}
