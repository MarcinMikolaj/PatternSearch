package MainPackage;

import org.springframework.stereotype.Component;

@Component
public class RabinKarpAlgorithm {
	
	public void search(String txt, String pattern, int primeNumber) {
		
		int patternLength = pattern.length();
		int txtLength = txt.length();
		int H = 0;
		int G = 0;
		int counter = 0;
		
		for(int i=0; i<patternLength; i++) {
			H = (H +(pattern.charAt(i) * pow(txtLength,i)))%primeNumber;			
		}
			
		for(int i=0; i<txtLength; i++) {
			if(patternLength>(txtLength-i)) {
				break;
			}
					
			for(int j=i;j<(patternLength+i);j++) {
				G = (G +(txt.charAt(j) * pow(txtLength,counter)))%primeNumber;	
				counter++;
			}
				
			if(H==G) {
				System.out.println("zanalaz³em w miejscu " + i); 
			}
			
			G=0;
			counter=0;		
		}			
	}
	
	private int pow(int number, int power) {
		int variable = 1;	
		
		for(int i=0; i<power; i++) {
			variable = variable*number;
		}	
		return variable;
	}
}
