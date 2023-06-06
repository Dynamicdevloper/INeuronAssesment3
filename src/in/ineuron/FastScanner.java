package in.ineuron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastScanner {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String next()
    {
            while(st==null || !st.hasMoreTokens())
            {
            try{
                    
                st=new StringTokenizer(br.readLine());
            }
        catch(IOException e){}
            }
        return st.nextToken();
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String s="";
        try{
            s=br.readLine();
        }
        catch(IOException e){}
        return s;
    }
}
