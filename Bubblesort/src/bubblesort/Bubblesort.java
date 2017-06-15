/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.Scanner;

/**
 *
 * @author sunny
 */
public class Bubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,n,temp;
        int[] a = new int[50];
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array size");
        {
          n = s.nextInt();
        }
        System.out.println("enter the array elements");
        for(i=0; i<n; i++)
        {
           a[i] = s.nextInt();
        }
        System.out.println("sorting elements in bubble sort technique");
        for(i=0; i<(n-1); i++)
        {
            for(j=0;j<(n-i-1);j++)
            {
              if(a[j] > a[j+1])
              {
              temp = a[j];
              a[j] = a[j+1];
              a[j+1] = temp;
              }
            }
        }
        System.out.println("sorting in bubble sort is:\n");
        for(i=0; i<n; i++){
            System.out.println(a[i]+ " ");
        }
        
    }
    
}
