package javabeans;

import java.util.Objects;

public class Location {
	private int locationId;
	private String calle;
	
	//NOS TRAEMOS EL PAÍS ENTERO, NADA DE TRAERSE SOLO LA ID
	//LO TRAEMOS TODITO Y TODO LO QUE HAYA DENTRO DEL PAÍS
	private Country country;

	public Location(int locationId, String calle, Country country) {
		super();
		this.locationId = locationId;
		this.calle = calle;
		this.country = country;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(locationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return locationId == other.locationId;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", calle=" + calle + ", country=" + country + "]";
	}
	
	

}
