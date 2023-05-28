import java.util.Scanner;

public class Git1 {

	public static void main(String[] args) {
String [] Fruits= {"Elma","Kiraz","Seftali","Çilek","Muz"};
double[] price= {10.65,25.99,19.99,99.25,99.55};
double[] height=new double[5];
Scanner sc=new Scanner(System.in);
double tutar=0;
for(int i=0;i<Fruits.length;i++){
	System.out.println(Fruits[i]+"Kac kilo ?");
	height[i]=sc.nextDouble();
	tutar+=price[i]*height[i];
}System.out.println("odemeniz gereken miktar : "+tutar);

	}

}
