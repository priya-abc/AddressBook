import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class AddressBook {
private ArrayList<AddRec> addressRecords = new ArrayList<AddRec>();

System.out.println("Welcome to AddressBook");
<<<<<<< HEAD

Scanner in = new Scanner(System.in);
	public void AddressBook()
	{
		System.out.println("Enter the number of first names: ");
        int firstnames_count= in.nextInt();
        String firstNames[]= new String[firstnames_count];
        System.out.println("Enter the First Names: ");
        for(int i=0;i<firstnames_count;i++) {
=======
Scanner in = new Scanner(System.in);
	public void AddressBook()
	{
	System.out.println("Enter the number of first names: ");
        int firstnames_count= in.nextInt();
        String firstNames[]= new String[firstnames_count];
        System.out.println("Enter the First Names: ");
            for(int i=0;i<firstnames_count;i++) {
>>>>>>> UC1-MenuOptions
            firstNames[i]=in.next();
        }
        System.out.println("Enter the number of last names: ");
        int lastnames_count=in.nextInt();

<<<<<<< HEAD
        if(firstnames_count!=lastnames_count) {
=======
           if(firstnames_count!=lastnames_count) {
>>>>>>> UC1-MenuOptions
            System.out.println("Mismatch! Number of first names and last names should be same ");
            System.exit(0);
        }
      
        String lastNames[]= new String[lastnames_count]; 
        System.out.println(" Enter the last names in order - matching the first names");
        for(int i=0;i<lastnames_count;i++) {
            lastNames[i]=in.next();
        }
         System.out.println("Enter the number of phonevalues: ");
         int phonevalues_count= in.nextInt();
         int phoneValues[]= new int[phonevalues_count];
         System.out.println("Enter the phonevalues: ");
            for(int i=0;i<phonevalues_count;i++) {
           	 phoneValues[i]=in.nextInt();
            }
         System.out.println("Enter the number of zipcodevalues: ");
         int zipcodevalues_count= in.nextInt();
         int zipcodeValues[]= new int[zipcodevalues_count];
         System.out.println("Enter the zipcodevalues: ");
               for(int i=0;i<zipcodevalues_count;i++) {
              	 zipcodeValues[i]=in.nextInt();
               }
         System.out.println("Enter the number of addressdata: ");
         int addressdata_count= in.nextInt();
         int addressdata[]= new int[addressdata_count];
         System.out.println("Enter the addressdata: ");
                  for(int i=0;i<addressdata_count;i++) {
                	  addressdata[i]=in.nextInt();
                  }
            
        
        }
	
	Scanner input =  new Scanner(System.in);
	String menuOption;{
	do {
	System.out.println("1. Add Record");
	System.out.println("2. Search Record");
	System.out.println("3. Sort Record");
	System.out.println("4. Edit Record");
	System.out.println("5. Display all Record");
	System.out.println("6. Exit");
	menuOption = input.nextLine(); 
	
	if(menuOption.equals("1")) {
		addRecord();
			}
	else if(menuOption.equals("2")) {
		searchRecord();
	}else if(menuOption.equals("3")) {
		SortRecord();
	}else if(menuOption.equals("4")) {
		editRecord();
	}else if(menuOption.equals("5")) {
		displayallRecord();
	}
	
	}while(menuOption.equals("6") == false);
}
