class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == ')') {
                Stack<Character> subStack = new Stack<>();
                while (stack.peek() != '(') {
                     char top = stack.pop();
                    if (top != ',') { 
                        subStack.push(top);
                    }
                }
                stack.pop(); 
                char operator = stack.pop(); 
                boolean result = evaluate(subStack, operator);
                stack.push(result ? 't' : 'f');
            } else {
                stack.push(c);
            }
        }
        return stack.pop() == 't';
    }
    public boolean evaluate(Stack<Character> stack, char operator) {
        if (operator == '!') {
            char operand = stack.pop();
            return operand == 'f';
        } else if (operator == '&') {
            boolean result = true;
            while (!stack.isEmpty()) {
                char operand = stack.pop();
                result = result && (operand == 't');
            }
            return result;
        } else if (operator == '|') {
            boolean result = false;
            while (!stack.isEmpty()) {
                char operand = stack.pop();
                result = result || (operand == 't');
            }
            return result;
        }
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }
}
