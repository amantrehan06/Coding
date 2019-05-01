package com.aman.leetcode.easy.others;

import java.util.Stack;

public class Code20_ValidParentheses {

	public boolean isValid(String str) {

		if (str == null) {
			return false;
		}
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				stack.push(str.charAt(i));
			} else if (stack.isEmpty()) {
				return false;
			} else {
				char character = stack.pop();
				if (character == '(' && str.charAt(i) != ')' || character == '[' && str.charAt(i) != ']'
						|| character == '{' && str.charAt(i) != '}') {

					return false;
				}

			}

		}
		
		if(!stack.isEmpty()) {
			return false;
		}

		return true;
	}

	public static void main(String args[]) {

		boolean result = new Code20_ValidParentheses().isValid("()[]{}");

		System.out.println(result);
	}
}
