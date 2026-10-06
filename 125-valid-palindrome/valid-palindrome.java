class Solution {
    public boolean isPalindrome(String s)
    {
        s=s.toLowerCase();
        String str="";
        String str2="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if((ch>='0'&&ch<='9')||(ch>='a' && ch<='z'))
            {
                str=str+ch;
            }
        }
        for(int j=str.length();j>0;j--)
        {
            char ch2=str.charAt(j-1);
            str2=str2+ch2;
        }   
        if(str2.equals(str))
        return true;

        return false;
    }
}