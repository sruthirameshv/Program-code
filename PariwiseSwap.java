 void pairWiseSwap()
    {
        Node temp = head;
 
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {
 
            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
         }
    }

/* Recursive function to pairwise swap elements of a linked list */
void pairWiseSwap(struct node *head)
{
  /* There must be at-least two nodes in the list */
  if (head != NULL && head->next != NULL)
  {
      /* Swap the node's data with data of next node */
      swap(&head->data, &head->next->data);
    
      /* Call pairWiseSwap() for rest of the list */
      pairWiseSwap(head->next->next);
  }  
}
