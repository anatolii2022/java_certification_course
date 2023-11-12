package java_basics_compiling_deploying_jar;

public class ClientProgram {

	public static void main(String[] args) {
		Multiplyer mult = new Multiplyer();
		int result = mult.multiply(2, 3, 4);
		System.out.println("Result of Multiplier:");
		System.out.println(result);

	}

}
