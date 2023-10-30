package com.example.algorithm_test.dataStructure;

import java.util.ArrayList;

public class Stack<T> {
    // stack
    private ArrayList<T> stack = new ArrayList<>();

    // push
    public void push(T item) {
        stack.add(item);
    }

    // pop
    public T pop() {
        if(stack.isEmpty()) {
            return null; // * 스택이 비었으면 null 리턴
        } else {
            return stack.remove(stack.size() -1); // * 인덱스는 0부터 시작이니깐 -1
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push(1);
        objectStack.push(2);
        System.out.println("첫번째 꺼내기 = " + objectStack.pop()); // * 어떤 결과가 나올까?

        objectStack.push(3);
        System.out.println("두번째 꺼내기 = " + objectStack.pop());
        System.out.println("세번째 꺼내기 = " + objectStack.pop());
        System.out.println("objectStack.isEmpty() = " + objectStack.isEmpty());
    }
}

/*마지막에 들어간 게 제일 위에 있고
처음 들어간 게 제일 끝에 있다.*/
