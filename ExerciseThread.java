/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.time_programming;

/**
 *
 * @author Sally Leong
 */
public class ExerciseThread extends Thread{
    
    public static void main(String[] args){
        ExerciseThread T1 = new ExerciseThread();
        T1.start();
    }
    
    @Override
    public void run(){
        try{
            
        for(int x = 0; x <= 100; x++){
            System.out.println(x);
            sleep(500);  
            int y = 0 ;
            if (x%50 == y && x!=0){
                System.out.println("hi");
            }
        }

        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
