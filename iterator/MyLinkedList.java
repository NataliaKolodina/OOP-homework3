// package homework.homework3.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList implements Iterable<String> {
  private Node<String> head;

  public MyLinkedList(Node<String> head) {
    this.head = head;
  }

  public void add(String data) {
    Node<String> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      Node<String> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public String remove(int index) {
    if (head == null) {
      throw new IllegalStateException("Ошибка: список пуст!");
    }
    if (index == 0) {
      String data = head.data;
      head = head.next;
      return data;
    }
    Node<String> current = head;
    for (int i = 0; i < index - 1; i++) {
      if (current.next == null) {
        throw new IndexOutOfBoundsException("Ошибка: индекс выходит за рамки списка!");
      }
      current = current.next;
    }
    String data = current.next.data;
    current.next = current.next.next;
    return data;
  }

  public String get(int index) {
    if (head == null) {
      throw new IllegalStateException("Ошибка: список пуст!");
    }
    Node<String> current = head;
    for (int i = 0; i < index; i++) {
      if (current.next == null) {
        throw new IndexOutOfBoundsException("Ошибка: индекс выходит за рамки списка!");
      }
      current = current.next;
    }
    return current.data;
  }

  @Override
  public Iterator<String> iterator() {
    return new LinkedListIterator();
  }

  private static class Node<String> {
    String data;
    Node<String> next;

    Node(String data) {
      this.data = data;
    }
  }

  private class LinkedListIterator implements Iterator<String> {
    private Node<String> current = head;

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      String data = current.data;
      current = current.next;
      return data;
    }
  }
}
