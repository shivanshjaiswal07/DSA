class insertion{
    public static void main(String[] args){
        int arr[]={22,65,7,5,45};

        int index=2;
        int element=78;
        int n=arr.length;
        int newArr[] = new int[n + 1];
    
        for(int i=0;i<index;i++){
               newArr[i]=arr[i];
        }

    
        newArr[index]=element;//alwyas deleclare with captial a

        for(int i=index;i<n;i++){
            newArr[i+1]=arr[i];
        }
 

        for(int i=0;i<n+1;i++){
        System.out.print(newArr[i]+" ");
          }
    }
}