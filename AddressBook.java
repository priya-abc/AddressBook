import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class AddressBook {
private ArrayList<AddRec> addressRecords = new ArrayList<AddRec>();

System.out.println("Welcome to AddressBook");
<<<<<< HEAD

Scanner in = new Scanner(System.in);
	public void AddressBook()
	{
		System.out.println("Enter the number of first names: ");
        int firstnames_count= in.nextInt();
        String firstNames[]= new String[firstnames_count];
        System.out.println("Enter the First Names: ");
        for(int i=0;i<firstnames_count;i++) {

Scanner in = new Scanner(System.in);
	public void AddressBook()
	{
	System.out.println("Enter the number of first names: ");
        int firstnames_count= in.nextInt();
        String firstNames[]= new String[firstnames_count];
        System.out.println("Enter the First Names: ");
            for(int i=0;i<firstnames_count;i++) {

            firstNames[i]=in.next();
        }
        System.out.println("Enter the number of last names: ");
        int lastnames_count=in.nextInt();
        if(firstnames_count!=lastnames_count) {
           if(firstnames_count!=lastnames_count) {
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
private void addRecord() {
    	 Scanner in = new Scanner(System.in);
         LinkedHashMap<String,String> hm= new LinkedHashMap<>();
         System.out.println("Enter the number of first names: ");
         int firstnames_count= in.nextInt();
         String firstNames[]= new String[firstnames_count];
         System.out.println("Enter the First Names: ");
         for(int i=0;i<firstnames_count;i++) {
             firstNames[i]=in.next();
         }
         System.out.println("Enter the number of last names: ");
         int lastnames_count=in.nextInt();

         if(firstnames_count!=lastnames_count) {
             System.out.println("Mismatch! Number of first names and last names should be same ");
             System.exit(0);
         }
       
         String lastNames[]= new String[lastnames_count]; 
         System.out.println(" Enter the last names in order - matching the first names");
         for(int i=0;i<lastnames_count;i++) {
             lastNames[i]=in.next();
         }

         for(int i=0;i<firstnames_count;i++) {  
             hm.put(firstNames[i],lastNames[i]);
         }
    
         Map<String,String> result= sortMap(hm);
         System.out.println("The Last Names in alphabetial order: ");
         System.out.println();
         for(Map.Entry<String, String> entry: result.entrySet()) {
     
             System.out.print(entry.getKey()+ " ");
             System.out.println(" "+ entry.getValue());
             System.out.println();
          }  
          in.close();
       }
       public static LinkedHashMap<String,String> sortMap(LinkedHashMap<String,String> map){
            
           List<Map.Entry<String,String>> list= new LinkedList<>(map.entrySet());
        
           Collections.sort(list, (o1,o2) -> o1.getValue().compareTo(o2.getValue()));

           LinkedHashMap<String,String> lhm= new LinkedHashMap<>();
           for(Map.Entry<String, String> entry: list) {
               lhm.put(entry.getKey(), entry.getValue());
           }
           return lhm;
       }
private void searchRecord() {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter the number of arrayvalues: ");
         int arrayvalues_count= in.nextInt();
         int arrayValues[]= new int[arrayvalues_count];
         System.out.println("Enter the arrayvalues: ");
         for(int i=0;i<arrayvalues_count;i++) {
        	 arrayValues[i]=in.nextInt();
         }
    	 
    	 
    	 int zipcode=638301;
    	 int temp=0;
    	 for(int i=0;i<arrayValues.length;i++)
    	{
    		 if( arrayValues[i]==zipcode)
    		 {
    			 System.out.println("item is present at "+i+" th index pos");
    		     temp=temp+1;
    		 }
    	}
    	if(temp==0)
    	{
    		System.out.println("item not found");
    	}
     }
private void SortRecord() {
    	 
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter the number of arrayvalues: ");
         int arrayvalues_count= in.nextInt();
         int arrayValues[]= new int[arrayvalues_count];
         System.out.println("Enter the arrayvalues: ");
         for(int i=0;i<arrayvalues_count;i++) {
        	 arrayValues[i]=in.nextInt();
         }
    	 int min,temp=0;
    	 for(int i=0;i<arrayValues.length;i++)
    	{
    		 min=i;
    		 for(int j=i+1;j<arrayValues.length;j++)
    		 {
    			 if(arrayValues[j] < arrayValues[min])
    			 {
    				 min=j;
    			 }
    		 }

    	temp=arrayValues[i];
    	arrayValues[i]=arrayValues[min];
    	arrayValues[min]=temp;
    	}	
    	for(int i=0;i<arrayValues.length;i++)
    	{
    		System.out.println(arrayValues[i]+ " "); 
    	}
    	 
     }
private void editRecord() {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter the number of zipcodevalues: ");
         int arrvalues_count= in.nextInt();
         int arrValues[]= new int[arrvalues_count];
         System.out.println("Enter the arrayvalues: ");
         for(int i=0;i<arrvalues_count;i++) {
        	 arrValues[i]=in.nextInt();
         }
    	 int pos=3;
    	 int newzipcode=693933;
    	 for(int i=arrValues.length-1;i>pos-1;i--)
    	{
    		 arrValues[i]=arrValues[i-1];
    	}
    	 arrValues[pos-1]=newzipcode;
    	for (int i=0; i<arrValues.length;i++)
    	{
    		System.out.println(arrValues[i]+ " "); 
    	}
    	 
     }
