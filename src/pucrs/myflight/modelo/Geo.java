package pucrs.myflight.modelo;
/** *
 * Uma parte do código já existia na base para o exercício, fomos adicionando conforme os exercícios no pdf
 * e seguiamos as instruções de cada pdf. Aqui temos a classe geolocalização, com latitude e longitude.
 * Possui dois métodos diferentes para calcular a distância, uma recebe duas geos e calcula a distância entre elas
 * e a outra recebe uma geo para calcular a distância com os dados armazanados. 
 * 
 * @author Carol e Kristen
 * @version 19 agosto, 1 e 22 de setembro
 * 
*/
public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo um, Geo dois) {
		double e = (Math.toRadians(um.getLatitude())-Math.toRadians(dois.getLatitude()))/2;
		double c = Math.pow(Math.sin(e),2);

		double d = (Math.toRadians(um.getLongitude()) - Math.toRadians(dois.getLongitude()))/2;
		double f = Math.pow(Math.sin(d),2) * Math.cos(Math.toRadians(um.getLatitude())) * Math.cos(Math.toRadians(dois.getLatitude()));
		
		double b = Math.sqrt(c+f);
		double a = 2*(6371)*Math.asin(b);
		return a;
	}

	public double distancia(Geo geo) {
		double e = (Math.toRadians(geo.getLatitude())-Math.toRadians(latitude))/2;
		double c = Math.pow(Math.sin(e),2);

		double d = (Math.toRadians(geo.getLongitude()) - Math.toRadians(longitude))/2;
		double f = Math.pow(Math.sin(d),2) * Math.cos(Math.toRadians(geo.getLatitude())) * Math.cos(Math.toRadians(latitude));
		
		double b = Math.sqrt(c+f);
		double a = 2*(6371)*Math.asin(b);
		return a;
	}

	public String toString() {
		return latitude + "/" + longitude;
	}
	
}
