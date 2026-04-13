package lec_22;

    // MyLinkedList.java
    public class MyLinkedList<T> {
        private Node<T> head; // first node
        private int size;     // number of elements

        public MyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        // 1. Add at end: O(n)
        public void add(T value) {
            Node<T> newNode = new Node<>(value);

            // if list is empty, new node becomes head
            if (head == null) {
                head = newNode;
            } else {
                // otherwise go to last node and attach
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        // 2. Add at beginning: O(1)
        public void addFirst(T value) {
            Node<T> newNode = new Node<>(value);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // 3. Add at specific index: O(n)
        // index from 0 to size allowed (0 = first, size = end)
        public void addAt(int index, T value) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }

            if (index == 0) {
                addFirst(value);
                return;
            }

            Node<T> newNode = new Node<>(value);
            Node<T> current = head;

            // move to node just before the index
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
            size++;
        }

        // 4. Remove first element: O(1)
        public T removeFirst() {
            if (head == null) {
                throw new IllegalStateException("List is empty");
            }
            T removedData = head.data;
            head = head.next;
            size--;
            return removedData;
        }

        // 5. Remove last element: O(n)
        public T removeLast() {
            if (head == null) {
                throw new IllegalStateException("List is empty");
            }

            if (head.next == null) {
                // only one element
                T removedData = head.data;
                head = null;
                size--;
                return removedData;
            }

            Node<T> current = head;
            // stop at second last node
            while (current.next.next != null) {
                current = current.next;
            }

            T removedData = current.next.data;
            current.next = null;
            size--;
            return removedData;
        }

        // 6. Remove at index: O(n)
        public T removeAt(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }

            if (index == 0) {
                return removeFirst();
            }

            Node<T> current = head;
            // move to node just before the index
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            T removedData = current.next.data;
            current.next = current.next.next;
            size--;
            return removedData;
        }

        // 7. Get element by index: O(n)
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }

            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.data;
        }

        // 8. Set/Update element at index: O(n)
        public void set(int index, T value) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }

            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.data = value;
        }

        // 9. Search for a value: returns index or -1
        public int indexOf(T value) {
            Node<T> current = head;
            int index = 0;

            while (current != null) {
                if ((value == null && current.data == null) ||
                        (value != null && value.equals(current.data))) {
                    return index;
                }
                current = current.next;
                index++;
            }

            return -1; // not found
        }

        // 10. Size of the list: O(1)
        public int size() {
            return size;
        }

        // 11. Is list empty?
        public boolean isEmpty() {
            return size == 0;
        }

        // 12. Clear the list
        public void clear() {
            head = null;
            size = 0;
        }

        // 13. Print all elements: for debugging
        public void printList() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
