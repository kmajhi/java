<article id="post-480" class="post-480 post type-post status-publish format-standard hentry category-java tag-java tag-polymorphism">
	<header class="entry-header">
		<h1 class="entry-title">জাভা পলিমরফিজম ( Java Polymorphism&nbsp;)</h1>
		<div class="entry-meta">
			<!-- .entry-meta -->
	</header>

	
<p class="comments-section">পলিমরফিজম হল এমন একটি টেকনিক বা পদ্ধতি যেখানে আমরা একটি ক্লাস, অ্যাবস্ট্রাক্ট ক্লাস বা ইন্টারফেসের অবজেক্ট ক্রিয়েট করি তার চাইল্ড ক্লাসের কনস্ট্রাক্টরের মাধ্যমে । অর্থাৎ আমরা একটি ক্লাসের অবজেক্ট ক্রিয়েট করবো অন্য একটি ক্লাসের কনস্ট্রাক্টর কল করে । সহজ ভাষায় এটিই হল পলিমরফিজম ।</p>
<p class="comments-section">মনে করা যাক, ‌‌ ‌</p>
<pre><code class="lang-java‌">    public class Liquid {
        public void swirl(boolean clockwise) {
            // Implement the default swirling behavior for liquids
            System.out.println("Swirling Liquid");
        }
    }
</code></pre>
<p class="comments-section">এখন এর একটি অবজেক্ট তৈরি করতে চাইলে – আমাদের new অপারেটর ব্যবহার করে তা একটি ভেরিয়েবল এ রাখতে হবে।</p>
<pre><code class="lang-java‌">        Liquid myFavoriteBeverage = new Liquid ();
</code></pre>
<p class="comments-section">এখানে <code>myFavoriteBeverage</code> হচ্ছে আমাদের ভেরিয়েবল যা <code>Liquid</code> অবজেক্ট এর রেফারেন্স। আমরা এখন পর্যন্ত যা যা শিখেছি সে অনুযায়ী এই স্টেন্টমেন্টটি যথার্থ। তবে আমরা এর আগের অধ্যায়ে <code>Is-A</code> সম্পর্কে জেনে এসেছি।</p>
<p class="comments-section">আমাদের জাভা প্রোগ্রামিং পলিমরফিজম সাপোর্ট করায় আমরা <code>myFavoriteBeverage</code> এই রেফারেন্সের যায়গায় <code>Is-A</code> সম্পর্কিত যে কোন টাইপ রাখতে পারি। যেমন – ‌ ‌</p>
<pre><code class="lang-java‌">
    Liquid myFavoriteBeverage = new Coffee();
    Liquid myFavoriteBeverage = new Milk();
</code></pre>
<p class="comments-section">এখানে <code>Coffee</code> এবং <code>Milk</code> হচ্ছে<code>Liquid</code>এর সাব- ক্লাস বা টাইপ এবং <code>Liquid</code> এদের সুপার ক্লাস বা টাইপ।</p>
<p class="comments-section">পলিমরফিজম নিয়ে আরও একটু আশ্চর্য হতে চাইলে আমরা এখন একটি বিষয় জানবো যা দিয়ে আমরা কোন একটি অবজেক্ট এর কোন মেথড কল করবো তবে তা কোন ক্লাসের অবজেক্ট সেটি না জেনেই। আরেকটু পরিষ্কার করে বলি, আমরা যখন সুপার ক্লাসের এর রেফারেন্স ধরে কোন এর মেথড কল করবো তখন কিন্তু আমরা জানি না যে এটি আসলে কোন অবজেক্ট এর মেথড। যেমন- ‌ ‌</p>
<pre><code class="lang-java‌">
    Liquid myFavoriteBeverage = // ….
</code></pre>
<p class="comments-section">এখানে আমাদের myFavoriteBeverage এই রেফারেন্স এ <code>Liquid</code>, <code>Coffee</code>, <code>Milk</code> এর যেকোন একটির অবজেক্ট হতে পারে। উদাহরণ &#8211;<br />
‌</p>
<pre><code class="lang-java‌">  
  
  public class Coffee extends Liquid {
        @Override
        public void swirl(boolean clockwise) {
            System.out.println("Swirling Coffee");
        }
    }

    public class Milk extends Liquid{
        @Override
        public void swirl(boolean clockwise) {
            System.out.println("Swirling Milk");
        }
    } 

    public class CoffeeCup {
        private Liquid innerLiquid;

        void addLiquid(Liquid liq) {
            innerLiquid = liq;
            // Swirl counterclockwise
            innerLiquid.swirl(false);
        }
    }
