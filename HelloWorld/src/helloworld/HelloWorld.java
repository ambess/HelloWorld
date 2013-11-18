/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Amine
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //calcul le temps de traitement d'un loop while comparé à un loop for.
        int i = 0;
        int j = 0;
        long iStartTime = System.currentTimeMillis();
        while(i<100){
            System.out.println("Je suis le i : "+i);
            i++;
        }
        System.out.println(System.currentTimeMillis()-iStartTime);
        long jStartTime = System.currentTimeMillis();
        for(i=0;i<100;i++){
            System.out.println("Je suis le j : "+i);
        }
        System.out.println(System.currentTimeMillis()-jStartTime);    
    }
}
