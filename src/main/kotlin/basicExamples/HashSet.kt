package basicExamples

fun printSet(title:String,set:HashSet<String>){
    println("$title:");
    if(set.isEmpty())
        println("{}");
    else
        for(element in set)
        {
            println("·$element");
        }
}

fun printNumSet(title:String, set:HashSet<Int>){
    println("$title:");
    for(element in set)
    {
        println("·$element");
    }
}

const val APPLE = "Apple";
const val GRAPE = "Grape";
const val LEMON = "Lemon";

fun main(args: Array<String>) {
    var fruitSet = HashSet<String>();
    val fruitList = listOf("Banana", "Orange", GRAPE);
    println()
    printSet("empty set", fruitSet);

    println()
    fruitSet.add(APPLE);
    printSet("add an Apple", fruitSet);

    println()
    fruitSet.addAll(fruitList);
    printSet("add elements from list", fruitSet);

    println()
    fruitSet.remove(APPLE);
    printSet("remove an Apple", fruitSet);

    println()
    println("set is empty :"+fruitSet.isEmpty());
    fruitSet.clear();
    printSet("clear elements", fruitSet);
    println("set is empty :"+fruitSet.isEmpty());

    println()
    fruitSet.addAll(fruitList);
    fruitSet.add(APPLE)
    printSet("hashset", fruitSet);
    var fruitsCopy = fruitSet.clone() as HashSet<String>;
    printSet("clone of the hashset", fruitsCopy);

    println("hashset contains " + APPLE + ": " + fruitSet.contains(APPLE));
    println("hashset contains " + LEMON + ": " +  fruitSet.contains(LEMON));

    println("Size of hashset: "+fruitSet.size);

    println()
    fruitSet.removeAll(fruitList);
    printSet("remove elements from list", fruitSet);

    println()
    fruitSet.addAll(fruitList);
    printSet("add elements from list", fruitSet);

    println()
    fruitSet.removeIf { f -> f.length>5 }
    printSet("remove if length>5", fruitSet);

    println()
    fruitSet.add(LEMON);
    printSet("hashset 1", fruitSet);
    printSet("hashset 2", fruitsCopy);
    fruitSet.addAll(fruitsCopy);
    printSet("union of hashset1 and hashset2", fruitSet);

    println()
    fruitSet.clear();
    fruitSet.add(APPLE)
    fruitSet.add(LEMON)
    printSet("hashset 1", fruitSet);
    printSet("hashset 2", fruitsCopy);
    fruitSet.retainAll(fruitsCopy);
    printSet("intersect of hashset1 and hashset2", fruitSet);

    println()
    fruitSet.clear();
    fruitSet.add(APPLE)
    fruitSet.add(LEMON)
    printSet("hashset 1", fruitSet);
    printSet("hashset 2", fruitsCopy);
    fruitSet.removeAll(fruitsCopy);
    printSet("difference of hashset1 and hashset2", fruitSet);

    println()
    fruitSet.addAll(fruitList)
    fruitSet.add(APPLE)
    printSet("hashset", fruitSet);
    println("count of elements with length>5: "+ fruitSet.count { f -> f.length>5 });

    println()
    fruitSet.addAll(fruitList);
    printSet("hashset", fruitSet);
    println("get index of Grape: " + fruitSet.indexOf(GRAPE))

    println()

    var numberSet = HashSet<Int>()
    numberSet.addAll(listOf(65,18,3,20,79,34))

    printNumSet("Number hashset", numberSet);
    println("Max of numberSet: "+numberSet.maxOrNull())
    println("Min of numberSet: "+numberSet.minOrNull())



}