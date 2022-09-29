public class SquareRoot {
    static int sqrt(int n){
        int ans=1;
        int l=1,r=n;
        while(l<=r){
            int mid=(l+r)/2;
            int midsq=mid*mid;
            if(midsq==n) return mid;
            if(midsq>n) r=mid-1;
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int n=25;
        System.out.println(sqrt(n));
    }
}
