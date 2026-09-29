class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if (s.length()!=t.length())
        return false;
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char ch1=s.charAt(i);
                for(int j=0;j<t.length();j++)
                {
                    char ch2=t.charAt(j);
                    if(ch1==ch2)
                    {
                            t=t.substring(0,t.indexOf(ch2))+ t.substring(t.indexOf(ch2)+1);
                        break;
                        
                    }
                }

            }
            if(t.isEmpty())
            return true;
        }
        return false;
    }
}