</code></pre>
<p class="comments-section">আমরা এখানে একটি <code>CoffeeCup</code> ক্লাস লিখেছি যার মাঝে <code>addLiquid()</code> নামে একটি মেথড আছে যা কিনা একটি <code>Liquid</code> টাইপ parameter নেয়, এবং সেই <code>Liquid</code> এর <code>swirl()</code> মেথড-কে কল করে।</p>
<p class="comments-section">কিন্তু আমরা আমাদের সত্যিকারের জগতে একটি কফি-কাপ এ শুধুমাত্র কফি-ই এড করতে পারি তা নয়, আমরা চাইলে যে কোন ধরণের লিকুইড এড করতে পারি, সেটি মিল্ক ও হতে পারে। তাহলে এই <code>addLiquid</code> মেথড তো শুধুমাত্র <code>Liquid</code> টাইপ parameter নেয়, তাহলে আমাদের সত্যিকারের জগতের সাথে এই প্রোগ্রামিং মডেল এর সাদৃশ্য থাকলো কোথায় ?</p>
<p class="comments-section">তবে মজার ব্যপার এখানেই, আমাদের এই <code>CoffeeCu</code>p ক্লাসটি পলিমরফিজমের ম্যজিক ব্যাবহার করে সত্যিকার অর্থেই আমাদের সত্যিকারের জগতের <code>CoffeeCup</code> এর মতোই কাজ করে। ‌</p>
<pre><code class="lang-java‌">
    public class MainApp {
        public static void main(String[] args) {
            // First you need a coffee cup
            CoffeeCup myCup = new CoffeeCup();

            // Next you need various kinds of liquid
            Liquid genericLiquid = new Liquid();
            Coffee coffee = new Coffee();
            Milk milk = new Milk();

            // Now you can add the different liquids to the cup
            myCup.addLiquid(genericLiquid);
            myCup.addLiquid(coffee);
            myCup.addLiquid(milk);
        }
    }
</code></pre>
<p class="comments-section">উপরের কোড গুলোতে দেখা যাচ্ছে যে আমরা একটি <code>CoffeeCup</code> এর একটি অবজেক্ট তৈরি করে সেটি তে বিভিন্ন রকম <code>Liquid</code> এড করতে পারছি।</p>
<p class="comments-section">আরেকটু লক্ষ্য করি,</p>
<pre><code class="lang-java">    <span class="hljs-function"><span class="hljs-keyword">void</span> <span class="hljs-title">addLiquid</span><span class="hljs-params">(Liquid liq)</span> </span>{
            innerLiquid = liq;
            <span class="hljs-comment">// Swirl counterclockwise</span>
            innerLiquid.swirl(<span class="hljs-keyword">false</span>);
      }
