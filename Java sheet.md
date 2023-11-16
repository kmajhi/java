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


