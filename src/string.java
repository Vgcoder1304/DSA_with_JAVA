public class string{
public static void main(String[] args){
    String a="13621";
    StringBuilder s=new StringBuilder(a);
    String s1=s.reverse().toString();
    if(a.equals(s1)){
        System.out.println(true);
    }
        
    
    
    
    
    // String s="aabaa";
    // boolean p=true;
    // int left=0,right=s.length()-1;
    // while(left<right){
    //     if(s.charAt(left)!=s.charAt(right)){
    //         p=false;
    //         break;
    //     }
    //     left++;
    //     right--;
    // }
    // System.out.println(p);
 


    // String s="Hello";
    // // s can also be directly passed to  string builder 
    // StringBuilder sb=new StringBuilder("happy");
    // sb.append("world");
    // sb.insert(5," ");
    // System.out.println(sb);
    // sb.delete(6,7);
    // System.out.println(sb);
    
    
    
    // String t="heeh";
    // StringBuilder sb1=new StringBuilder(t);
    // sb1.reverse();
    // if(t.equals(sb1.toString())){
    //     System.out.println("equal");
    // }
    // else{
    //      System.out.println("not equal");

    //  }  
}
}