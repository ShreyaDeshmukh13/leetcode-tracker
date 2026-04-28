class Solution {
    public int missingNumber(int[] arr) {
         int i = 0 ;
        while (i < arr.length)
        {
            //Check if item is at the correct index or not
    
            if(arr[i] < arr.length && arr[i] != arr[arr[i]])
            {
                swap(arr, i , arr[i]);
            }
            else{
                i++ ;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr. length; index++) 
        {
        if (arr[index] != index) 
        {
            return index;

        }
    }


    // case 2
        
    return arr.length;
}

    static void swap(int[]arr , int first , int second)
    {
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp ;

    
    }
}