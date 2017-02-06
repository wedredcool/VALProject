public class Calculate 
{
	public static void main(String[] arg) 
	{
		System.out.println("Calculate...+, -, *, /, ^");
		Double first = Double.valueOf(arg[0]);
		Double second = Double.valueOf(arg[1]);
		Double summ = first + second; //+
		Double sub = first - second; //-
		Double mult = first * second; //*
		Double div = first / second; // /
		Double deg = Math.pow(first,second); //^
		System.out.println("summ = " + summ );
		System.out.println(" sub= " + sub );
		System.out.println("mult = " + mult );
		System.out.println(" div = " + div );
		System.out.println("deg = " + deg );
	}
}