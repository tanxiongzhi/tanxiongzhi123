import javax.swing.*;
import java.io.Console;
import java.util.*;

public class program {

    public static void main(String[] arguments){
        System.out.println("Please select collection type, it will call the collection.");
        PrintCollectionType();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print("Please enter content split by single space: ");
        String content = scanner.nextLine();
        String[] cols = content.split(" ");
        int size = 0;
        switch (input){
            case "1":
                ArrayList list = new ArrayList();
                for(int i=0;i<cols.length;i++)
                    list.add(cols[i]);
                System.out.println("You enter " + list.size() + " data.");
                for(int i=0;i<cols.length;i++)
                System.out.print(list.get(i) + " ");
                System.out.println();
                break;
            case "2":
                Vector<String> vector = new Vector<String>();
                for(int i=0;i<cols.length;i++){
                    vector.add(cols[i]);
                }
                System.out.println("There are " + vector.size() + " data in Vector");
                size = vector.size();
                for(int i=0;i<size;i++)
                    System.out.print(vector.get(i) + " ");
                System.out.println();
                break;
            case "3":
                Stack<String> stack = new Stack<String>();
                for(int i=0;i<cols.length;i++){
                    stack.add(cols[i]);
                }
                System.out.println("There are " + stack.size() + " data in Vector");
                size = stack.size();
                for(int i=0;i<size;i++)
                    System.out.print(stack.pop() + " ");
                System.out.println();
                break;
            case "4":
                LinkedList<String> linkedList = new LinkedList<String>();
                for(int i=0;i<cols.length;i++){
                    linkedList.add(cols[i]);
                }
                System.out.println("There are " + linkedList.size() + " data in LinkedList");
                size = linkedList.size();
                for(int i=0;i<size;i++)
                    System.out.print(linkedList.get(i));
                System.out.println();
                break;
            case "5":
                TreeSet<String> treeSet = new TreeSet<String>();
                for(int i=0;i<cols.length;i++){
                    treeSet.add(cols[i]);
                }
                System.out.println("There are " + treeSet.size() + " data in TreeSet");
                size = treeSet.size();
                for(int i=0;i<size;i++)
                    System.out.print(treeSet.pollFirst() + " ");
                System.out.println();
                break;
            case "6":
                PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
                for(int i=0;i<cols.length;i++){
                    priorityQueue.add(cols[i]);
                }
                System.out.println("There are " + priorityQueue.size() + " data in PriorityQueue");
                size = priorityQueue.size();
                for(int i=0;i<size;i++)
                    System.out.print(priorityQueue.poll() + " ");
                System.out.println();
                break;
            case "7":
                ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
                for(int i=0;i<cols.length;i++){
                    arrayDeque.add(cols[i]);
                }
                System.out.println("There are " + arrayDeque.size() + " data in ArrayDeque");
                size = arrayDeque.size();
                for(int i=0;i<size;i++)
                    arrayDeque.poll();
                break;
            case "8":
                TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
                for(int i=0;i<cols.length;i++){
                    treeMap.put(i, cols[i]);
                }
                System.out.println("There are " + treeMap.size() + " data in TreeMap");
                System.out.println("Keys are: " + treeMap.keySet());
                System.out.println("Values are: "+ treeMap.values());
                System.out.println("Key-Value are: " + treeMap.keySet());
                break;
            case "9":
                EnumMap<ColorType, String> enumMap = new EnumMap<ColorType, String>(ColorType.class);
                System.out.println("Please enter cool colors: ");
                enumMap.put(ColorType.Cool, scanner.nextLine());
                System.out.println("Please enter warm colors: ");
                enumMap.put(ColorType.Warm, scanner.nextLine());
                System.out.println("Warm colors are " + enumMap.get(ColorType.Warm));
                System.out.println("Warm colors are " + enumMap.get(ColorType.Cool));
                break;
            case "10":
                HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
                for(int i=0;i<cols.length;i++){
                    hashMap.put(i, cols[i]);
                }
                System.out.println("There are " + hashMap.size() + " data in HasMap");
                System.out.println("Keys are: " + hashMap.keySet());
                System.out.println("Values are: "+ hashMap.values());
                System.out.println("Key-Value are: " + hashMap.keySet());
                break;
            default:
                System.out.println("Un-support selection.");
        }



    }

    public  enum ColorType{
        Cool,
        Warm
    }

    static  void PrintCollectionType(){
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Stack");
        System.out.println("4. LinkedList");
        System.out.println("5. TreeSet");
        System.out.println("6. PriorityQueue");
        System.out.println("7. ArrayDeque");
        System.out.println("8. TreeMap");
        System.out.println("9. EnumMap");
        System.out.println("10. HashMap");
    }
}
