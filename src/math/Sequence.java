package math;

public class Sequence {

	public static void main(String[] args) {
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 100);
		}
		System.out.println("产生的随机数为：");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		/*
		 * 冒泡排序
		 */
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < number.length - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}
			}
		}
		System.out.println("从小到大排序后为：");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
