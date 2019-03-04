public class InsertionSort implements SortingAlgorithm {

    //insertion sort fuction
    public void sort(int [] a){
        //go through the list
        for(int i=1; i<a.length; i++){
            int current=a[i];
            int j = i-1;

            //move array elements up one place 
            //to make room to put current element
            while(j>=0 && a[j]>current){
                a[j+1] = a[j];
                j= j-1;
            }

            //now we place the current element in the new spot
            a[j+1] = current;
        }
    }
}
