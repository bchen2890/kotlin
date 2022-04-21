package Basic

fun printSet(title:String,set:HashSet<String>){
    println("$title:");
    for(element in set)
    {
        println(element);
    }
}
fun printNumSet(title:String,set:HashSet<Int>){
    println("$title:");
    for(element in set)
    {
        println(element);
    }
}
fun main(args: Array<String>) {
    var fruitsSet = HashSet<String>();
    val APPLE = "Apple";
    val GRAPE = "Grape";
    val fruitsList = listOf("Banana", "Orange", GRAPE);
    printSet("empty set", fruitsSet);

    fruitsSet.add(APPLE);
    printSet("add an element", fruitsSet);

    fruitsSet.addAll(fruitsList);
    printSet("add elements from list", fruitsSet);

    fruitsSet.remove(APPLE);
    printSet("remove an element", fruitsSet);

    printSet("set is empty:"+fruitsSet.isEmpty(), fruitsSet);

    fruitsSet.clear();
    printSet("clear elements", fruitsSet);

    printSet("set is empty:"+fruitsSet.isEmpty(), fruitsSet);

    fruitsSet.addAll(fruitsList);
    fruitsSet.add(APPLE)
    printSet("hashset", fruitsSet);
    var fruitsCopy = fruitsSet.clone() as HashSet<String>;
    printSet("clone of the hashset", fruitsCopy);

    printSet("hashset contains "+APPLE+fruitsSet.contains(APPLE), fruitsCopy);
    printSet("hashset contains "+GRAPE+fruitsSet.contains(GRAPE), fruitsCopy);

    println("Size of hashset: "+fruitsSet.size);

    fruitsSet.removeAll(fruitsList);
    printSet("remove elements from list", fruitsSet);

    fruitsSet.addAll(fruitsList);
    printSet("add elements from list", fruitsSet);

    fruitsSet.removeIf { f -> f.length>5 }
    printSet("remove if length>5", fruitsSet);

    printSet("hashset 1", fruitsSet);
    printSet("hashset 2", fruitsCopy);
    fruitsSet.addAll(fruitsCopy);
    printSet("union of hashset1 and hashset2", fruitsSet);

    fruitsSet.clear();
    fruitsSet.add(APPLE)
    printSet("hashset 1", fruitsSet);
    printSet("hashset 2", fruitsCopy);
    fruitsSet.retainAll(fruitsCopy);
    printSet("intersect of hashset1 and hashset2", fruitsSet);

    fruitsSet.clear();
    fruitsSet.add(APPLE)
    printSet("hashset 1", fruitsSet);
    printSet("hashset 2", fruitsCopy);
    fruitsSet.removeAll(fruitsCopy);
    printSet("difference of hashset1 and hashset2", fruitsSet);

    printSet("hashset", fruitsSet);
    fruitsSet.count { f -> f.length>5 }
    printSet("count of elements with length>5", fruitsSet);

}