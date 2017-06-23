/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author sunny
 */
public class Selectionsort {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,j,temp;
        int a[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        n = s.nextInt();
        System.out.println("enter the elements");
        for(i=0; i<n; i++){
        a[i] = s.nextInt();
        }
        System.out.println("selectionsort of array is");
        for(i=0; i<n; i++)
        {
          for(j=i+1 ;j<n; j++)
          {
            if(a[i] > a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                
            }
                
          }
        }
        System.out.println("selectionsort elements are\n");
        for(i=0; i<n; i++)
        {
            System.out.println( a[i] + " ");
        }
        
       
    }
    
}
