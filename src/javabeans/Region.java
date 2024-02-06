package javabeans;

import java.util.Objects;

public class Region {
	
	private int regionId;
	private String regionName;
	
	public Region(int Id, String Name){
		super();
		this.regionId = Id;
		this.regionName = Name;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionId, regionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return regionId == other.regionId && Objects.equals(regionName, other.regionName);
	
	}

	
	
	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName + "]";
	}
}
