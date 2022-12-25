package Test;

import java.util.Stack;

public class findDuplicateBraces {
    public static void main(String[] args) {
        String str="(a*(a+b))";
        int ans=braces(str);
        System.out.println(ans);

    }

    static int braces(String A) {
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<A.length()){
            char c=A.charAt(i);
            if (c=='(' || c=='+' || c=='-' || c=='*'|| c=='/'){
                s.push(c);
            }else if(c==')'){
                if(s.peek()=='(')
                    return 1;
                else{
                    while(!s.empty() && s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                }
            }
            ++i;
            System.out.println(s);
        }
        return 0;
    }
}