</code></pre>
<p class="comments-section">এই মেথডটিতে innerLiquid.swirl(false) যখন কল করি তখন কিন্তু আমরা জানি না যে এই innerLiquid আসলে কোন অবজেক্ট এর রেফারেন্স। এটি লিকুইড বা এর যে কোন সাব-টাইপ হতে পারে।</p>
<p class="comments-section">কিছু প্রয়োজনীয় তথ্য-</p>
<p class="comments-section">১. একটি সাব ক্লাস এর অবজেক্টকে আমরা এর সুপার ক্লাসের রেফারেন্স এ এসাইন করতে পারি। ২. সাব ক্লাসের অবজেক্টকে সুপার ক্লাসের রেফারেন্স-এ এসাইন করলে, মেথড কল করার সময় শুধু মাত্র সুপার ক্লাসের মেথড গুলোকেই কল করতে পারি। ৩. তবে সাব ক্লাস যদি সুপার ক্লাসের মেথড অভাররাইড করে, তাহলে যদিও আমরা সুপার ক্লাস এর রেফারেন্স ধরে মেথড কল করছি, কিন্তু রানটাইম-এ সাব ক্লাসের মেথডটি কল হবে। মনে রাখতে হবে এটি শুধুমাত্র মেথড অভাররাইড করা হলেই সত্য হবে।</p>
<p class="comments-section"><strong>আপ-কাস্টিং(Upcasting ) এবং ডাউনকাস্টিং (Downcasting)</strong></p>
<pre><code class="lang-java">        Liquid liquid = <span class="hljs-keyword">new</span> Coffee ();
</code></pre>
<p class="comments-section">এখানে সাব ক্লাসের অবজেক্টকে সুপার ক্লাসের রেফারেন্স এ এসাইন করা হয়ছে। একে বলা হয় আপ-কাস্টিং। এই কাস্টিং সবসময় সেইফ ধরা হয় কারণ আপকাস্টং এর ক্ষেত্রে সাব ক্লাস সবসময়ই সুপার ক্লাসের সবকিছু ইনহেরিট করে এবং কম্পাইলার কম্পাইল করার সময়-ই এ কাস্টিং করা সম্ভব কিনা তা চেক করে থাকে।</p>
<pre><code class="lang-java">        Liquid liquid = <span class="hljs-keyword">new</span> String();
</code></pre>
<p class="comments-section">উপরের স্টেটমেন্টটি কম্পাইলার কম্পাইল করবে না, কারণ <code>String</code> মোটেই <code>Liquid</code> ক্লাসের সাব ক্লাস নয়। এক্ষেত্রে কম্পাইলার incompatible types ইরর দেখাবে।</p>
<p class="comments-section"><strong>হোমেজিনিয়াস কালেকশন ( Homogeneous Collection ):</strong></p>
<p class="comments-section">হোমোজিনিয়াস কালেকশন হল একই ক্লাসের কিছু সংখ্যক অবজেক্টের কালেকশন । একটি উদাহরন দিয়ে বিষয়টি একটু সুরাহা করা যাকঃ</p>
<pre><code class="lang-java"><span class="hljs-class">
  
 interface Animal {
    public abstract void name(String animalName);
}

class Cow implements Animal {

    private String animalName;

    public void work(String animalWork) {
        System.out.println("Work of " + this.animalName + " is " + animalWork);
    }

    @Override
    public void name(String animalName) {
        this.animalName = animalName;
        System.out.println("Name of the animal is: " + this.animalName);
    }
}

public class Main {

    public static void main(String[] args) {

        Animal[] collection1 = new Cow[3];
        collection1[0] = new Cow();
        collection1[1] = new Cow();
        collection1[2] = new Cow();

        Cow[] collection2 = new Cow[3];
        collection2[0] = new Cow();
        collection2[1] = new Cow();
        collection2[2] = new Cow();
    }
}

</code></pre>
<p class="comments-section">লক্ষ করুন । এখানে <code>Cow</code> ক্লাসটি <code>Animal</code> ইন্টারফেসের চাইল্ড । এবং <code>Main</code> ক্লাসের <code>main</code> মেথড এর মাঝে ২ টি অবজেক্টের অ্যারে ডিক্লেয়ার করা হয়েছে । একটি <code>Animal</code> ক্লাসের অবজেক্টের অ্যারে যেটির সবগুলা অবজেক্ট <code>Cow</code> ক্লাসের কনস্ট্রাক্টর দিয়ে ইন্সট্যানশিয়েট করা হয়েছে । এখানে পলিমরফিজম স্পষ্ট । এবং অন্যটি অবজেক্ট অ্যারেটি চীরাচরিত অবজেক্ট অ্যারে । এই দুইি অ্যারেই হল হোমোজিনিয়াস কালেকশনের উদাহরন । বোঝা যায়নি ? ওকে, এখানে <code>collection1</code> অ্যারেটির প্রতিটি অবজেক্টই <code>Cow</code> ক্লাসের কনস্ট্রাক্টর দিয়ে ইন্সট্যানশিয়েট করা হয়েছে । তার মানে <code>collection1</code> এর মাঝে সবগুলা অবজেক্টই একই ধরনের । যেহেতু এই অ্যারেটির সবগুলা এলিমেন্ট একই ধরনের/ক্লাসের অবজেক্ট সুতরাং এটিকে বলা হবে হোমোজিনিয়াস কালেকশন । একই কথা <code>collection2</code> এর ক্ষেত্রেও প্রোযোজ্য ।</p>
<p class="comments-section"><strong>হেটারোজিনিয়াস কালেকশন ( Heterogeneous Collection ):</strong></p>
<p class="comments-section">ভিন্নধর্মী অবজেক্টের কালেকশনকেই বলা হয় হেটারোজিনিয়াস কালেকশন । হেটারোজিনিয়াস কালেকশন বুঝতে হলে আমাদের একটি উদাহরন দেখে নেওয়া উত্তমঃ</p>
<pre><code class="lang-java"><span class="hljs-class"><span class="hljs-keyword">class</span>

  class Animal {
    String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void name() {
        System.out.println("Animal name is: " + this.animalName);
    }
}

