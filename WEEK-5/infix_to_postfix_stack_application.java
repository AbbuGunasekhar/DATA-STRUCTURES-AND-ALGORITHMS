// GFG : https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1

class Solution {
 static int prio(char ch)
    {
        if(ch=='^')
        return 3;
        else if(ch=='*' || ch=='/')
        return 2;
        else
        return 1;
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        String ans="";
    
        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                ans+=ch;
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
//System.out.println("hi");
                    ans+=st.pop();
                    
                }
               // ans+=st.pop();
                //if(!st.isEmpty())
               st.pop();
            }
            else
            {
                while(!st.isEmpty() && st.peek()!='(' && (prio(ch)<prio(st.peek())||(prio(st.peek())==prio(ch) && ch!='^')) )
                {
                   // System.out.println(st);
                    ans+=st.pop();
                }
                st.push(ch);
            }
            
            
        }
        while(!st.isEmpty())
        ans+=st.pop();
        return ans;
    }
} 