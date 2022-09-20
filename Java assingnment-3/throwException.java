class throwException extends Exception
{
    public throwException(String s)
    {
        super(s);
    }

    public static void main(String[] args) throws Exception {
        try{
            throw new throwException("Harshit is not a good kid");
        }
        catch(throwException e)
        {
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }
    }
}