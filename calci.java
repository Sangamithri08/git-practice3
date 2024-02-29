import java.util.Scanner;

interface calci{
	public int getsum(int n1,int n2);
}
 class calciImpl implements calci{
	public int getsum(int n1,int n2){
		return n1+n2;
	}
}
class Driverclass{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n1 and n2 to get sum");
		int n1=s.nextInt();
		int n2=s.nextInt();
		calciImpl c=new calciImpl();
		System.out.println(n1+n2+"="+c.getsum(n1, n2));
	}
}