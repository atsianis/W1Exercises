package w1exercises;

import java.util.Arrays;

// We create out own implementation of a stack using an internal-hidden array of initial size 10,
// that expands its length if needed
// variable top is always equal to the size of the array-stack and 1 greater than the index of the element at the top of it
// pop() returns the element at the top of the stack. In case of empty stack it returns null
// push() insert the element at the top of the stack, but first it checks if there is available space
// if not, then the expand() method is called which essentially replaces the hidden array with another one double its size



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
