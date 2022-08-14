public class main {
    public static void main(String [] args) {

        String input = args[0];
        
        int number=Integer.parseInt(input);
        int aux, factorial=1;

	        for(aux=1;aux<=number;aux++){
	        	
	            factorial = factorial * aux;
	            
	        }

        System.out.println(factorial);
        
    }
    
}