import java.util.*;
class NodeBst{
    int data;
    NodeBst left;
    NodeBst right;
    NodeBst(int num)
    {
        data=num;
        left=null;
        right=null;
    }
}
class BST {
    NodeBst insert(NodeBst root, int num)
    {
        if(root==null)
        {
            root=new NodeBst(num);
        }
        else if(num<root.data)
        {
            root.left=insert(root.left,num);
        }
        else{
            root.right=insert(root.right,num);
        }
        return root;
    }
    int findmin(NodeBst root)
    {
        if(root==null)
        return-1;
        while(root.left!=null)
        {
         root=root.left;
            
        }
        return root.data;
    }
    int findmax(NodeBst root)
    {
        if(root==null)
        return-1;
        while(root.right!=null)
        {
            root=root.right;
        }
        return root.data;
    }
    void preorder(NodeBst root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(NodeBst root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    void inorder(NodeBst root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
public class MaxMin {
    public static void main(String args[])
    {
        NodeBst root=null;
        BST tree=new BST();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1.Insert\n.Inorder"+ "\n3.preorder\n4.postorder\n5.Findmin\n6.Findmax\n0.Exit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.print("Enter a number " + "into BST:");
                int num=sc.nextInt();
                root=tree.insert(root,num);
            }
                else if(choice==2)
                {
                    tree.inorder(root);
                }
                else if(choice==3)
                {
                    tree.preorder(root);
                }
                else if(choice==4)
                {
                    tree.postorder(root);
                }
                else if(choice==5)
                {
                    tree.findmin(root);
                }
                else if(choice==6)
                {
                    tree.findmax(root);
                }
                else if(choice==7)
                {
                    break;
                }
                else{
                    System.out.println("Enter a valid Choice");
                }
            }
        }
    }