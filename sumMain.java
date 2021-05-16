import java.util.*;
public class sumMain {

	public static void main(String[] args) {
		int[] nums= {0,10,7,5,1};
		int[] answer = TwoSum.findTwoSum(nums, 12);
		System.out.print("12 are the sum of two numbers in the array which are: ");
		for(int i=0;i<answer.length;i++) {
			if(i==answer.length-1)
				System.out.print(nums[answer[i]]);
			else
				System.out.print(nums[answer[i]] + ",");
		}
		System.out.println();
		
		
		
		int[] nums2= {0,10,7,5,1};
		List<Integer[]> answer2 = ThreeSum.findThreeSum(nums2, 11);
		System.out.print("11 are the sum of three numbers in the array which are: ");
		for (Integer[] outer : answer2) {
			  for(Integer inner : outer) {
			    System.out.print(inner+" ");
			  }
		}

		



	}

}
