package by.pvt.arrays.model;

import java.util.Comparator;

public class StudentFullComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if ((o1.getLastName().compareTo(o2.getLastName())) == 0) {
			if (o1.getName().compareTo(o2.getName()) == 0) {
				return o1.getAge() - o2.getAge();
			}
		} else {
			return o1.getLastName().compareTo(o2.getLastName());
		}
		return 0;
	}

}
