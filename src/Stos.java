import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stos {
    private ArrayList<Integer> elementy = new ArrayList<>();


    public void push(int element) {
        elementy.add(element);
    }
    public int pop() {
        if(!elementy.isEmpty()){
            return elementy.removeLast();
        }
        else{
            throw new EmptyStackException();
        }
    }

    public int top(){
        if(!elementy.isEmpty()){
            return elementy.get(elementy.size()-1);
        }
        else{
            throw new EmptyStackException();
        }
    }
    public boolean isEmpty(){
        return elementy.isEmpty();
    }
}
