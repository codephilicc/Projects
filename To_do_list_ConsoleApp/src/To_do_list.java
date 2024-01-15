import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class To_do_list {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		String Todos;

		String addTodos, deleteTodos;

		while (true) {
			if (list.isEmpty()) {
				System.out.println("Welcome todo_List..");
			}
			System.out.println("To add todos, please press 1: ");
			System.out.println("To delete todos,please press 2: ");
			System.out.println("To exit from todos,please press 3: ");

			int i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("Please add task: ");
				addTodos = sc.next();
//				addTodo(addTodos);
				System.out.println("Task to add "+addTodos);
				list.add(addTodos);
				list.forEach(x -> System.out.print(x + " "));
				System.out.println();
//				System.out.println(list);
				break;
			case 2:
				System.out.println("Please delete task: ");
				deleteTodos = sc.next();
				System.out.println("Task to delete "+deleteTodos);
//				deleteTodo(deleteTodos);
				if (list.contains(deleteTodos)) {
					if (!list.isEmpty()) {
						list.remove(deleteTodos);
						list.forEach(x -> System.out.print(x + " "));
						System.out.println();
					} else {
						System.out.println("no task available");
					}
				} else {
					System.out.println("no such task is there");
				}
				break;
			case 3:
				System.exit(0);

			}
			 
		}
	}

//	public static void addTodo(String addTodos) {
//		System.out.println(addTodos);
//		list.add(addTodos);
//		return list;
//	}
//	public static void deleteTodo(String deleTodos){
//		System.out.println(deleTodos);
//		list.remove(deleTodos);
//		return list;
//	}
}
