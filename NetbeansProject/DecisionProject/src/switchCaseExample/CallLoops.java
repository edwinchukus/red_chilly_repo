/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCaseExample;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class CallLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number");
        String num = scan.nextLine();
        Loops lo = new Loops();
        lo.callEnhancedForLoop(num);
    }
}
