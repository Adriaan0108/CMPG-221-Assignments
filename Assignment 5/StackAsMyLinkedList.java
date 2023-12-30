
/**
 * Write a description of class StackAsMyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackAsMyLinkedList<E>
{
    MyLinkedList<E> stack;
    
    public StackAsMyLinkedList()
    {
        stack = new MyLinkedList<E>();
    }

    public void push(E e)
    {
        stack.prepend(e);
    }
    
    public E pop()
    {
        E temp = null;
        boolean isDone = false;
        
        temp = stack.getFirst();
        
        if (temp != null)
        {
            isDone = stack.delete(temp);
        }
        if (isDone)
        {
            return temp;
        }
        else
        {
            return null;
        }
    }
    
    public String toString()
    {
        return stack.toString();
    }
}
