
public class TravellingSalesman{

    static int tsp(int dist[][], boolean visited[], int n, int currentPos, int count, int cost, int result){

        // city_1 is the starting and ending point
        // Hamiltonian Cycle
        // start traversing from city_1 to its adjacent cities in DFS
        // we have to track min cost and calculate cost of every traversal
        // finally we will return min cost...

        if(count==n && dist[currentPos][0]>0){
            result=Math.min(result, cost+dist[currentPos][0]);
            return result;
        }

        for(int i=0;i<n;i++){

            if(visited[i]==false && dist[currentPos][i]>0){

                visited[i]=true;
                result=tsp(dist, visited, n, i, count+1, cost+dist[currentPos][i], result);

                // Backtrack
                visited[i]=false;

            }

        }

        return result;

    }

    public static void main(String[] args){

        int n=4;
        int dist[][]={

            {0, 20, 25, 30},
            {20, 0, 45, 35},
            {25, 45, 0, 40},
            {30, 35, 40, 0},

        };

        int cost=0;
        int count=1;
        int result=Integer.MAX_VALUE;
        boolean visited[]=new boolean[n];
        visited[0]=true;

        int ans=tsp(dist, visited, n, 0, count, cost, result);

        System.out.println(ans);
        
    }
    
}
