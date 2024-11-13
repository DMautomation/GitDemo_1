package javatpoint.java.examples;


class Great_Grand_Father {

    String Str = "Great Grand Father";

    public Great_Grand_Father() {
        
    	System.out.println(Str);
    }    
}

class Grand_Father extends Great_Grand_Father {

    String Str1 = "I am Grand Father";

    void relation() {
        System.out.println(Str1);
    }
}

class Father extends Grand_Father {

    String Str2 = "I am Father";

    void relation() {
        System.out.println(Str2);
    }
}

class Son extends Father {

    String Str3 = "I am Son";

    void relation() {
        System.out.println(Str3);
    }
}

class Daughter_In_Law extends Father {

    String Str4 = "I am Daughter-in-law";

    void relation() {
        System.out.println(Str4);
    }
}

class Daughter extends Father {

    String Str5 = "I am Daughter";

    void relation() {
        System.out.println(Str5);
    }
}

class Son_In_Law extends Father {

    String Str6 = "I am Son-in-law";

    void relation() {
        System.out.println(Str6);
    }
}

class HybridInheritanceExample {

    Great_Grand_Father ob1 = new Great_Grand_Father();
    Grand_Father ob2 = new Grand_Father();
    Father ob3 = new Father();
    Son ob4 = new Son();
    Daughter_In_Law ob5 = new Daughter_In_Law();
    Daughter ob6 = new Daughter();
    Son_In_Law ob7 = new Son_In_Law();
    
    //Great_Grand_Father.relation();

}
