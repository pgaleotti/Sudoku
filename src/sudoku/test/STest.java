/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author owner
 */
public class STest {
    
     public static void main(String[] args) {
        // TODO code application logic here
         testList();
    }
     
    private static void testList() {
        int [ ] [ ] s =  {   { 20, 18, 22, 20, 16 },
                                 { 18, 20, 18, 21, 20 },
                                 { 16, 18, 16, 20, 24 },
                                 {  25, 24, 22, 24, 25 }
                             };
        int [ ] [ ] ss = new int[9] [9];
        ss[0][0] = 4;
        
        System.out.println(ss);
    }
    
}
