/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junaed
 */
public class SumOfPrimes {
    
    public static boolean isPrime(long p){
        
//        System.out.println(p);
        boolean b = true;
        for(int i=3; i<(Math.sqrt(p)+1); i+=2){
            if(p%i==0){
                b = false;
                break;
            }
        }   
        
        return b;
    }
    
    public static void main(String[] args){
    
        long sum = 0;
        long iterator = 5;
        sum = 2+3;
        int count = 2;
        while(count<1000){
            
            if(isPrime(iterator)){
                sum+=iterator;
                count++;
            }
            
            iterator+=2;
        }
        
        System.out.println(sum);
//        System.out.println(iterator);
    }
}
