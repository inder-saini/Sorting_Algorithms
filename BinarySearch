import java.util.Arrays;
/**
 *
 * @author inderjeetsingh
 */

//Usually the Binary Search algorithm is for a given array which is already sorted but here if the array is not sorted we can sort it and then find the element:
public class binarySearch {
    int bSearch(int[] arr, int l ,int r,int x){
if(r >= l){
int mid = l+(r-1)/2;

if(arr[mid]== x) {
    return mid;}

else if(arr[mid]>x){
    return bSearch(arr,l,mid-1,x);}

else if(arr[mid]<x) {
    return bSearch(arr,mid+1,r,x);}
}
return -1;
}
static void printArray(int [] arr){
for(int i = 0; i<arr.length;i++){
System.out.println(arr[i] );

}
}

public static void main(String[] args){
binarySearch list1 = new binarySearch();

int arr[] = {4,1,89,30,45,78,100};
Arrays.sort(arr);
printArray(arr);
int target = 4;
int result = list1.bSearch(arr, 0, arr.length-1, target);
System.out.println();
if(result == -1){
System.out.println("The number is not present");
}
else{
System.out.println("The index of the number is:" + result);}
}
}
