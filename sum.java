import java.io.*;
public class sum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //Scanner ob=new Scanner(System.in);
        int a,b,d,e,f,c;
        System.out.println("Enter the value of : 'a' and 'b'");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        //int a=ob.nextInt();
        //int b=ob.nextInt();
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        System.out.println("Output here for addition :"+c);
        System.out.println("Output here for subctrion :"+d);
        System.out.println("Output here for multipetion :"+e);
        System.out.println("Output here for diviion :"+f);
    }
}