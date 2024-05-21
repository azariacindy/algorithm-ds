package pract2;

public class book06 {
    String title, authorName;
    int publishedYear, pageAmount, price;
    int size, top;
    book06 data[];

    public book06(String tt, String nm, int yr, int pg, int pr) {
        this.title = tt;
        this.authorName = nm;
        this.publishedYear = yr;
        this.pageAmount = pg;
        this.price = pr;
    }

    public book06(int size) {
        this.size = size;
        data = new book06[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(book06 dt) {
        if(!IsFull()) {
            top++;
            data[top] = dt;
        }else{
            System.out.println("Stack is Full");
        }
    }

    public void pop() {
        if(!IsEmpty()) {
            book06 x = data[top];
            top--;
            System.out.println("Remove data : " + x.title + " " +
            x.authorName + " " + x.publishedYear + " " +
            x.pageAmount + " " + x.price);
        } else {
        System.out.println("Stack is Empty");
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Top element : " + data[top].title); 
        } else {
            System.out.println("Stack is Empty");
        }
    }    

    public void print() {
        System.out.println("Stack content : ");
        for (int i = top; i >- 0; i--) {
            System.out.println(data[i].title + " " + 
            data[i].authorName + " " + data[i].publishedYear + "" +
            data[i].pageAmount + " " + data[i].price);
        }
        System.out.println("");
    }

    public void clear() {
        if(IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now empty!");
        } else {
            System.out.println("Failed! Stack is not empty.");
        }
    }
}
