// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         //System.out.println("Hello World!");
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         //System.out.println(n);
//         List<List<Integer>> adjList = new ArrayList<>();
//         for (int i = 0; i <= n; i++) {
//             adjList.add(new ArrayList<>());
//         }
//         /*
//         for (List<Integer> nodes : adjList) {
//             System.out.println(nodes.toString());
//         }
//         */
//         adjList.get(1).add(-1);
//         for (int i = 1; i < n; i++) {
//             int a = scn.nextInt();
//             int b = scn.nextInt();
//             //System.out.println(a + " " + b);
//             adjList.get(a).add(b);
//             adjList.get(b).add(a);
//         }
//         /*
//         int par = 0;
//         for (List<Integer> nodes : adjList) {
//             System.out.println("Parent: " + par++ + "," + " Children: " + nodes.toString());
//         }
//         dfs(adjList, 1, -1);
//         */
        
//         int max[] ={0};
//         findDiameter(adjList, 1, -1, max);
//         System.out.println(max[0]);
//     }
//     /*
//     private static void dfs(List<List<Integer>> adjList, int curr, int parent) {
//         System.out.println(curr);
//         if (adjList.get(curr).size() == 1) return;
//         for (int node : adjList.get(curr)) {
//             if (node != parent) {
//                 dfs(adjList, node, curr);
//             }
//         }
//     }
//     */
//     private static int findDiameter(List<List<Integer>> adjList, int node, int parent, int max[]){
//         List<Integer> dists = new ArrayList<>();
//         for(int child : adjList.get(node)){
//             if(child != parent){
//                 dists.add(findDiameter(adjList, child, node, max));
//             }   
//         }
//         dists.sort((a,b) -> b - a);
//         int dia = 0;
//         if (dists.size() > 1) {
//             dia = dists.get(0) + dists.get(1);
//         }

//         max[0] = Math.max(max[0], dia);

//         return dists.isEmpty() ? 1 : dists.get(0) + 1;
//     }