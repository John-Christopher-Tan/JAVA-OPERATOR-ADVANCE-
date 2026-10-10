/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaj.operator.advance;


public class AVAJOPERATORADVANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double balance = 100.0;

        System.out.println("Initial Balance: " + balance);

        balance += 50.0;
        System.out.println("After += 50: " + balance);

        balance *= 2.0;
        System.out.println("After *= 2: " + balance);

        balance += 25.0;
        System.out.println("After += 25: " + balance + "\n");

        int count = 5;

        System.out.println("Printing count++: " + count++);
        System.out.println("Printing count after count++: " + count + "\n");

        count = 5;

        System.out.println("Printing ++count: " + ++count);
        System.out.println("Printing count after ++count: " + count + "\n");

// The Postfix count++ is one that return theoriginal value FIRST for the current println,and increments the variable afterwards.
// The Prefix ++count is the one that Increments the variable FIRST on the current println and then returns the newly updated value.
    }
    
}
