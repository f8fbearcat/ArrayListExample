import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList array_name = new ArrayList();
		ArrayList array_number = new ArrayList();
		for(;;) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			switch (num) {
				case 1:{
					array_name.add(input.next());
					array_number.add(input.next());
					continue;}
				case 2:{
					int index = input.nextInt();
						System.out.println(array_name.get(index) + "\t" + array_number.get(index));
					continue;}
				case 3:{
					int delete_index = input.nextInt();
					array_name.remove(delete_index);
					array_number.remove((delete_index));
					continue;}
				case 4:{
					for (int i = 0; i < array_name.size(); i++) {
						System.out.println(i + "\t" + array_name.get(i) + "\t" + array_number.get(i));
					}
					continue;}
				case 5:
					input.close();
					break;
			}
		}
	}
}