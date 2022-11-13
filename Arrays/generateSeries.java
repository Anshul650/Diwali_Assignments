/* Write a program which generates the series 1,4,27,16,125,36 */

class generateSeries {
 
public static int logicOfSequence(int N)
{
    if (N % 2 == 0)
        N = N * N;
    else
        N = N * N * N;
    return N;
}
 

public static void main(String args[])
{
        
    int N = 6;
    System.out.println(logicOfSequence(N));
}
}