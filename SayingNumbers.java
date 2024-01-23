import java.util.Scanner;

public class SayingNumbers{
	//  number between 0-9
	public static String oneDigitToStr(int i){
		
		 if(i== 0){
			return " zero ";
		}
		else if(i==1){
			return " one ";
		}
		else if (i==2){
			return " two ";
		}
		else if (i==3){
			return "three";
		}
		else if(i==4){
			return "four";
		}
		else if (i==5){
			return "five";
		}
		else if (i==6){
			return "six";
		}
		else if (i==7){
			return "seven";
		}
		else if (i==8){
			return " eight";
		}
		else {
			return "nine";
		}
	}
	//number between 0-99
	public static String twoDigitToStr(int i){
				//recall first method
				if(i<10){
			return oneDigitToStr(i);
		}
		
		else if (i == 10){
			return "ten";
		}
		else if (i == 11){
			return "eleven";
		}
		else if (i==12){
			return "twelve";
		}
		else if (i==13){
			return "thirteen";
		}
		else if (i== 14){
			return " fourteen";
		}
		else if (i==15){
			return " fifteen";
		}
		else if (i==16){
			return " sixteen";
		}
		else if (i==17){
			return " seventeen";
		}
		else if (i==18){
			return " eighteen";
		}
		else if (i==19){
			return " nineteen";
		}
		else if (i==20){
			return " twenty";
		}
		else if (i>20 && i<30) {
			i = i-20;
			return " twenty "+ oneDigitToStr(i);
			
		}
		else if (i==30) {
			return " thirty ";
		}
		else if (i>30 && i<40) {
			i = i-30;
			return " thirty "+ oneDigitToStr(i);
			
		}
		else if (i==40) {
			return " forty ";
		}
		else if (i>40 && i<50) {
			i = i-40;
			return " forty "+ oneDigitToStr(i);
			
		}
		else if(i==50) {
			return " fifty";
			
		}
		else if (i>50 && i<60) {
			i = i-50;
			return " fifty "+ oneDigitToStr(i);
			
		}
		else if (i==60) {
			return " sixty ";
			
		}
		else if (i>60 && i<70) {
			i = i-60;
			return " sixty "+ oneDigitToStr(i);
		}
		else if (i == 70) {
			return " seventy";
			
		}
		else if (i>70 && i<80) {
			i = i-70;
			return " seventy "+ oneDigitToStr(i);
			
		}
		else if (i==80) {
			
			return " eighty ";
			
		}
		else if (i>80 && i<90) {
			i = i-80;
			return " eighty "+ oneDigitToStr(i);
			
		}
		else if (i == 90 ) {
			return " ninety";
			
		}
		else  {
			i = i-90;
			return " ninety "+ oneDigitToStr(i);
			
		}
}
//number between 0-999
	public static String threeDigitToStr(int i){
		//recall last method
		if(i< 100){
			return twoDigitToStr(i);
		}
		
		else if (i== 100) {
			return "one hundred";
			
		}
		else if (i>100 && i<200) {
			i = i-100;
			return "one hundred "+ twoDigitToStr(i);
			
		}
		else if(i==200){
			return "two hundred";
		}
		else if (i>200 && i<300) {
			i = i-200;
			return "two hundred "+ twoDigitToStr(i);
			
		}
		else if (i==300) {
			return "three hundred";
			
		}
		else if (i>300 && i<400) {
			i = i-300;
			return "three hundred "+ twoDigitToStr(i);
			
		}
		else if (i==400) {
			return "four hundred";
			
		}
		else if (i>400 && i<500) {
			i = i-400;
			return "four hundred "+ twoDigitToStr(i);
			
		}
		else if (i==500) {
			return "five hundred";
			
		}
		else if (i>500 && i<600) {
			i = i-500;
			return "five hundred "+ twoDigitToStr(i);
			
		}
		else if (i==600) {
			return "six hundred";
			
		}
		else if (i>600 && i<700) {
			i = i-600;
			return "six hundred "+ twoDigitToStr(i);
			
		}
		else if (i==700) {
			
			return "seven hundred "+ twoDigitToStr(i);
			
		}
		else if (i>700 && i<800) {
			i = i-700;
			return "seven hundred "+ twoDigitToStr(i);
			
		}
		else if (i==800) {
			return "eight hundred";
			
		}
		else if (i>800 && i<900) {
			i = i-800;
			return "eight hundred "+ twoDigitToStr(i);
			
		}
		else if (i==900) {
			return "nine hundred";
		}
			
		else {
			i = i-900;
			return "nine hundred "+ twoDigitToStr(i);
			
		}

	}
// number between 0-999999
	public static String sixDigitToStr(int i){
		//recall last method
		if(i<1000){
			return threeDigitToStr(i);
		}
		
		else  {
			int a = i /1000;
			int b = i%1000;
			if (b== 0){
				return threeDigitToStr(a) +"thousand";
			}
			else{
				return threeDigitToStr(a) +"thousand"+threeDigitToStr(b);
			}
			
			}

			
			
		
	}
	//number between 0-999999999
	public static String nineDigitToStr(int i){
			//recall last method
			if(i<1000000){
			return sixDigitToStr(i);
		}
		
			else{
				int a = i /1000000;
				int b = i %1000000;
				if(b==0){
					return threeDigitToStr(a)+ " million";
				}
				else{
					return threeDigitToStr(a)+ " million"+ sixDigitToStr(b);
				}
				
			}


	}
	public static String numToStr(int i ){
			if(i< 1000000000){
			return nineDigitToStr(i);
		}
		
			else  {
				int a = i / 1000000000;
				int b = i % 1000000000;
				if(b==0){
					return  threeDigitToStr(a) + " billion";
				}
				else{
					return  threeDigitToStr(a) + " billion " + nineDigitToStr(b);
				}
				
			}

	}
	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				int i = 0;
				while( i>=0){
				System.out.print("Enter an integer to pronounce (any negative to exit) :");
				
				 i = scan.nextInt();
				 if (i <0){
					break;
				}
				System.out.println(numToStr(i));

			}
			if(i <0){
				System.out.println("kthxbye!");
			}
			}
	
}