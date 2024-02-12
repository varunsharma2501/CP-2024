// package _DAY9;

// dequeu vala code

import java.util.ArrayDeque;
import java.util.Deque;

public class _2prob {
    public static void deq(int arr[],int k){
        Deque<Integer> q=new ArrayDeque<>();
        int n=arr.length;

        // process first window of size k (0-k-1)
        for(int i=0;i<k-1;i++){
            while(!q.isEmpty() && arr[i]>=arr[q.back()]){
                q.pop_back();
            }
            q.push(i);
        }

        // now slide window
        for(int i=k;i<n;i++){
            System.out.println(front_queue);
            // print front of queue
            if(q.front<=i-k){
                // means it is no longer part of current window
                q.pop_front();
            }

            while(!q.isEMpty( && arr[i]>=arr[q.back()])){
                q.pop_back();
            }
            q.push(i);
        }
        // so we are printing maximum of precious window always so for last window we will print it once we are outside the loop
        System.out.println(front of queue);

    }
    public static void main(String[] args) {
        
    }
}

/*output = []
l = r = 0
q = deque()

while r < len(nums):
while q and nums[q[-1]] < nums[r]:
q.pop()
q.append(r)

if l > q[0]:
q.popleft()

if (r + 1) >= k:
output.append(nums[q[0]])
l +=1
r += 1
return output */


/*int n = nums.length;
if(n == 0 || k == 0) return new int[0];
Deque<Integer> window = new ArrayDeque<>();
int ans[] = new int[n - k + 1];
int ind = 0;
for(int i = 0; i < n; i++){
while(window.size() > 0 && window.peekFirst() <= i - k) window.pollFirst();
while(window.size() > 0 && nums[window.peekLast()] < nums[i]) window.pollLast();
window.offerLast(i);
if(i >= k - 1){
ans[ind++] = nums[window.peekFirst()];
}
}
return ans; */