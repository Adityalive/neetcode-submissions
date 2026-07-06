class Solution {
     private boolean isOperator(String token){
        return token.length() == 1 &&
               (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    
    }
    public int evalRPN(String[] tokens) {
       Stack<Integer> st =new Stack<>();
       int sum=0;
       //["2","1","+","3","*"]
       //2 ,1 ,
       //sum =1+2=3,sum=3+3
       for(String token:tokens){
          if(!st.isEmpty() && isOperator(token)){
            int a=st.pop();
            int b=st.pop();
            int res;
            switch(token){
            case "+":res =a+b;
            break;
            case "/":res =b/a;
            break;
            case "*":res =a*b;
            break;
            case "-":res =b-a;
            break;
            default: throw new IllegalArgumentException("Unknown operator");
          }
          st.push(res);
          }
          else{
            st.push(Integer.parseInt(token));
          }
       }
          return st.pop();
}
}
