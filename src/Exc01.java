
public class Exc01 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int numerador[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denominador[] = {2, 0, 4, 4, 0, 8};
		try{
			for(int i =0; i<numerador.length; i++){
				
				try{
					System.out.println(numerador[i]+"/"+denominador[i]+ " é "+numerador[i]/denominador[i]);
				}catch(ArithmeticException e){
					System.out.println("Não se divide número por zero!");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Número não encontrado");
		}
	}	
}