class Cow extends Animal {
    public Cow(String animalName) {
        super(animalName);
    }

    public void work(String animalWork) {
        System.out.println("Work of " + this.animalName + " is " + animalWork);
    }
}

class Dog extends Animal {
    public Dog(String animalName) {
        super(animalName);
    }

    public void work(String animalWork) {
        System.out.println("Work of " + this.animalName + " is " + animalWork);
    }
}

class Cat extends Animal {
    public Cat(String animalName) {
        super(animalName);
    }

    public void work(String animalWork) {
        System.out.println("Work of " + this.animalName + " is " + animalWork);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("Dolphin");
        animals[1] = new Cow("Big Cow");
        animals[2] = new Dog("Red Dog");
        animals[3] = new Cat("White Cat");
    }
}

</code></pre>
<p class="comments-section">খুব ভালোভাবে লক্ষ করুন । আমরা <code>Animal</code> ক্লাসের অবজেক্টের একটু অ্যারে ডিক্লেয়ার করেছি যার সাইজ ৪ । কিন্তু ইন্সট্যানশিয়েট করার সমস আমরা পলিমরফিজম মেকানিজম ব্যাবহার করে এর চাইল্ড ক্লাসের ভিন্ন ভিন্ন কনস্ট্রাক্টর দিয়ে ইন্সট্যানশিয়েট করেছি । অর্থাৎ <code>animals</code> অ্যারেটির প্রতিটি অবজেক্টই আলাদা আলাদা কনস্ট্রাক্ট দিয়ে ইন্সট্যানশিয়েট করা এবং তাদের বিহ্যাভিয়েরাল পার্থ্য আছে । এধরনের কালেকশনকে বলা হয় হেটারোজিনিয়াস কালেকশন ।</p>
<p class="comments-section">এবার একটু ভিন্ন পন্থায় এগোন যাক । মেইন ক্লাসটিকে আমরা একটু মডিফাই করবো । বাকী সবই ঠিক থাকবে আগের মত ।</p>
<pre><code class="lang-java">
  
  public static void main(String[] args) {
    Animal animal = new Cat("Cute Cat");
    animal.name();
    // animal.work("Some Work"); // Not possible
    Cat cat = new Cat("Pretty Cat");
    cat.name();
    cat.work("It plays");
}

    
</code></pre>
<p class="comments-section">খেয়াল করে দেখুন আমরা <code>Animal</code> এবং <code>Cat</code> এর অবজেক্ট ক্রিয়েট করার সময় কনস্ট্রাক্টর ব্যাবহার করেছি <code>Cat</code>এর কিন্তু <code>Animal</code> এর অবজেক্ট থেকে আমরা <code>work</code> মেথডটি কোন ভাবেই কল করতে পারছি না বা পারবো না কিন্তু <code>Cat</code> এর অবজেক্ট থেকে ঠিকই পারছি । কারনটা কি ? কারন হল <code>Animal</code> ক্লাসের মাঝে ঠিক যে যে মেথড আছে সেগুলাকেই আমরা অ্যাক্সেস করতে পারব তবে <code>Cat</code> এর ইমপ্লিমেন্টেশন দিয়ে । <code>Animal</code> এর মাঝে নেই কিন্তু <code>Cat</code> ক্লাসে বাড়তি আছে এমন কোন মেথডকে আমরা অ্যাক্সেস করতে পারবো না । এমনকি <code>Animal</code>ক্লাসের অবজেক্টে <code>Cat</code> ক্লাসের <code>work</code> মেথডের কোন রেফারেন্সই ক্রিয়েট হবেনা ।</p>
<p class="comments-section">তাহলে এটা করি কেন আমরা ? এটা করার পেছনে বেশ কিছু কারন থাকতে পারে । প্রথমত আমরা প্যারেন্ট ক্লাস এবং চাইল্ড ক্লাসের ইমপ্লিমেন্টশন নিয়ে কাজ করতে চাইলে পলিমরফিজমের এই সুবিধাটি নেওয়া হয় । অন্য কারনটি হল মেমোরি কনজাম্পশন । ভেবে দেখুন যদি <code>Animal</code> ক্লাসে ৩ টি মেথড থাকে যেগুলার জন্য আপনি <code>Cat</code> ক্লাসের ইমপ্লিমেন্টেশন ব্যাবহার করতে চান , কিন্তু <code>Cat</code> ক্লাসের মাঝে ১৫ টির মত মেথড আছে এবং অনেক অ্যাট্রিবিউট । আপনি যদি <code>Cat</code> এর অবজেক্ট ক্রিয়েট করেন তবে মেমোরি থেকে প্রচুর স্পেস কনজিউম করবে উক্ত অবজেক্ট । অন্যদিকে আপনি যদি <code>Animal</code> এর অবজেক্ট ক্রিয়েট করেন <code>Cat</code> এর কনস্ট্রাক্টর ব্যাবহার করে তাহলে <code>Cat</code> ক্লাসের ইমপ্লিমেন্টেশন ব্যাবহার করতে পারছেন এবং মেমোরি থেকে খুব কম মেমোরি কনজিউম করছে ( <code>Animal</code> মেথডগুলার জন্য প্রয়োজনীয় মোমোরি মাত্র ) । কোনটি বেশি সুবিধাজনক ? এছাড়া আরো কারন আছে । পরবর্তীতে সেগুলা নিয়েও আলোচনা করা হবে ।</p>
<h2 class="h2">Runtime Polymorphism in Java</h2>
<p><b>Runtime polymorphism</b> or <b>Dynamic Method Dispatch</b> is a process in which a call to an overridden method is resolved at runtime rather than compile-time.</p>
<p>In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.</p>
<p>Let&#8217;s first understand the upcasting before Runtime Polymorphism.</p>
<h3 class="h4">Upcasting</h3>
<p>When reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:</p>
<p><img src="https://www.javatpoint.com/images/upcasting.JPG" alt="Upcasting in java" /></p>
<div class="codeblock">
<div class="dp-highlighter">
<div class="bar"></div>
<ol class="dp-j" start="1">
<li class="alt"><span class="keyword">class</span> A{}</li>
<li class=""><span class="keyword">class</span> B <span class="keyword">extends</span> A{}</li>
</ol>
</div>
</div>
<div class="codeblock">
<div class="dp-highlighter">
<div class="bar"></div>
<ol class="dp-j" start="1">
<li class="alt">A a=<span class="keyword">new</span> B();<span class="comment">//upcasting</span></li>
</ol>
</div>
</div>
<hr />
<h3 class="h3ex">Example of Java Runtime Polymorphism</h3>
<p>In this example, we are creating two classes Bike and Splendar. Splendar class extends Bike class and overrides its run() method. We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, subclass method is invoked at runtime.</p>
<p>Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.</p>
<pre><code>
class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splender extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splender(); // upcasting
        b.run();
    }
}
</code></pre>

