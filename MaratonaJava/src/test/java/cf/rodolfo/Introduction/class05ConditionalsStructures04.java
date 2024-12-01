package cf.rodolfo.Introduction;

public class class05ConditionalsStructures04 {
	public static void main(String[] args) {
		/*	
		                                             
		  	       &&                   ||                     !
                 (and)                 (or)                  (not)
                                                      
  		  	 V  &&  V  =  V         V  ||   V  =  V        true = false
		  	 V  &&  F  =  V         V  ||  F  =  F         false = true
		  	 F  &&  V  =  V         F  ||  V  =  F     
		  	 F  &&  F  =  F         F  ||  F  =  V     
		  	                                           
		*/
		
		double annualSalary = 120000;
		double firstRange = 9.7 / 100;
		double secondRange = 37.35 / 100;
		double thirdRange = 49.50 / 100;
		double taxValue;
		if(annualSalary <= 34712) {
			taxValue = annualSalary * firstRange;
		}else if(annualSalary >= 34713 && annualSalary <= 68507) {
			taxValue = annualSalary * secondRange;
		}else {
			taxValue = annualSalary * thirdRange;
		}
		System.out.printf("Tax Value: %.2f%n", taxValue);
	}
}
