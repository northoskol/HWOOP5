import Data.Student;
import Data.Teacher;
import controller.OnlineStoreController;
import model.Orders;
import model.Shwarma;
import service.DataService;
import view.StoreView;
import view.StudentView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataService data = new DataService();
        StudentView studentView = new StudentView(); // Создание экземпляра StudentView

        data.create(new Student("Ann", 15));
        data.create(new Student("Bill", 15));
        data.create(new Student("Col", 15));
        data.create(new Teacher("Teach1", 32, List.of("math")));
        data.create(new Teacher("Teach2", 43, List.of("math", "physics")));
        data.create(new Teacher("Teach1", 32, List.of("math", "physics", "astronomy")));
        data.create(new Teacher("Teach3", 32, List.of("informatics", "astronomy")));

        data.read(true);
        System.out.println();
        data.read(false);

        // Вывод информации о студентах с использованием StudentView
        System.out.println("\nInformation about students:");
        for (Student student : data.getStudents()) {
            studentView.displayStudent(student);
            System.out.println(); // Добавляем пустую строку между студентами для наглядности
        }
    }
}
