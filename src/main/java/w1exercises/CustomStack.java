package w1exercises;

import java.util.Arrays;

// We create out own implementation of a stack using an internal-hidden array
// which expands its length if needed

public class CustomStack<T> {

    private int top = 0;
    private Object[] elements;

    public CustomStack(){
        int initialSize = 10;
        elements = new Object[initialSize];
    }

    public void push(T element){
        if(top == elements.length){
            expand();
        }
        elements[top++] = element;
    }

    public T pop(){
        T t;
        try{
            t = (T) elements[--top];
        }catch(Exception e){
            return null;
        }
        elements[top]=null;
        return t;
    }

    public T peek(){
        if (top>0){
            return (T) elements[top-1];
        }
        return null;
    }

    public int size(){
        return top;
    }

    private void expand() {
        elements = Arrays.copyOf(elements,elements.length * 2);
    }
}
