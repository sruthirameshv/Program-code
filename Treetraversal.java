//Preorder  
public void preorder(BinaryTreeNode root)
{
  if(root!=null)
  {
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }
}
//Iterative version
public ArrayList<Integer> Preorder(BinaryTreeNode root)
{
  ArrayList<Integer> res=new ArrayList<Integer>();
  if(root==null)
  {
    return res;
  }
  else
  {
    Stack <BinaryTreeNode> s=new Stack<BinaryTreeNode>();
    s.push(root);
    while(!s.isempty())
    {
      BinaryTreeNode temp=s.pop();
      res.add(temp.right);
      if(tmp.right!=null)
        s.push(tmp.right)
      
      if(tmp.left!=null)
        s.push(tmp.left)
    }
    retun res;
  }
    
      
