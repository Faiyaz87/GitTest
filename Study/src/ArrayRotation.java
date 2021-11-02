import java.util.Arrays;

public class ArrayRotation {
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int d = 4;
		System.out.println(Arrays.toString(rotLeft(a, d)));
	}
	
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] shiftArr = new int[d];
        int saCnt = 0;
        for(int i=0;i<d;i++){
            shiftArr[i]=a[i];
        }
        System.out.println(Arrays.toString(shiftArr));
        for(int j=0;j<a.length;j++){
        	System.out.println((a.length - d));
            if(j>(a.length - d)-1){
                a[j]=shiftArr[saCnt++];
            }else{
                a[j]=a[d+j];
            }
            
        }
        return a;
    }

}
