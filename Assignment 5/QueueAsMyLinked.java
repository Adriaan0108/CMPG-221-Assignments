
/**
 * Write a description of class QueueAsMyLinked here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueueAsMyLinked<E>
{
    private MyLinkedList<E> queue;
    
    public QueueAsMyLinked()
    {
        queue = new MyLinkedList<E>();
    }

    public void enqueue(E e)
    {
        queue.append(e);
    }
    
    public E dequeue()
    {
        E temp = null;
        boolean isDone = false;
        
        temp = queue.getFirst();
        
        if (temp != null)
        {
            isDone = queue.delete(temp);            
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
        return queue.toString();
    }
}
