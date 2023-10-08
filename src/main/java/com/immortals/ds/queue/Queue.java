package com.immortals.ds.queue;

public class Queue {


    private final Long size;

    private final Long[] queue1;

    private Long front;

    private Long rear;

    public Queue(Long size) {
        front = (long) -1;
        rear = (long) -1;
        this.size = size;
        queue1 = new Long[Math.toIntExact(size)];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3L);
        System.out.println(queue.isEmpty());
        queue.enqueue(1L);
        queue.enqueue(2L);
        queue.display();
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        queue.display();
        queue.enqueue(3L);
        queue.display();
        System.out.println(queue.isFull());
        queue.enqueue(5L);
        System.out.println(queue.isEmpty());
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        queue.display();
        queue.dequeue();
        queue.display();
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(Long data) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else {
            if (front == -1) {
                front = 0L;
            }
            rear++;
            queue1[Math.toIntExact(rear)] = data;
            System.out.println("Insert " + data);
        }
    }

    public Long dequeue() {
        Long element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1L);
        } else {
            element = queue1[Math.toIntExact(front)];
            if (front >= rear) {
                front = -1L;
                rear = -1L;
            } else {
                front++;
            }
            System.out.println(element + " Deleted");
            return (element);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index -> " + front);
            System.out.print("Items -> ");
            for (Long i = front; i <= rear; i++)
                System.out.print(queue1[Math.toIntExact(i)] + "  ");
            System.out.println("\nRear index-> " + rear);
        }
    }
}
