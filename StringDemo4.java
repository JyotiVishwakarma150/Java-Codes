public class StringDemo4 {
    public static void main(String[] args) {
        // String str1= "Deepak";
        // String str2="java";
        // System.out.println(str1+str2);
        // System.out.println(str1.concat(str2));
        //    String str1 = "deepak java";
        //    System.out.println(str1.substring(3));
        //    System.out.println(str1.substring(3, 6));
        //    System.out.println(str1.substring(3,8));
        //    System.out.println(str1.subSequence(3, 5));
      //  String str1 = "Deepak panwar";
        // System.out.println(str1.replace("DeepaK", "amit"));
        // System.out.println(str1.replace("e","x"));
        // System.out.println(str1.indexOf("e"));
        // System.out.println(str1.indexOf("a"));
         String str2 = "deepak is teaching java";
        // System.out.println(str2.indexOf("is"));
        // System.out.println(str2.lastIndexOf("is"));
        // System.out.println(str2.lastIndexOf("java"));
        // System.out.println(str2.contains("ep"));
        // System.out.println(str1.contains("pe"));
       // System.out.println(str2.charAt(7));
    //    System.out.println(str2.startsWith("deea"));
    //    System.out.println(str2.startsWith("dee"));
    //    System.out.println(str2.endsWith("java"));
    // int rollno = 1001;
    // System.out.println(String.valueOf(rollno).length());
    // char[] c= str1.toCharArray();
    // System.out.println(c);
    // System.out.println(str1.replaceFirst("e", "z"));
    // System.out.println(str1.replaceAll("e","z"));
    String[] str= str2.split(" ");
    for(String s:str){
        System.out.println(s);
    }
    }
}
