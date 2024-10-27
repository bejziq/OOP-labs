package org.example.week4.Lab.Task1.People;

public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());


        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        Teacher Dino = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher Becir = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( Becir );
        System.out.println( Dino );


        Student imran = new Student("imran", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            imran.study();
        }
        System.out.println( imran );

        Person ali = new Person("Ali", "Gornje Rosulje bb", 21, "bih");
        ali.getAge();

    }

}
