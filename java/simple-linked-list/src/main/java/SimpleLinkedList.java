class SimpleLinkedList<T> {
    T data;
    SimpleLinkedList<T> next;
    SimpleLinkedList<T> head = null;
    SimpleLinkedList<T> tail = null;
    private int size;

    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        for(int i=0;i<values.length;i++)
        {
            this.push(values[i]);
        }
    }

    void push(T value) {
    if(head==null)
    {
        head.data=value;
        size++;

    }else{
        tail=head;
        tail=tail.next;
        tail.data=value;
        size++;
    }

    }

    T pop() {

    }

    void reverse() {

    }

    T[] asArray(Class<T> clazz) {

    }

    int size() {
        return this.size;
    }
}
