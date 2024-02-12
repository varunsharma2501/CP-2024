import java.util.*;

public class upload {

    public static void traverse(List<List<Integer>> adj, int node, int parent) {
        System.out.print(node + "->");
        if (adj.get(node).size() == 1) {
            return;
        }


        for (int next : adj.get(node)) {
            if (next != parent) {
                traverse(adj, next, node);
            }
        }
    }

    public static int getdia(List<List<Integer>> adj,int ans[],int curr,int par){
        if(adj.get(curr).size()==1){
            return 1;
        }

        List<Integer> heights=new ArrayList<>();
        for(int node:adj.get(curr)){
            if(node==par){
                continue;
            }
            else{
                heights.add(getdia(adj, ans, node,curr));
            }
        }
        // now find the first and second max element
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : heights) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        int h=1+max;
        if(heights.size()>1){
            int x=h+secondMax;
            ans[0]=Math.max(ans[0],x);
        }
        else{
            ans[0]=Math.max(ans[0],h);
        }

        return h;
    }


    public static void main(String[] args) {
        // scanner file
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println(0);
            return;
        }

        List<List<Integer>> adjList = new ArrayList<>(n+1);
        for (int i = 0; i < n+1; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(0);

        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        // traverse(adjList, 1, 0);
        int ans[]={0};
        getdia(adjList,ans,1,0);
        System.out.println(ans[0]-1);
    }
}
