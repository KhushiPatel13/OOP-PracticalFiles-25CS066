abstract class MediaDemo
{
    abstract public int lateFee();
}
class Book extends MediaDemo
{
    String title;
    int days;
    Book(String title,int days)
    {
        this.title = title;
        this.days= days;
    }
    public int lateFee()
    {
        if(days<=5)
        {
           System.out.println("no extra charges!!");
           return 0;
        }
        else
        {
            days=days-5;
            return days*10;
        }
    }
}
class Cd extends MediaDemo
{
    String title;
    int days;
    int grace;
    Cd(String title,int days,int grace)
    {
        this.grace = grace;
        this.title = title;
        this.days= days;
    }
    public int lateFee()
    {
        if(days<=grace)
        {
           System.out.println("no extra charges!!");
           return 0;
        }
        else
        {
            days=days-grace;
            return days*30;
        }
    }
}

public class Media
{

    public static void main(String[] a)
    {

    }
    
}
