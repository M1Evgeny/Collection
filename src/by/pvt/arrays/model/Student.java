package by.pvt.arrays.model;

public class Student implements Comparable// интерфейс дженерик
// Comparable<Student> в методе
// compareTo(Student st) - так
// правильнее писать - (тело метода:
// return this.age-st.age
// интерфейс наделяет класс сравниваемостью
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

	// методы переопределялись в паре, одни и теже поля должны быть в двух
	// методах(в хэше имя и в екуалс), важен порядок сравнения

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
		// простое число при умножении на которое получаем максимальное
		// распределение инта
		final int prime = 31;
		int result = 1;
		// приме генерируется случайное число
		result = prime * result
				+ ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// аргументом метода ничего кроме объекта не может, так как метод
	// переопределен
	// метод булен
	@Override
	public boolean equals(Object obj) {
		// 1) проверить объект на равенство самому себе
		if (this == obj)
			return true;
		// проверяем что не ноль
		if (obj == null)
			return false;
		// проверяем, что классы одинаковые
		if (getClass() != obj.getClass())
			return false;
		// приведение типа и только после этого переходим к логике сравнения,
		// это закладывает программист - то по каким полям будем сравнивать
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
		// если классы одинаковые, то выполняем приведение и сравнение
		if (o.getClass().equals(Student.class)) {
			Student other = (Student) o;
			return other.age - this.age;
		}
		return 0;// одинаковые
	}

}

// JAVABEAN - шаблон для создания класса
