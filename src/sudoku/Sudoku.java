/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author owner
 */
public class Sudoku {

    private static BufferedReader br = null;
    private static String line;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] sdk = new int[9][9];
        load(sdk, "C:\\Users\\owner\\Documents\\NetBeansProjects\\Sudoku\\etc\\sdk1.csv");
        print(sdk);
    }

    private static void load(int[][] sdk, String sfile) {
        String line = null;
        String[] r = null;
        int row = 0;
        int col = 0;
        try {
            br = new BufferedReader(new FileReader(sfile));
            while ((line = br.readLine()) != null) {  
                col = 0;
                r = line.split(",");
                for (String n : r) {
                    sdk[row][col] = Integer.parseInt(n);
                    col++;
                }
                row++;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + sfile);
            System.exit(-1);
        } catch (IOException ex) {
            Logger.getLogger(Sudoku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void print(int[][] sdk) {
        for (int row = 0; row < 9; row++) {
            System.out.print("\n\t");
            for (int col = 0; col < 9; col++) {
                System.out.print(sdk[row][col]+"\t");
            }
        }
        System.out.print("\n\n");

    }

}
