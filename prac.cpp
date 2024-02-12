#include<bits/stdc++.h>
using namespace std;
int diameter(vector<int> adj[], int cur_node, int parent, int &ans)
{
    if(adj[cur_node].size()==1)
    return 1;
    
    int h1=0;
    int h2=INT_MIN;
    for(auto it: adj[cur_node])
    {
        if(parent!=it)
        {
            int k= diameter(adj,it,cur_node,ans);
            if(h1<=k)
            {
                h2=h1;
                h1=k;
            }
            else if(h2 <= k)
            {
                h2=k;
            }
        }
    }
    ans =max(ans,1+h1+h2);
    return 1+max(h1,h2);
}
int main()
{
    int n;
    cin>>n;
    vector<int> adj[n+1];
    vector<vector<int>> arr;
    for(int i=1; i<n; i++)
    {
        int k1,k2;
        cin>>k1>>k2;
        adj[k1].push_back(k2);
        adj[k2].push_back(k1);
    }
    adj[1].push_back(0);
    int ans=0;
    diameter(adj,1,0,ans);
    if(n==1)
    cout<<ans;
    else
    cout<<ans-1;
    return 0;
}