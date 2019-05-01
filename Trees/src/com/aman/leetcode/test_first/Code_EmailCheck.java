package com.aman.leetcode.test_first;

import java.util.HashSet;
import java.util.Set;

public class Code_EmailCheck {

	public int numUniqueEmails(String[] arr) {

		int result = 0;
		
		if(arr==null || arr.length == 0) {
			return result;
		}
		
		Set<String> set = new HashSet<>();
		
		for (int i=0 ; i<arr.length ; i++ ) {
			
			
			String str = arr[i];
			
			StringBuilder sb = new StringBuilder();
			
			boolean isDomainEncountered = false;
			boolean isPlusEncountered = false;
			
			for(int x=0 ; x<str.length() ; x++) {
				
				if(str.charAt(x) == '@') {
					isDomainEncountered = true;
					sb.append(str.charAt(x));
					continue;
				}
				
				if(str.charAt(x) == '+' && isDomainEncountered == false) {
					isPlusEncountered = true;
					continue;
				}
				
				if(isDomainEncountered == false && isPlusEncountered == true) {
					continue;
				}
				
				if(str.charAt(x) == '.' && isDomainEncountered == false) {
					continue;
				}
				
				sb.append(str.charAt(x));
				
				
			}
			set.add(sb.toString());
			System.out.println(sb);
			
			
		}
		
		return set.size();
		
	}

	public static void main(String args[]) {

		int result = new Code_EmailCheck().numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" });
		
		System.out.println(result);
	}
}
