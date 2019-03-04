public class MergeSort implements SortingAlgorithm {


    public int [] get_left(int [] a){

        int mid = (a.length-1)/2;
        int [] left_half = new int[mid+1];
        //divide array and send back first half
        for(int i=0; i < left_half.length; i++){
            left_half[i]=a[i];
        }

        return left_half;
    }

    public int [] get_right(int [] a){
        int r = a.length-1;
        int mid = (r)/2;
        int [] right_half = new int[r-mid];
        int j = mid+1;
        //divide array and send back last half

        for(int i=0; i<right_half.length; i++){
            right_half[i]=a[j+i];
        }

        return right_half;
    }

    //merge the sorted arrays together
    public void merge(int [] left, int [] right, int [] a){
        int left_index = 0;
        int right_index = 0;
        int target = 0;

        //loop through and compare elements to eachother until one ends
        while(left_index < left.length && right_index < right.length){
            if(left[left_index]<=right[right_index]){
                a[target++]=left[left_index++];
            }
            else{
                a[target++]=right[right_index++];
            }
        }

        //if right or left index is finished we loop through the unfinished array
        while(left_index<left.length){
            a[target++]=left[left_index++];
        }
        while(right_index<right.length){
            a[target++]=right[right_index++];
        }

    }

    //merge sort fuction through recursion
    public void sort(int [] a){
        if(a.length>1){
            //divide array into left and right
            int [] left=get_left(a);
            int [] right = get_right(a);

            //recursively call
            sort(left);
            sort(right);

            //merge everything together
            merge(left, right, a);
        }
    }
}
