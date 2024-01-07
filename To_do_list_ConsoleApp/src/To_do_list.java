import java.util.ArrayList;
import java.util.Scanner;

public class To_do_list {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
//		String Todos;
		String addTodos, deleteTodos;

		while (true) {

			System.out.println("Welcome todo_List..");
			System.out.println("To add todos, please press 1: ");
			System.out.println("To delete todos,please press 2: ");
			System.out.println("To exit from todos,please press 3: ");

			int i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("Please add task: ");
				addTodos = sc.next();
				System.out.println(addTodos);
				list.add(addTodos);
				System.out.println(list);
				break;
			case 2:
				System.out.println("Please delete task: ");
				deleteTodos = sc.next();
				
				break;
			case 3:
				System.exit(0);

			}

		}

	}

}
