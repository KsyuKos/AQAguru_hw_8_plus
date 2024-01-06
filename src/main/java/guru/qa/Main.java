package guru.qa;

public class Main {

  public static void main(String[] args) {

    ListCollection myArray = new ListCollection();
    myArray.addEl("О");
    myArray.addEl("Май");
    myArray.addEl("Год");
    myArray.printArr();
    myArray.searchEl("Го");
    myArray.printHashCode();
    myArray.makeNoticed("Год");
    myArray.printArr();

    ListCollection myArray2 = new ListCollection();
    myArray2.addElAll(new String[]{"Мой", "дневник"});
    myArray2.printArr();
    myArray2.printHashCode();

    myArray.compareHash(myArray,myArray2);


    MapCollation myMap = new MapCollation();
    myMap.addKeyValue(1,"Молоко");
    myMap.addKeyValue(2,"Хлеб");
    myMap.addKeyValue(3,"Сметана");
    myMap.printMap();
    myMap.replaceValue(3,"Бананы");
    myMap.printMap();
    myMap.searchKey(6);

    }
}