import java.util.*;

public class MyQueue<E>{
    private Queue<E> queueList;

    public MyQueue(){
        queueList = new LinkedList<E>();
    }

    
    public void tambahTugas(E object){
        queueList.add(object);
    }

    public E hapusTugas() throws NoSuchElementException{
        return queueList.remove();
    }

    public boolean isEmpty(){
        return queueList.isEmpty();
    }

    public void printFirstTodo(){

        Iterator<E> firstTodo = queueList.iterator();
        E value = firstTodo.next();
        System.out.println("No. 1 "+value + " ");
        System.out.println();

    }
    public void printTodo(){
        Iterator<E> iterator = queueList.iterator();

        Integer no = 1;
        while(iterator.hasNext()){
            E value = iterator.next();
            System.out.println("No. "+no+ " "+ value + " " );
            System.out.println();
            no++;
        }
    }

}
