import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

static void printLinkedList(SinglyLinkedListNode head) {

          while(head != null) {
              System.out.println(head.data);
              head = head.next;
          }
  }
