package labs.generic.wild_cards;

import java.util.ArrayList;
import java.util.List;

public class GenericTester {

    //Upper bound wildcard
    //in category
    public static void deleteCat(List<RedCat3> catList, Cat3 cat) {
        catList.remove(cat);
        System.out.println("Cat Removed");
    }

    //Lower bound wildcard
    //out category
    public static void addCat2(List<? super RedCat3> catList) {
        catList.add(new RedCat3("Red Cat"));
        System.out.println("Cat Added");
    }

    //Unbounded wildcard
    //Using Object method toString()
    public static void printAll(List<?> list) {
        for (Object item : list)
            System.out.println(item + " ");
    }

    public static void main(String[] args) {

        List<Animal3> animalList= new ArrayList<Animal3>();
        List<RedCat3> redCatList= new ArrayList<RedCat3>();

        //add list of super class Animal of Cat class
        addCat2(animalList);
        //add list of Cat class
        addCat2(redCatList);
        addCat2(redCatList);

        //print all animals
        printAll(animalList);
        printAll(redCatList);

        Cat3 cat = redCatList.get(0);
        //delete cat
        deleteCat(redCatList, cat);
        printAll(redCatList);
    }
}

class Animal3 {
    String name;
    Animal3(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Cat3 extends Animal3 {
    Cat3(String name) {
        super(name);
    }
}

class RedCat3 extends Cat3 {
    RedCat3(String name) {
        super(name);
    }
}

class Dog3 extends Animal3 {
    Dog3(String name) {
        super(name);
    }
}