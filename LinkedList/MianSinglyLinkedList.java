package LinkedList;

import LinkedList.Node;
import LinkedList.SinglyLinkedList;

public class MianSinglyLinkedList {
   public static void main(String[] args) {
      MianSinglyLinkedList sl = new MianSinglyLinkedList();
      sl.createSinglyLinkedList(5);
      sl.insertInLinkedList(6, 1);
      sl.insertInLinkedList(7, 3);
      sl.insertInLinkedList(8, 4);
      sl.insertInLinkedList(9, 0);
      sl.traverseSinglyLinkedList();
      sl.deleteSL();
      sl.traverseSinglyLinkedList();
   }
}
