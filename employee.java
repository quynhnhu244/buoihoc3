package pknew;
	import java.util.*;
	public class employee {
		String name;
		int age;
		String phone[];
		String email;
	employee(String n, int a) {
		name = n;
		age = a;
	}

	void setData(String n, int a, String p[], String e)
		{
			name=n;
			age=a;
			phone=p;
			email=e;
		}
		void display()
		{
			System.out.println(name);
			System.out.println(age);
			System.out.println(phone);
			System.out.println(email);
		}
		void inrasdt() {
			for(String a:phone) {
				if(a.startsWith("098")) {
					System.out.println("day la so viettel: " +a);
				}
			}
		}
	}
