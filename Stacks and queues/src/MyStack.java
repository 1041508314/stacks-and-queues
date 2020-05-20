

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/20
 * @Content:
 */
public class MyStack<T> {
    public T[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标
    public MyStack(){
        this.elem = (T[]) new Object[10];
    }

    public void push(T val){//入栈
        //1.判断是否是满的
        //2.往里面存放数据
        if(full()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top++] = val;
    }




    public boolean empty(){
        return this.top == 0;
    }



    public boolean full(){
        return this.top == this.elem.length;
    }




    public T pop(){//出栈 --> 删除
        if(empty()){
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        this.top--;
        return data;
    }




    public T  peek(){//栈顶元素
        if(empty()){
            throw new RuntimeException("栈空");
        }
        return this.elem[this.top-1];
    }




    public int size(){
        return this.top;
    }
}
