
public class intuit {
	int total;
	public static void main(String[] args) {
		intuit i=new intuit();
		System.out.println("Roman Number: "+i.myFunct(20,5));
	}
	
//	MMMCMXCIX
//	MMMDCCCCLXXXXVIIII
	
	String myFunct(int a,int b){
		
		total=a+b;
		
		String roman="";
		
		System.out.println("myFunct");
		while (total>=1000){
			roman+="M";
			total=total-1000;
		}
		while(total>=900){
			roman+="CM";
			total=total-900;
		}
		
		while(total>=500){
			roman+="D";
			total=total-500;
		}
		while(total>=400){
			roman+="CD";
			total=total-400;
		}
		
		
		while(total>=100){
			roman+="C";
			total=total-100;
		}
		while(total>=90){
			roman+="XC";
			total=total-90;
		}
		
		while(total>=50){
			roman+="L";
			total=total-50;
		}
		
		while(total>=40){
			roman+="XL";
			total=total-40;
		}
		
		while(total>=10){
			roman+="X";
			total=total-10;
		}
		while(total>=9){
			roman+="IX";
			total=total-9;
		}
		while(total>=5){
			roman+="V";
			total=total-5;
		}
		while(total>=4){
			roman+="IV";
			total=total-4;
		}
		while(total>=1){
			roman+="I";
			total=total-1;
		}
		

		return roman;
	}

}