<p><span class="testit"><a href="http://www.javatpoint.com/opr/test.jsp?filename=Splender" target="_blank" rel="noopener">Test it Now</a></span></p>
<div class="codeblock3">
<pre>Output:running safely with 60km.
</pre>
</div>
<h2 class="h2">Java Runtime Polymorphism Example: Bank</h2>
<p>Consider a scenario, Bank is a class that provides method to get the rate of interest. But, rate of interest may differ according to banks. For example, SBI, ICICI and AXIS banks are providing 8.4%, 7.3% and 9.7% rate of interest.</p>
<p><img src="https://www.javatpoint.com/images/core/bankinheritance.png" alt="Java Runtime Polymorphism example of bank" /></p>
<h4 class="n">Note: This example is also given in method overriding but there was no upcasting.</h4>

<code><pre>

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

class TestPolymorphism {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}

</code></pre>
<h2 class="h2">Java Runtime Polymorphism Example: Shape</h2>
<code><pre>
  class Shape{
    void draw(){
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("drawing triangle...");
    }
}

class TestPolymorphism2{
    public static void main(String args[]){
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}

</pre></code>
<p><span class="testit"><a href="http://www.javatpoint.com/opr/test.jsp?filename=TestPolymorphism2" target="_blank" rel="noopener">Test it Now</a></span></p>
<p>Output:</p>
<div class="codeblock3">
<pre>drawing rectangle...
drawing circle...
drawing triangle...
</pre>
</div>
<h2 class="h2">Java Runtime Polymorphism Example: Animal</h2>
<code><pre>

