//to acess super clas methona nad vairlses usejng super ket word in subclass

//ex: 

class one {
    int i = 10;

    void show() {
        System.out.println("i=" + i);
    }
}

class two extends one {
    int i = 20;

    void show() {
        System.out.println("i= " + i);
        System.out.println("i= " + super.i);
        super.show();
    }
}

class SuperEx {
    public static void main(String[] args) {
        two t = new two();
        t.show();
    }
}
