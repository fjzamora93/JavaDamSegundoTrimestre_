package testing;
import javabeans.Region;
import javabeans.Country;
import javabeans.Location;


public class TestRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Region region1 = new Region(1, "Europa");
		
		Country pais1 = new Country("ES", "España", new Region(1, "Cataluña"));
		Country España = new Country("ES", "España", region1);
		
		
		
		Location ciudad = new Location(41, "Madrid", España);
		
		System.out.println(ciudad + "\n");
		
		System.out.println("LAS MATRIOSKAS: " + ciudad.getCountry().getRegion().getRegionName() 
				+ ", " + ciudad.getCountry().getCountryName()
				
				);
	}

}
