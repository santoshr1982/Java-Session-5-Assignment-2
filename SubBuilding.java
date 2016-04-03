package Types.Of.Building;

public class SubBuilding extends SuperBuilding {

	public void ComercialBuilding(String strProjectName ,double dProjectArea,int intNumberOfShops,double dFlatArea  ) {
		
		super.strNameOfTheProject = strProjectName;
		super.dTotalAreaOfTheProject = dProjectArea;
		super.intNumberOfFlats = intNumberOfShops;
		super.dAreaOfTheFlat = dFlatArea;
		
		System.out.println("The name of the comercial project is " + strNameOfTheProject + ".");
		System.out.println("");
		System.out.println("The total area of the project is " + dTotalAreaOfTheProject + "acers.");
		System.out.println("");
		System.out.println("The total number of shops in the project are " + intNumberOfFlats + "Nos.");
		System.out.println("");
		System.out.println("The area of the flat is : " + dAreaOfTheFlat + "Sqft.");
		System.out.println("");
		
	}

}
