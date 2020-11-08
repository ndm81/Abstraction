abstract class Animal{     // Abstract class doest not have a body,it is provided by Subclass
	abstract void sound();  //Abstract method
}

    class Dog extends Animal{
	void sound(){System.out.println("This is Dog");}
	public static void main(String[] args) {
		Animal obj=new Dog();
		       obj.sound();
	}
}


