public class maxandMinArray {
    public static void main(String [] args){
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int n = 6;
        Pair minmax = getMinMax(arr, n);
    }

    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int arr[],int n){
        Pair minmax=new Pair();
        int i;

        if(n==1){ //if there is only one element
            minmax.max=arr[0];
            minmax.min=arr[0];
            return minmax;
        }

        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }else{
            minmax.max=arr[1];
            minmax.min=arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
 
        return minmax;
    }
    
}
