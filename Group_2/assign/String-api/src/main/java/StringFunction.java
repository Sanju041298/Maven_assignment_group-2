public class StringFunction {

    public String reverseString(String s)
    {
        StringBuffer t=new StringBuffer(s);
        t=t.reverse();
        return t.toString();

    }

    public  int length(String s)
    {
        int a=s.length();
        return a;
    }

}