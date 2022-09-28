public class LeftOccurence {
    static int left(int a[], int key){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(key==a[mid]) {
                ans=mid;
                r=mid-1;
            }
            if(key>a[mid]) l=mid+1;
            else r=mid-1;
        }
        return ans;
    }
    public static void main(String[] args){
        int a[]={1,2,4,4,4,7,8,8,8};
        int key=8;
        System.out.println(left(a, key));
    }
    
}
