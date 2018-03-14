package by.pvt.arrays.model;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}

	// преимущество ComparATOR - универсальность, можно создать сколько угодно
	// компараторов
}

// если у интерфейса один метод - это функциональный интерфейс