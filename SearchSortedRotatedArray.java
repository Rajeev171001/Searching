public class SearchSortedRoatatedArray {
    static int Search(int a[], int key){
        int l=0, r=a.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key) return mid;
            if(a[l]<=a[mid]){
                if(key>=a[l]&&key<a[mid]){
                    r=mid+1;
                }else{
                    l=mid+1;
                }
            }else{
                if(key>a[mid]&&key<=a[r]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[]={1,2,3,6,8,9,11,12,17,19,20,23,24,26,28,29,34,37};
        int key=20;
        System.out.println(Search(a,key));
    }
    
}
