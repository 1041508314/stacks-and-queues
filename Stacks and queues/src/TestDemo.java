import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/20
 * @Content:
 */

/**
 *
 * 栈
 * 先进后出
 */
public class TestDemo {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                //1.判断栈是否为空
                if(stack.empty()){
                    System.out.println("右括号多！");
                    return false;
                }
                //2.先拿到栈顶元素的括号
                char ch2 = stack.peek();
                if(ch2 == '(' && ch == ')' || ch2 == '[' && ch == ']' || ch2 == '{' && ch == '}'){
                    stack.pop();
                }else{
                    System.out.println("左右括号不匹配！");
                    return false;
                }
            }
        }
        if(stack.empty()){
            System.out.println("左括号多！");
            return false;
        }
        return true;
    }




    public static void main4(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }



    public static void main3(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());//出队
    }



    public static void main2(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }




    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());//拿到栈顶元素但不删除
//        System.out.println(stack.pop());//出栈并且删除栈顶元素
//        System.out.println(stack.peek());
        System.out.println(stack.empty());//当前栈是不是空的
        System.out.println(stack.search(5));
        System.out.println(stack.size());
    }
}
