
package pBuiderRefeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco",false);                
        System.out.println();
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante",true);       
    }    
}
