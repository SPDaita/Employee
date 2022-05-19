package main.java;

class Employee1{	
	String name;
	int year;
	Float salary;
	String address;
	Employee1(String name,int year,String address){
		this.name = name;
		this.year = year;
		this.address = address;
	}
}

	class Employee2{
		String name;
		int year;
		float salary;
		String address;
		Employee2(String name,int year,String address){
			this.name = name;
			this.year = year;
			this.address = address;
		}
	}
	
	class Employee3{
		String name;
		int year;
		float salary;
		String address;
		Employee3(String name,int year,String address){
			this.name = name;
			this.year = year;
			this.address = address;
		}
		
	}
	class Employee{
		public static void main(String[] args) {
			Employee1 a = new Employee1("Robert ", 1994," 64C-WallsStreet");
			Employee2 b = new Employee2(" Sam ", 2000," 68D-WallsStreet");
			Employee3 c = new Employee3(" John ", 1999," 26B-WallsStreet");
			System.out.println("Name Year of joining Address "+a.name+a.year+a.address+ b.name+b.year+b.address+ c.name+c.year+c.address);
		}
	}
