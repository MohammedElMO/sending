package Model;
public class Student {
	private int age;
	private String name;
	private int id ;

	

	public Student(int age, String name,int id) {
		this.age = age;
		this.name = name;
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @Override
    public String toString() {
		return ("age: "+ this.getAge() + "\n" +"name: " + this.getName() + "\n" + "id : "+ getId() );

    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

}
