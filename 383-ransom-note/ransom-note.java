class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int arr[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch2=ransomNote.charAt(i);
            arr2[ch2-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr2[i]==0)
            continue;
            if(arr[i]<arr2[i])
            return false;
        }
        return true;
    }
}