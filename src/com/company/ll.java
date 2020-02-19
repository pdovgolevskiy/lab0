package com.company;

public class ll<T>
{
    private node<T> first;
    private node<T> last;
    ll() {first = null;}
    public void insert(T value)
    {
        var newNode = createNewNode(value);
        if (first == null)
        {
            first = newNode;
            //last = first;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
    }

    public void eraseNode(int index)
    {
        nodeAt(index - 1).next = nodeAt(index + 1);
    }

    void printList()
    {
        var currentNode = this.first;
        while (currentNode != null)
        {
            System.out.print(currentNode.data);
            System.out.print("\n");
            currentNode = currentNode.next;
        }
    }

    public void insert(T value, int position)
    {

    }

    public node<T> nodeAt(int index)
    {
        node<T> currentNode = this.first;
        int currentIndex = 0;
        for (int i = 0; i < index; ++i)
            currentNode  = currentNode.next;
        return currentNode;
    }

    private node<T> createNewNode(T val) { return new node<T>(val);}
        class node<T> {
            T data;
            private node<T> next;
            node(T d)
            {
                data = d;
            }
            public void setNext(node<T> next) {
                this.next = next;
            }

            public node<T> getNext()
            {
                return next;
            }
        }
}
