package sts; // Need to put in sts folder following package sts

/*
 * Why the following loop will fail?
 */
class Test   
{  
    public static void main (String args[])   
    {  
    	int end = 5;
        // for(int i=0; limit; i++) limit is not defined and there is no limit condition
        for(int i=0; i<end; i++)   
        {  
            System.out.println("Hello World");  
        }  
    }  
}  