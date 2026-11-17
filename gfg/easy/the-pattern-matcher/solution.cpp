class Solution {
  public:
    bool findPattern(string& s) {
        // code here
        int temp=0;

                for(int i=0;i<s.length();i++)
                {
                    if(s[i]=='x')
                    {
                        temp++;
                    }
                    else if(s[i]=='y')
                    {
                        temp--;
                    }

                    if(temp==-1)
                    {
                        return 0;
                    }
                }

                return temp==0;
    }
};