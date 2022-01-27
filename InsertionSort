/* Author : Inderjeet Saini */
 class insertionS {
    void sort(int [] array){

for(int j = 1; j<array.length;j++){
int key = array[j];
int i = j-1;
while(i>= 0 && array[i]>key){
array[i+1] = array[i];
i = i-1;
}
array[i+1] =key;
}
}

static void printArray(int [] array){
for(int i = 0;i<array.length;i++){
System.out.println(array[i] + "");
}
}

public static void main(String[] args){
insertionS list1 = new insertionS();
 int arr[] = {2,5,7,10,100};
list1.sort(arr);

printArray(arr);
} 
}
