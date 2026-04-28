class Solution {
    public int[] findErrorNums(int[] arr) {
    
        int i = 0 ;
        while (i < arr.length)
        {
            //Check if item is at the correct index or not
    
            if( arr[i] != arr[arr[i]-1])
            {
                swap(arr, i , arr[i]-1);
            }
            else{
                i++ ;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr. length; index++) 
        {
        if (arr[index] != index+1) 
        {
            return new int[] {arr[index],index +1};

        }
    }


    // case 2
        
    return new int[]{-1,-1};
}

    static void swap(int[]arr , int first , int second)
    {
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp ;

    }

}
