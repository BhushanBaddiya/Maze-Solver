/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.orange;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Bhushan
 */
public class Maze_Solver extends JFrame{
   private int [][] maze = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,0,1,0,1,0,1,0,0,0,0,0,1},
                            {1,0,1,0,0,0,1,0,1,1,1,0,1},
                            {1,0,1,1,1,1,1,0,0,0,0,0,1},
                            {1,0,0,1,0,0,0,0,1,1,1,0,1},
                            {1,0,1,0,1,1,1,0,1,0,0,0,1},
                            {1,0,1,0,1,0,0,0,1,1,1,0,1},
                            {1,0,1,0,1,1,1,0,1,0,1,0,1},
                            {1,0,0,0,0,0,0,0,0,0,1,9,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1}
                           };
   private List<Integer>path = new ArrayList<>();
       public Maze_Solver(){
         setTitle("MAZE SOLVER");
         setSize(640,720);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         DepthFirstSearch.SearchPath(maze, 1, 1, path);
         System.out.println(path);
      }
        
    @Override
       public void paint(Graphics g){
           g.translate(100,100);
           for(int i = 0; i < maze.length; i++){
               for(int j = 0;j < maze[0].length; j++){
                    Color color;
                    switch(maze[i][j]){
                    case 1:color = Color.black;break;
                    case 9:color = Color.red;break;
                    default:color = Color.white;break;
                   }
                    g.setColor(color);
                    g.fillRect(30*j, 30*i, 30, 30);
                    g.setColor(orange);
                    g.drawRect(30*j, 30*i, 30,30 );
                }
            }
           for(int i = 0; i < path.size(); i+=2){
               int pathx = path.get(i);
               int pathy = path.get(i+1);
               System.out.println("Xcoordinate"+ pathx);
                System.out.println("ycoordinate"+ pathy);
                g.setColor(green);
                g.fillRect(30*pathx, 30*pathy, 20, 20);
           }
        }

    public static void main(String[] args) {
        Maze_Solver view = new Maze_Solver();
        view.setVisible(true);
    }

    private void SetDefaultOrCloseOperation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Switch(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
