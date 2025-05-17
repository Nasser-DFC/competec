import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
	
	  double xpodrao = 10.0;
	    
	  double xratao = 15.0;	
	  
	  double xparadacardiaca = 30.0;
	  
	  double cash_cliente = 40.0;
 	  
	  double carrinho_cliente = 0.0;
	  
	  
	    System.out.println("Seja Bem-vindo ao Degustou Morreu");
	
	    System.out.println(" Qual o senhor anseia?"); 
	         
	    System.out.println("1 - xpodrão 2 - xratão 3- xparadacardiaca");
                
        System.out.println("quantos estás a visar?");
               
        int quantidade = sc.nextInt();
      
      int items = sc.nextInt();
         
      switch (items) {    
       
       case 1:     	
	 carrinho_cliente =  quantidade*xpodrao;
 	 break;
	 
	 case 2:
	 carrinho_cliente = quantidade*xratao;    
	     break;
	     
	 case 3: 
	 carrinho_cliente = quantidade*xparadacardiaca; 
	 break;   
      }

     
	}
}
