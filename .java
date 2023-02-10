import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
 
 
 
public class temp2 {
	public static FastScanner sc;
	public static PrintWriter pw;
	public static StringBuilder sb;
	
    public static int MOD= 1000000007;
	public static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
					st=new StringTokenizer(br.readLine());				               
	             } catch (IOException e) {}
				return st.nextToken();
			}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] arr(int n) {
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			return arr;
		}
		
    }
	
	
	public static int[] sort(int[] arr) {
		int n=arr.length;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++) al.add(arr[i]);
		Collections.sort(al);
		for(int i=0;i<n;i++) arr[i]=al.get(i);
		return arr;
	}
	
	public static void print(List<Integer> al) {
   	 System.out.println(al.stream().map(it -> it.toString()).collect(Collectors.joining(" ")));
	}
	public static void print2(List<Long> al) {
	   	 System.out.println(al.stream().map(it -> it.toString()).collect(Collectors.joining(" ")));
	}
	public static void print2(Deque<Long> al) {
  	 System.out.println(al.stream().map(it -> it.toString()).collect(Collectors.joining(" ")));
	}
	public static void print(Deque<Integer> al) {
	  	 System.out.println(al.stream().map(it -> it.toString()).collect(Collectors.joining(" ")));
	}
	public static void print(long[] arr) {
   	System.out.println(Arrays.toString(arr).trim().replace("[", "").replace("]","").replace(","," "));
	}
	public static void print(int[] arr) {
	   	System.out.println(Arrays.toString(arr).trim().replace("[", "").replace("]","").replace(","," "));
	}
	public static void yes() {
    	System.out.println("YES");
    }
    public static void no() {
    	System.out.println("NO");
    }
    
    public static long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	public static long lcm(long a, long b) {
		return((a*b)/gcd(a,b));
	}
	
	public static void decreasingOrder(ArrayList<Long> al) {
		Comparator<Long> c = Collections.reverseOrder();
	    Collections.sort(al,c);
	}
    
    public static boolean[] sieve(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;	
		for(int i=2;i*i<n;i++) {
			for(int j=2*i;j<n;j+=i) {
				isPrime[j]=false;
			}
		}
		return isPrime;
	}
    
    public static  long nCr(long N, long R) {
        double result=1;
    	for(int i=1;i<=R;i++) result=((result*(N-R+i))/i);
    	return (long) result;
    }
    
    public static long fastPow(long a, long b, int n) {
		long result=1;
		
		while(b>0) {
			if((b&1)==1)
				result=(result*a %n)%n;
			
			a=(a%n * a%n)%n;
			b>>=1;
		}
		return result;
    }
    
    public static int BinarySearch(long[] arr, long key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				high=mid-1;
			else
				low=mid+1;
		}
		return low; //High=low-1
	}
    
    public static int upperBound(int[] arr, int target, int l, int r) {
    	while(l<=r) {
    		int mid=(l+r)/2;
    		if(arr[mid]<=target) l=mid+1;
    		else r=mid-1;
    	}
    	return l;
    }
    
    public static int lowerBound(int[] arr, int target, int l, int r) {
    	while(l<=r) {
    		int mid=(l+r)/2;
    		if(arr[mid]<target) l=mid+1;
    		else r=mid-1;
    	}
    	return l;
    }
        
    public static void solve(int t) {
    	//Code
    	int n=sc.nextInt();
    	String s=sc.next();
    	boolean f=false;

    		if(condition) f=true;
    	}
    	if(f) yes(); else no();
    	
    }	
    
	public static void main(String[] args) {
		sc = new FastScanner();
		pw = new PrintWriter(new OutputStreamWriter(System.out));
		sb= new StringBuilder("");
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) solve(i);
		System.out.println(sb);
	}
}
