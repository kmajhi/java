<h1>Object-Oriented Programming</h1>
It is a programming approach that primarily focuses on using objects and classes. The objects can be any real-world entities.
<h2>class</h2>
A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.

<pre>
class ClassName {
// Fields
// Methods
// Constructors
// Blocks
}
</pre>

<h2>object of class</h2>
An object is an instance of a Class.

<pre>className object = new className();</pre>

<h2>Encapsulation</h2>
Encapsulation is a mechanism of wrapping the data and code acting on the data together as a single unit. In encapsulation, the variables of a class will be hidden from other classes and can be accessed only through the methods of their current class.


<pre>
  public class Person{ 
   private String name; // using private access modifier 

   // Getter 
   public String getName(){ 
    return name; 
   } 

   // Setter  
   public void setName(String newName){ 
     this.name = newName; 
   } 
}
</pre>

<h2>Inheritance</h2>
Inheritance can be defined as the process where one class acquires the properties of another. With the use of inheritance the information is made manageable in a hierarchical order.

<pre>
class Subclass-name extends Superclass-name{ 
//methods and fields 
}
</pre>

<h3>Example</h3>

<pre>
class Employee{  
  float salary=40000;  
}  

  class Programmer extends Employee{  
  int bonus=10000;  
  public static void main(String args[]){  
    Programmer p=new Programmer();  
    System.out.println("Programmer salary is:"+p.salary);  
    System.out.println("Bonus of Programmer is:"+p.bonus);  
  }  
}  
</pre>

<h2>Polymorphism</h2>
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

<pre>
// A class with multiple methods with the same name 
  
public class Adder{ 
// method 1 
  public void add(int a, int b){ 
  System.out.println(a + b); 
  } 

  // method 2 
  public void add(int a, int b, int c){ 
  System.out.println(a + b + c); 
  } 

  // method 3 
  public void add(String a, String b){ 
  System.out.println(a + " + " + b); 
  }  
} 

// My main class 
class MyMainClass{ 
  public static void main(String[] args){ 
    Adder adder = new Adder(); // create a Adder object 
    adder.add(5, 4); // invoke method 1 
    adder.add(5, 4, 3); // invoke method 2 
    adder.add("5", "4"); // invoke method 3 
  } 
}
</pre>


