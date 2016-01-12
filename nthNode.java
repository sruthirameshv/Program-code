//FIND THE NTH NODE IN THE LINKED LIST FROM LAST \
//PSEUDO CODE IS PROVIDED HERE  
public ListNode nthNode(ListNode head,int pos)
{
  ListNode temp=head,nthNode=null;
  
  for(int count=0;count<pos;count++)
  {
    if(temp!=null)
      temp=temp.getNext();
  }
  
  while(temp!=null)
  {
    if(nthNode==null)
      nthNode=head;
    else
      ntNode=nthNode.getNext();
      
    
  }
  if(temp==null)
    return nthNode;
}

//RECURSIVE WAY

public ListNode nthNode(ListNode head,int pos)
{
  if(head!=null)
  {
    nthNode(head.getNext(),pos);
    counter++;
    if(pos==counter)
      return head;
  }
}
  
