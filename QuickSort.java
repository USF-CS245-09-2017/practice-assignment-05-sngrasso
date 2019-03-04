public class QuickSort implements SortingAlgorithm {

    //function to swap elements for sort
    public void swap(int [] a, int i, int j){
        //switch elements by holding one in a temp
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //partitian function returns the pivot
    public int partitian(int [] a, int high, int low){

        //choose pivot
        int pivot = a[high];
        int i = (low-1);

        for(int j=low; j<high; j++){
            if(a[j]<= pivot){
                i++;
                swap(a,i,j);
            }
        }

        //swap pivot position
        swap(a,i+1,high);
        return i+1;
    }

    //qs function
    public void qs(int [] a, int high, int low ){
        if(high-low>1){
            
            //set pivot
            int pivot = partitian(a, high, low);

            //recursive call qs
            qs(a, pivot-1, low);
            qs(a, high, pivot+1);
        }
    }

    //sort fuction that calls qs
    public void sort(int [] a){
        int low = 0;
        int high = a.length-1;
        qs(a, high, low);
    }
}
