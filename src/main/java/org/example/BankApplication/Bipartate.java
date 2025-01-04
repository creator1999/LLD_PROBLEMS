package org.example.BankApplication;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Bipartate {
    public static void bfs(int[][] grpah){

    }
    public static void main(String[] args){
        int[][] graph={{1,3},{0,2},{1,3},{0,2}};
        int[] visited=new int[graph.length];
        Queue<Integer> q=new ArrayDeque<>();
        q.add(0);
        int intial=0;

        Arrays.fill(visited,0);
        visited[0]=1;
        while(!q.isEmpty()){
            int var1=q.size();
            for(int i=0;i<var1;i++){
                int temp=q.poll();
                for(Integer j:graph[temp] ){
                    if(visited[j]==0) {


                        visited[j] = visited[temp] * -1;
                        q.add(j);
                    }
                    else if(visited[j]==visited[temp]){
                        System.out.println("not bipartate");
                    }
                }
            }
        }
        System.out.println(Arrays.toString(visited));



    }
}
