package J18_최상위클래스.entity;

import java.util.Objects;

public class School {
	
	private String schoolType;
	private String schoolName;
	private int schoolYear;
	private String schoolLocation;
	
	public School() {
		
		
	}

	public School(String schoolType, String schoolName, int schoolYear, String schoolLocation) {
		super();
		this.schoolType = schoolType;
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
		this.schoolLocation = schoolLocation;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getSchoolLocation() {
		return schoolLocation;
	}

	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolLocation, schoolName, schoolType, schoolYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolLocation, other.schoolLocation) && Objects.equals(schoolName, other.schoolName)
				&& Objects.equals(schoolType, other.schoolType) && schoolYear == other.schoolYear;
	}

	@Override
	public String toString() {
		return "School [schoolType=" + schoolType + ", schoolName=" + schoolName + ", schoolYear=" + schoolYear
				+ ", schoolLocation=" + schoolLocation + "]";
	}
	
	

}
