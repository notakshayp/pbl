class one {
    void a() {
        System.out.println("a");
    }

}

class two extends one {
    void b() {
        System.out.println("b");

    }
}

class narrowClassTest {
    public static void main(String[] args) {
        // dev ref dev obj can acess all
        two t = new two();
        t.a();
        t.b();

        // bas ref (bas)dev obj can acess base
        one t2 = (one) new two();
        t2.a();
        // t2.b();

        // base ref dev obj can acess base
        one t3 = new two();
        t3.a();
        // t3.b();

        // dev ref base obj
        // two t4 = new one(); //doesnt work
        // two t4 = (two) new one();
        /*
         * Exception in thread "main" java.lang.ClassCastException: one cannot be cast
         * to two at narrowClassTest.main(narrowClassTest.java:34)
         */
        one h = new two();
        two t4 = (two) h;
        t4.a();
        t4.b();

        // no its not like if we use (dev) we can narrow it no we need to hvae a dev
        // refto do so cehck above snippet

        one hmm = new one();// thorws error chanfe it ti new two() to get rid of it
        two ok = (two) hmm;
        ok.a();
        ok.b();
    }
}
// class notes below
/*
 * 
 * Type casting
 * 
 * 
 * 
 * converting of one datatype to other type types of datatypes 2 typrs 1.
 * primitive data types(single values) 2. referenced datatypes(advanced data
 * types)(multi values)
 * 
 * 
 * 
 * 
 * 
 * 1. char, byte, short, int, long, float, double, boolean
 * 
 * 
 * 
 * 2. array, class(String, StringBuffer, Employes)
 * 
 * 
 * 
 * 
 * 
 * casting primitive datatypes 1. widening 2. narrowing
 * 
 * 
 * 
 * 
 * 
 * widening converting a lower data type to higher datat type is called
 * widening.
 * 
 * 
 * 
 * char ch='A'; int n=(int)ch; //ascii 65 'A'
 * 
 * 
 * 
 * int x=9500; float sal=(float)x; 9500.000000
 * 
 * 
 * 
 * 
 * Narrowing:
 * 
 * 
 * 
 * converting a hiher datatype to lower datatype is called narrowing.
 * 
 * 
 * 
 * int n=66; char ch=(char)n; "B"
 * 
 * 
 * 
 * double d=12.67789 int n=(int)d; 12 explicit
 * 
 * 
 * 
 * 
 * 
 * 
 * Casting with referenced datatypes class is referenced datatype
 * 
 * 
 * 
 * fruit citrus noncitrus lemon orange banana mango
 * 
 * 
 * 
 * 
 * 
 * generally any class can be refered to that calss object only Employee e;
 * e=new Employee();
 * 
 * 
 * 
 * suppose class One anf class Two related class
 * 
 * 
 * 
 * class One Class two extends One
 * 
 * 
 * 
 * One o=new One(); Two t=new Two();
 * 
 * 
 * 
 * 
 * One o=(One)new Two();// widening
 * 
 * 
 * 
 * Two t=(Two)new One(); //narrowing
 * 
 * 
 * 
 * 
 * examples narrowing in referenced data types:
 * 
 * 
 * 
 * by taking sub class ref to refer super class object
 * 
 * 
 * 
 * 
 * widening class One { void show1() { S.o.pln("super clasw method"); } } class
 * Two extends One { void show1() { S.o.pln("sub clasw method"); } } class cast
 * { psvm() { One o; o=(One)new Two(); o.show1(); // super clas method
 * 
 * o.show2(); // erroe cant find show2() // in widening the pg can access all
 * super class methods , but not the sub class methods
 * 
 * 
 * 
 * 
 * } }
 * 
 * 
 * 
 * 
 * psvma() { One o; o=(One)new Two();
 * 
 * o.show1();
 * 
 * 
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * Narrowing in refernced datatype: narrowing convert super class type into sub
 * class typr
 * 
 * 
 * 
 * sub class ref to refer super class object
 * 
 * 
 * 
 * class One { void show1() { S.o.pln("super clasw method"); } } class Two
 * extends One { void show2() { S.o.pln("sub clasw method"); } }
 * 
 * 
 * 
 * class cast { psvm() { Two t; t=(Two)new One(); t.show1(); t.show2(); } }
 * Solution let us not create an object to super class as we did in the previous
 * case this time we cfreate an object to subclass and use narrowing.
 * 
 * 
 * 
 * 
 * class One { void show1() { S.o.pln("super clasw method"); } } class Two
 * extends One { void show2() { S.o.pln("sub clasw method"); } }
 * 
 * 
 * 
 * class casrt
 * 
 * 
 * 
 * { psvm() { One o; o=new Two(); // super class ref to refer sub class object
 * Two t= (Two)o;// this narrowing- converting class one ref to class two
 * t.show1(); t.show2(); } }
 * 
 */