package Types.Of.Building;

public class SuperBuilding {
	
	
	int intNumberOfFlats;
	int intNumberOfAmenities;
	int intNumberOfTowers;
	double dAreaOfTheFlat;
	double dTotalAreaOfTheProject;
	String strAmenities[]= new String[12];
	String strNameOfTheProject;
	String strNameOfTheTowers[]=new String[12];
	
	
	public void ResidentialBuildings(String strProjectName, double dProjectArea,int intNumberOfShops,int intTowers,String strTowers[],double dFlatArea,int intAmenities,String strNameOfAmenities[]) {
		
		intNumberOfFlats = intNumberOfShops;
		intNumberOfAmenities = intAmenities;
		intNumberOfTowers = intTowers;
		dAreaOfTheFlat = dFlatArea;
		dTotalAreaOfTheProject = dProjectArea;
		for (int i=0; i < strNameOfTheTowers.length; i++)
		{
			
			strNameOfTheTowers[i] = strTowers[i];
			
		}
		strNameOfTheProject = strProjectName;
		for (int i=0; i < strNameOfTheTowers.length; i++)
		{
			
			strAmenities[i] = strNameOfAmenities[i];
			
		}		
		
		
		System.out.println("The name of the resedential project is " + strNameOfTheProject + ".");
		System.out.println("");
		System.out.println("The total area of the project is " + dTotalAreaOfTheProject + " Acers.");
		System.out.println("");
		System.out.println("The total number of blocks in the project are " + intNumberOfTowers + ".");
		System.out.println("");
		System.out.println("The names of the towers in the project are as follows:");
		System.out.println("");
		for (int i=0; i < intNumberOfTowers; i++)
		{
			
			System.out.println(i+1 + "." + strNameOfTheTowers[i] + ".");
			System.out.println("");
			
		}
		
		System.out.println("The total number of flats in the project are " + intNumberOfFlats + " Nos.");
		System.out.println("The area of the flat is : " + dAreaOfTheFlat + "Sqft.");
		System.out.println("The total number of amenities available in the project " + intNumberOfAmenities + "." + "They are as follows");
		System.out.println("");
		for (int i=0; i < intAmenities; i++)
		{
			
			System.out.println(i+1 + "." + strAmenities[i] + ".");
			System.out.println("");
			
		}
		
	}

}
