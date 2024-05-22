
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    //first in, first out
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("a new hope");
        q.add("the empire strikes back");
        q.add("return of the jedi");

        System.out.println("first item removed from queue");
        System.out.println(q.remove());


    }
}
