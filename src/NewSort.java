
public class NewSort {

	void sort(int arrayA[])
    {
        int n = arrayA.length;
 
        
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arrayA[j] < arrayA[min_idx])
                    min_idx = j;
 
            
            int temp = arrayA[min_idx];
            arrayA[min_idx] = arrayA[i];
            arrayA[i] = temp;
        }
    }
 
    
    void PrintArray(int arr[])
    {
        int k = arr.length;
        System.out.print("{ ");
        for (int i=0; i<k; ++i)
            {System.out.print(arr[i]+" ");}
        System.out.print("}"); 
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
        NewSort ob = new NewSort();
        int array[] = {61,23,9,90,11};
        ob.sort(array);
        System.out.println("Sorted array:");
        ob.PrintArray(array);
    }
}
