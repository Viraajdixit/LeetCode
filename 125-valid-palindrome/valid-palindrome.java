class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        String str2="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(((int)ch>=97 && (int)ch<=122) || ((int)ch>=48 && (int)ch<=57))
            str=str+ch;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            str2=str2+str.charAt(i);
        }
        if(str.equals(str2) || str.isEmpty())
        return true;
    return false;
    }
}