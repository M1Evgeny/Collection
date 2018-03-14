package by.pvt.arrays.runner;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import by.pvt.arrays.model.Student;
import by.pvt.arrays.model.StudentAgeComparator;
import by.pvt.arrays.model.StudentFullComparator;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// HashSet - обеспечивает уникальность и быстроту сравнения
		Set<String> set = new HashSet<>();
		set.add("Minsk");
		set.add("London");
		set.add("Brest");
		set.add("Grodno");
		set.add("Vitebsk");
		set.add("Minsk");

		// for (String s : set) {
		// System.out.println(s);
		// }
		// System.out.println();

		Set<String> lHset = new LinkedHashSet<>();
		lHset.add("Minsk");
		lHset.add("London");
		lHset.add("Brest");
		lHset.add("Grodno");
		lHset.add("Vitebsk");
		lHset.add("Vitebsk");

		// for (String s : lHset) {
		// System.out.println(s);
		// }
		//
		// System.out.println();

		// строки по умолчанию сортируются по алфавиту
		Set<String> tHset = new TreeSet<>();
		tHset.add("One");
		tHset.add("Two");
		tHset.add("Three");
		tHset.add("Four");
		tHset.add("Five");
		tHset.add("Six");
		tHset.add("Six");

		// for (String s : tHset) {
		// System.out.println(s);
		// }
		//
		// System.out.println();

		Set<Student> tset = new TreeSet<>(new StudentFullComparator());
		tset.add(new Student("Jonh", "O", 33));
		tset.add(new Student("Tom", "H", 20));
		tset.add(new Student("Tom", "H", 21));
		tset.add(new Student("Mike", "Hi", 33));
		tset.add(new Student("Mike", "L", 40));
		tset.add(new Student("Luke", "S", 65));

		for (Student s : tset) {
			System.out.println(s);
		}

		System.out.println();

		Set<Student> treeset = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student st1, Student st2) {
				return st1.getName().compareTo(st2.getName());
			}

		});
	}

}
// свойства(их 4) коллекции: хранение
// извлечение
// свойство перебираемости
// и упорядоченность

// TreeSet - позволяет хранить объекты в отсортированном порядке, но должен быть
// указан порядок сортировки. При добавление вызывает метод compareTo интерфейса
// Comparable, метод возвращает 0, отрицательное и положительное

// equals and hashcode - проверяет на уникальность