  class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("eating rat...");
    }
}

class Lion extends Animal{
    void eat(){
        System.out.println("eating meat...");
    }
}

class TestPolymorphism3{
    public static void main(String[] args){
        Animal a;
        a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
        a = new Lion();
        a.eat();
    }
}

</pre></code>
<p><span class="testit"><a href="http://www.javatpoint.com/opr/test.jsp?filename=TestPolymorphism3" target="_blank" rel="noopener">Test it Now</a></span></p>
<p>Output:</p>
<div class="codeblock3">
<pre>eating bread...
eating rat...
eating meat...
</pre>
</div>
<h2 class="h2">Java Runtime Polymorphism with Data Member</h2>
<table>
<tbody>
<tr>
<td>Method is overridden not the datamembers, so runtime polymorphism can&#8217;t be achieved by data members.</td>
</tr>
<tr>
<td>In the example given below, both the classes have a datamember speedlimit, we are accessing the datamember by the reference variable of Parent class which refers to the subclass object. Since we are accessing the datamember which is not overridden, hence it will access the datamember of Parent class always.</td>
</tr>
</tbody>
</table>
<h4 class="n">Rule: Runtime polymorphism can&#8217;t be achieved by data members.</h4>
<pre><code>
  
class Bike{
    int speedlimit = 90;
}

class Honda3 extends Bike{
    int speedlimit = 150;
    
    public static void main(String args[]){
        Bike obj = new Honda3();
        System.out.println(obj.speedlimit); // 90
    }
}
  
</code></pre>

<p><span class="testit"><a href="http://www.javatpoint.com/opr/test.jsp?filename=Honda3" target="_blank" rel="noopener">Test it Now</a></span></p>
<p>Output:</p>
<div class="codeblock3">
<pre>90
</pre>
</div>
<h2 class="h2">Java Runtime Polymorphism with Multilevel Inheritance</h2>
<p>Let&#8217;s see the simple example of Runtime Polymorphism with multilevel inheritance.</p>

<pre><code>

class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating fruits");
    }
}

class BabyDog extends Dog {
    void eat() {
        System.out.println("drinking milk");
    }

    public static void main(String args[]) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
  
</code></pre>


<p><span class="testit"><a href="http://www.javatpoint.com/opr/test.jsp?filename=BabyDog" target="_blank" rel="noopener">Test it Now</a></span></p>
<p>Output:</p>
<div class="codeblock3">
<pre>eating
eating fruits
drinking Milk
</pre>
</div>
<hr />
<h3 class="h3">Try for Output</h3>
<pre><code>
  
class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}

class BabyDog1 extends Dog {
    public static void main(String args[]) {
        Animal a = new BabyDog1();
        a.eat();
    }
}

</code></pre>
<p><span class="testit"><a href="http://www.javatpoint.com/opr/test.jsp?filename=BabyDog1" target="_blank" rel="noopener">Test it Now</a></span></p>
<p>Output:</p>
<div class="codeblock3">
<pre>Dog is eating
</pre>
</div>
<p>Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.</p>

<h5 class="h5">If you have any questions or suggestions feel free to contact me through email. 
  Thank you! </h5>
  <code><span class="posted-on">Posted on <a href="https://github.com/kmajhi/java/tree/main/OOP/Polymorphism" rel="bookmark"><time class="entry-date published" datetime="2023-29-15T20:48:44+06:00">October 29, 2023</time></a></span><span class="byline"> by <span class="author vcard"><a class="url fn n" href="https://www.github.com/kmajhi](https://github.com/kmajhi/java/tree/main/OOP/Polymorphism">MD. Sujon Mahamud</a></span></span>
</div></code>

			
	
