/**
 * 
 */

/**
 * @author Piku
 *
 */
public class BubbleSort {

void bubbleSort(int array[]) 
   { 
       int m = array.length; 
       for (int i = 0; i < m-1; i++) 
           for (int j = 0; j < m-i-1; j++) 
               if (array[j] > array[j+1]) 
               { 
                    
                   int temp = array[j]; 
                   array[j] = array[j+1]; 
                   array[j+1] = temp; 
               } 
   } 
            
    
void PrintArray(int arr[]) 
{ 
    int n = arr.length; 
    System.out.print("{ ");
    for (int i=0; i<n; ++i)
    {
    	 
        System.out.print(arr[i] + " "); 
       
    }
    System.out.print("}"); 
    System.out.println(); 
} 
    
    
public static void main(String[] args)
{
	BubbleSort obj = new BubbleSort(); 
    int array1[] = {64, 34, 25, 12, 22, 11, 90}; 
    obj.bubbleSort(array1); 
    System.out.println("Sorted array:"); 
    obj.PrintArray(array1); 

}

}    
	
