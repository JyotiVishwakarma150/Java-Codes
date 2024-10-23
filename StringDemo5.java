import java.util.StringTokenizer;

public class StringDemo5 {
    public static void main(String[] args) {
    //     StringBuffer sb= new StringBuffer("Deepak");
    //    // System.out.println(sb.insert(3, "abc"));
    //     sb.append("Java");
    //     System.out.println(sb);//mutable

    //     String name = "Deepak";
    //     name.concat("java");
    //     System.out.println(name);//immutable
    StringTokenizer st= new StringTokenizer("This is my first demo");
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
        //System.out.println(st.nextElement());
    }
    }
}
