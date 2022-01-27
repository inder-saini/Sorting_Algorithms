/* Author :  Inderjeet Saini */
public class mergeS {
    void mSort( int[] arr, int l, int r){
if (r>l){

int mid = l+(r-l)/2;

mSort(arr,l,mid);
mSort(arr,mid+1,r);

merge(arr,l,mid,r);
}
}


void merge(int[] arr, int l,int m, int r){
int n1 = m-l+1;
int n2 = r-m;

int[]L = new int[n1];
int[]R = new int[n2];

for(int i =0;i<n1;i++){
L[i] = arr[l+i];
}

for(int j =0;j<n2;j++){
R[j] = arr[m+1+j];
}

int i = 0, j = 0, k =l;

while(i<n1 && j<n2){
if(L[i] <= R[j]){
arr[k] = L[i];
i++;
}
else{
arr[k] = R[j];

j++;
}
k++;
}

//Also there might be a case where one of the array reaches its last digit but another still has numbers left. So in that case we solve it as below:
//Here, the first case is if the Left array is not empty but right array is:
while(i<n1){
arr[k] = L[i];
i++;
k++;
}

//Here, the second case is if the Right array is not empty but Left array is:
while(j<n2){
arr[k] = R[j];
j++;
k++;
}

}

static void printArray(int [] arr){
for(int i = 0;i<arr.length;i++){
System.out.println(arr[i] + " ");
}
}

public static void main(String[] args){
mergeS list1 = new mergeS();
 int [] arr = {2,4,1,4,10,6,99,10000};
list1.mSort(arr, 0, arr.length-1);

printArray(arr);
}
}
