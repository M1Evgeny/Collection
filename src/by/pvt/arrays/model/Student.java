package by.pvt.arrays.model;

public class Student implements Comparable// ��������� ��������
// Comparable<Student> � ������
// compareTo(Student st) - ���
// ���������� ������ - (���� ������:
// return this.age-st.age
// ��������� �������� ����� ���������������
{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private String LastName;
	private int age;

	// ������ ���������������� � ����, ���� � ���� ���� ������ ���� � ����
	// �������(� ���� ��� � � ������), ����� ������� ���������

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String lastName, int age) {
		super();
		this.name = name;
		LastName = lastName;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// ������� ����� ��� ��������� �� ������� �������� ������������
		// ������������� ����
		final int prime = 31;
		int result = 1;
		// ����� ������������ ��������� �����
		result = prime * result
				+ ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// ���������� ������ ������ ����� ������� �� �����, ��� ��� �����
	// �������������
	// ����� �����
	@Override
	public boolean equals(Object obj) {
		// 1) ��������� ������ �� ��������� ������ ����
		if (this == obj)
			return true;
		// ��������� ��� �� ����
		if (obj == null)
			return false;
		// ���������, ��� ������ ����������
		if (getClass() != obj.getClass())
			return false;
		// ���������� ���� � ������ ����� ����� ��������� � ������ ���������,
		// ��� ����������� ����������� - �� �� ����� ����� ����� ����������
		Student other = (Student) obj;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", LastName=" + LastName + ", age="
				+ age + "]";
	}

	@Override
	public int compareTo(Object o) {
		// ���� ������ ����������, �� ��������� ���������� � ���������
		if (o.getClass().equals(Student.class)) {
			Student other = (Student) o;
			return other.age - this.age;
		}
		return 0;// ����������
	}

}

// JAVABEAN - ������ ��� �������� ������
