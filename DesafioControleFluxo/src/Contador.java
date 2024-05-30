
import java.util.Scanner;

public class Contador {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();;
       
        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
        

		
		}
        catch (ParametrosInvalidosException e ) {
			
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
    }
    

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
        throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int x=0; x<contagem; x ++){
         System.out.println(" a quantidade de interaçõesx=" + x );






        }
    }    
}
		
            
                        
