package java_practice;

public class BinarySearchExample {
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2; // 0 + 4 / 2 = 2
        while( first <= last ){ //true
            if ( arr[mid] < key ){ // 30<30 = false
                first = mid + 1;
            }else if ( arr[mid] == key ){ // 30=30 true
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
        // last : 4 / first : 0

    }
}

//Element is found at index: 2