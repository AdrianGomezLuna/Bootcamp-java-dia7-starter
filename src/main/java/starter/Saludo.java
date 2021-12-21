package starter;

public class Saludo {
	
	private String idioma;

	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensajes ="";
		switch (idioma) {
		case "Castellano":
			mensajes = "Hola";	
			break;

		default:
			mensajes = "Hi all";
			break;
		}	
		return mensajes;
	}
	
	

}
