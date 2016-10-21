/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdebug;

/**
 *
 * @author suhettia
 */
public class TestDebug {

   public static int factorial(int N){
        if (N == 1)
            return N;
        else
            return N * factorial(N-1);
    }
    
    public static void main(String[] args){
        int x = factorial(5);
        System.out.println(x);
    }
    
}
