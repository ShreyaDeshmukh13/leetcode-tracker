class Solution {
    public int findPeakElement(int[] arr) {
         int start = 0 ;
    int end = arr.length - 1 ;
    while(start < end)
    {
        int mid = start + (end - start) / 2;
        if(arr[mid] >  arr[mid + 1])
        {
            //you are in decreasing part of array
            // this may be the ans but look at left
            end = mid ;
        }
        else{
            // you are in asc part of MountainArray
            start = mid + 1 ; // becuase we know that mid + 1 > mid , hence ignored mid
        }
    }
 // in the end, start == end and pointing to the largest number because of the 2
// start and end are always trying to find max element in the above 2 checks
// hence if they're pointing to just one element , it is the maximum one
return start ; // or end as both are equal 

        
    }
}