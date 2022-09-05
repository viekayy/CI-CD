public class mergesrt {
    public static void conq(int arr[], int st,int mid,int end){
            int merged[]=new int[end-st+1]; //=no.of elementss
        int idx1=st;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=end){
            if(arr[idx1]<=arr[idx2]){  
                merged[x++]=arr[idx1++];
                
            }else{
                merged[x++]=arr[idx2++];
            }
        }
// jo bach gaye haai (remaining):
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
            while(idx2<=end){
                merged[x++]=arr[idx2++];
            }
        for(int i=0,j=st; i<merged.length;i++ , j++){
                arr[j] = merged[i];
        }
    }




    public static void divide(int[] arr,int st,int end){

        if(st>=end){
            return;
        }

       int  mid=st+(end-st)/2;
       divide(arr,st,mid);
       divide(arr,mid+1,end);

       conq(arr,st,mid,end);
    }


    public static void main(String args[]){
        int[] arr={7,3,4,2,6,500,9,100};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(" , "+arr[i]);
        }
    }
}
