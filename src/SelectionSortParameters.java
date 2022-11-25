import java.util.Scanner;  
  
public class SelectionSortParameters  
{  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
       int arr[] = new int[50];  
       try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Quantidade de valores do Array: ");  
           size = scan.nextInt();  
             
           System.out.print("Insira os "+size+" elementos do Array: ");  
           for(i=0; i<size; i++)  
           {  
               arr[i] = scan.nextInt();  
           }
        }  
         
       System.out.print("Ordenando Array utilizando Selection Sort...\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Agora o Array após ordenar é:\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}  