package MyCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MyLinkedList<E> {

    private int size;
    // Голова списка
    private MyNode<E> first;
    // Хвост списка
    private MyNode<E> last;

    // Узел списка
    private static class MyNode<E> {
        E item;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode (MyNode<E> prev, E element, MyNode<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {

    }

    public MyLinkedList (Collection<? extends E> l) {
        this();
        addAll(l);
    }

    public E set(int index, E element) {
        checkElementIndex(index);
        MyNode<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    // Возвращает текст ошибки
    private String outOfBoundsMsg (int index) {
        return "Index: "+index+", Size: "+size;
    }

    // Проверить корректность индекса
    private void checkElementIndex (int index) {
        if (!(index >= 0 && index < size))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    // Проверить позицию индекса
    private void checkPositionIndex (int index) {
        if (!(index >= 0 && index <= size))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    // Размер списка
    public int size() {
        return size;
    }

    // Вернуть элемент по индексу
    private MyNode<E> node (int index) {
        // Если индекс в первой половине, то ищем элемент с начала списка
        if (index < (size >> 1)) { // Побитовый сдвиг вправо равен делению на 2 в степени 1
            MyNode<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        }
        // иначе ищем элемент с конца списка
        else {
            MyNode<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    // Приивязать элемент в конец
    private void linkLast (E e) {
        final MyNode<E> l = last;
        final MyNode<E> newNode = new MyNode<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    // Отвязать элемент
    private E unlink (MyNode<E> x) {
        final E element = x.item;
        final MyNode<E> next = x.next;
        final MyNode<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
    
    // Добавить элемент в конец списка
    public boolean add (E e) {
        linkLast(e);
        return true;
    }

    // Получить элемент списка по индексу
    public E get (int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    // Удалить первое вхождение элемента из списка
    public boolean remove (Object o) {
        if (o == null) {
            for (MyNode<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (MyNode<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    // Добавить все элементы из коллекции в список
    public boolean addAll (Collection<? extends E> c) {
        return addAll(size, c);
    }

    public boolean addAll (int index, Collection<? extends E> c) {
        checkPositionIndex(index);

        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0) {
            return false;
        }

        MyNode<E> pred, succ;
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }

        for (Object o : a) {
            @SuppressWarnings("unchecked") E e = (E) o;
            MyNode<E> newNode = new MyNode<>(pred, e, null);
            if (pred == null) {
                first = newNode;
            } else {
                pred.next = newNode;
            }
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }

        size += numNew;
        return true;
    }

    // Поменять местами элементы
    private void toSwap (MyLinkedList<E> list, int i, int j) {

        final MyLinkedList<E> l = list;
        l.set(i, l.set(j, l.get(i)));
    }

    // Сортировка пузырьком с флагом
    public void bubbleSort () {

        boolean isSorted;

        for (int i = 0; i < size - 1; i++) {
            isSorted = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<E>) get(j)).compareTo(get(j + 1)) > 0) {
                    toSwap(this, j, j + 1);
                    isSorted = true;
                }
            }
            if(!isSorted) break;
        }
    }

// Вывод списка
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
