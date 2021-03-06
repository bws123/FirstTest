package javaTest;

public class FirstJava{

	public static void main(String[] args) {

		int a [] = {4,6,1,5,9,10,3,8,7,2};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();System.out.println();
		
		sort(a,0,9);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}

	}
	
	public static void sort(int[] a,int low,int high){
		int start = low;
		int end = high;
		int key = a[low];
		

		
		int count = 0;
		while(end>start){
			System.out.println("Count" + ++count);
			
		//从后往前比较
		while(end>start&&a[end]>=key)
		//如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
		end--;
		if(a[end]<=key){
		int temp = a[end];
		a[end] = a[start];
		a[start] = temp;
		
		System.out.print("key" + key + "  ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		
		System.out.println();
		}
		//从前往后比较
		while(end>start&&a[start]<=key)
		//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
		start++;
		if(a[start]>=key){
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		
		
		System.out.print("key" + key + "  ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		}
		//此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的
		//值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
		}
		
		System.out.println();
		//递归
		if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
		if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1 到最后一个
    }

}
