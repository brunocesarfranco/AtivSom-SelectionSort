public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; //Procurando pelo menor valor  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] vetor = {3,6,8,1,4,9,0};  
        System.out.println("Antes do Selection Sort");  
        for(int i:vetor){  
            System.out.print(i+" ");  
        }
        System.out.println();  
          
        selectionSort(vetor);//Organizando array usando selection sort  
         
        System.out.println("Depos do Selection Sort");  
        for(int i:vetor){  
            System.out.print(i+" ");  
        }  
    }  
}  