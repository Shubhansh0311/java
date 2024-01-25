package STACK;

import java.util.ArrayList;

class StackUsingArrayList {

  static class Stacks {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
      return list.size() == 0;
    }

    public void push(int data) {
      list.add(data);
    }

    public int pop() {
        if(list.size()==0){
            return -1;
        }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    public int peek() {
        if(list.size()==0){
            return -1;
        }
      int top = list.get(list.size() - 1);
      return top;
    }
  }

  public static void main(String[] args) {
    Stacks s = new Stacks();
    s.push(1);
    s.push(1);
    s.push(1);
    // s.pop();

    while (!(s.isEmpty())) {
      System.out.println(s.isEmpty());
      System.out.println(s.pop());
    }
  }
}
