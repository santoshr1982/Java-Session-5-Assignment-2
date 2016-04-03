package Types.Of.Building;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String strProjectName;	
		String strTowers[]= new String[12];
		double dProjectArea;
		int intNumberOfShops;
		int intTowers;
		double dFlatArea;
		int intAmenities;
		String strNameOfAmenities[]= new String[12];
		
		int iChoice;
		{
		Scanner sC = new Scanner(System.in);	//Initialization of input scanner.
		

		iChoice=0;
		
		while (iChoice < 3)						//While loop to display menu.
		{
		
			System.out.println("1. Enter the details of residential buidling.");		// display menu.
			System.out.println("2. Enter the details of comercial building.");
			System.out.println("3. Exit");
			System.out.println("Please enter your choice: ");
			iChoice = sC.nextInt();		//Accept input.

			
			SuperBuilding objSb = new SuperBuilding();
			SubBuilding objSub= new SubBuilding();
			
			
			switch(iChoice)											// Switch case.
			{
			
			
			case 1: System.out.println("Please enter the name of the project(Enter the name of the project without space): ");
					strProjectName = sC.next();

					System.out.println("Please enter the area of the project in acers: ");
					dProjectArea = sC.nextDouble();
					System.out.println("Please enter the number of flats in Nos.: ");
					intNumberOfShops = sC.nextInt();
					System.out.println("Please enter the area of flat in Sqft: ");
					dFlatArea = sC.nextDouble();
					System.out.println("Please enter the number of towers in the project: ");
					intTowers = sC.nextInt();
					System.out.println(intTowers);
					System.out.println("Enter the name of the towers (Enter the name of the project without space) : ");
					for (int i=0; i < intTowers; i++)
					{
					
						strTowers[i] = sC.next();
					
					}
					System.out.println("Please enter the number of amenties in the project: ");
					intAmenities = sC.nextInt();
					System.out.println("Please enter the name of amenties in the project (Enter the name of the project without space): ");
					for (int i=0; i < intAmenities; i++)
					{
						
						strNameOfAmenities[i] = sC.next();
						
					}
					
					objSb.ResidentialBuildings(strProjectName, dProjectArea, intNumberOfShops, intTowers, strTowers, dFlatArea, intAmenities, strNameOfAmenities);
					break;
			
			case 2: System.out.println("Please enter the name of the comercial project(Enter the name of the comercial project without space): ");
					strProjectName = sC.next();
					System.out.println("Please enter the area of the project in acers: ");
					dProjectArea = sC.nextDouble();
					System.out.println("Please enter the number of shops in Nos.: ");
					intNumberOfShops = sC.nextInt();
					System.out.println("Please enter the area of shops in Sqft: ");
					dFlatArea = sC.nextDouble();
					objSub.ComercialBuilding(strProjectName, dProjectArea, intNumberOfShops, dFlatArea  );
					break;
					
			case 3: return;
					
				
			default:System.out.println("Enter a valid number and rerun the program again.");
			 		break;
			 		
			
			}
		}
		}
		
	}
	
}
