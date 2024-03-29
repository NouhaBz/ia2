/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package l.tpia3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Tpia3 {
     HashMap<String,String []> anmlF=new HashMap<String,String []>();
     HashMap<String,Integer> Prs=new HashMap<String,Integer>();
   
    public static void main(String[] args) {
        
        
        System.out.println("\n\n\n#################### WELCOM ########################");
        System.out.println("\n############### Guess the Animal ########################");
          System.out.println("\n we will try to guess the animal that you are thinking of \n shall we start :(Y/N)");
        Scanner sn =new Scanner(System.in);
        String YN =sn.nextLine();
        while(YN.equals("y")){
        
        String questions []={
            "does the animal has fur or hair ? (yes / No)  ",// Then it is a mammal  1
            "does the animal is a has feathers ? (yes / No)",//Then it is bird",  2
            " does the animal lives in water ?(yes / No)",// Then it is a fish",          3
            "does the animal has scales ? (yes / No)",//Then it is a reptile",         4
            "does the animal is has tusks ?(yes / No)",//Then it is a tusker",       5
            "does the animal eats plants ?(yes / No)",//Then it is a herbivore",       6
            "does the animal can live on land ?(yes / No)",// Then it is terrestrial animals",         7
            "does the animal is has gray skin ?(yes / No)",//Then it is an elephant.",         8
           "does the animal can live on land ?(yes / No)",//Then it is terrestrial animals",          9
            "does the animal which eats other animals ?(yes / No)",//Then it is a carnivore.",    10
            "does The animal is a fish and a carnivore ?(yes / No)",//Then it is a shark",       11
            "does The animal is a bird and cannot fly ? (yes / No)",//Then it is Penguins.",       12
            "does The animal has theeth? (yes / No)",//.",       13
          "does the animal has bone ?(yes / No)",//Then no bone.",    1'4
          "does the animal has scales ?(yes / No)",//Then it is a reptil"   ,  
        };
        String animal [] ={"Elephent", "shrik","Penguins","Doulphin"};
         ArrayList<String> facts =new ArrayList<String>();
        
        System.out.println(questions[0]);
         sn =new Scanner(System.in);
        String answer =sn.nextLine();
        if(answer.equals("yes")||answer.equals("YES")){//mammal
            facts.add("mammal");
                             System.out.println(questions[8]);
                             sn =new Scanner(System.in);
                             answer =sn.nextLine(); 
                             if(answer.equals("yes")||answer.equals("YES")){
                                 facts.add("terrestrial");
                                    System.out.println(questions[4]);
                                    sn =new Scanner(System.in);
                                    answer =sn.nextLine();
                                    if(answer.equals("yes")||answer.equals("YES")){
                                        facts.add("tusker");
                                           System.out.println(questions[5]);
                                           sn =new Scanner(System.in);
                                           answer =sn.nextLine();
                                           if(answer.equals("yes")||answer.equals("YES")){
                                               facts.add("herbivore");
                                              System.out.println(questions[7]);
                                              sn =new Scanner(System.in);
                                              answer =sn.nextLine(); 
                                              if(answer.equals("yes")||answer.equals("YES")){
                                                   facts.add("has gray skin");
                                                  System.out.println("the facts that system know about that the animal:");
                                                  for (String i :facts){
                                                      System.out.println("\n- "+i);
                                                  }
                                                   System.out.println("\n====> the animal :"+animal[0]);
                                              }else{
                                                   System.out.println(" the system didnt recongnize the animal");
                                              }
                                           }else{
                                              System.out.println(questions[9]);
                                              sn =new Scanner(System.in);
                                              answer =sn.nextLine();
                                              facts.add("carnivore");
                                               System.out.println(questions[6]);
                                              sn =new Scanner(System.in);
                                              answer =sn.nextLine(); 
                                              facts.add("terrestrial");
                                        System.out.println(" the system didnt recongnize the animal");
                                              
                                           }
                                    }else{
                                         System.out.println(questions[5]);
                                           sn =new Scanner(System.in);
                                           answer =sn.nextLine();
                                           facts.add("herbivore");
                                           System.out.println(questions[6]);
                                              sn =new Scanner(System.in);
                                              answer =sn.nextLine(); 
                                              facts.add("terrestrial");
                                        System.out.println(" the system didnt recongnize the animal");
                                          
                                    }
                             }else{
                                        System.out.println(questions[2]);
                                           sn =new Scanner(System.in);
                                           answer =sn.nextLine();
                                  if(answer.equals("yes")||answer.equals("YES")){
                                       facts.add("fish");
                                           System.out.println(questions[12]);
                                           sn =new Scanner(System.in);
                                           answer =sn.nextLine();
                                              if(answer.equals("yes")||answer.equals("YES")){
                                                   facts.add("has theeth");
                                               System.out.println(questions[7]);
                                           sn =new Scanner(System.in);
                                           answer =sn.nextLine();
                                           if(answer.equals("yes")||answer.equals("YES")){
                                                facts.add(" gray skin");
                                            facts.add("has gray skin");
                                                  System.out.println("the facts that system know about that the animal:");
                                                  for (String i :facts){
                                                      System.out.println("\n- "+i);
                                                  }
                                                   System.out.println("\n====> the animal :"+animal[3]);
                                           }else{
                                               System.out.println(" the system didnt recongnize the animal"); 
                                           }
                                              }else{
                                                   System.out.println(" the system didnt recongnize the animal");
                                              }
                                              
                                           }else{
                                               System.out.println(questions[10]);
                                               sn =new Scanner(System.in);
                                               answer =sn.nextLine();
                                                   System.out.println(" the system didnt recongnize the animal");
                                              
                                           }  
                             }
            
        }else{
             System.out.println(questions[1]);
             sn =new Scanner(System.in);
             answer =sn.nextLine();
            if(answer.equals("yes")||answer.equals("YES")){
                facts.add(" bird");
                                              System.out.println(questions[6]);
                                               sn =new Scanner(System.in);
                                               answer =sn.nextLine(); 
                                               if(answer.equals("yes")||answer.equals("YES")){
                                                   facts.add(" terrestrial");
                                                   System.out.println(questions[2]);
                                                   sn =new Scanner(System.in);
                                                   answer =sn.nextLine();
                                                    if(answer.equals("yes")||answer.equals("YES")){
                                                        facts.add("amphibios");
                                                    System.out.println(questions[9]);
                                                   sn =new Scanner(System.in);
                                                   answer =sn.nextLine();
                                                    if(answer.equals("yes")||answer.equals("YES")){
                                                        facts.add(" carnivore");
                                                    
                                                     System.out.println(questions[11]);
                                                     sn =new Scanner(System.in);
                                                     answer =sn.nextLine();
                                                    if(answer.equals("yes")||answer.equals("YES")){
                                                        facts.add("bird and cannot fly");
                                                    System.out.println("the facts that system know about that the animal:");
                                                  for (String i :facts){
                                                      System.out.println("\n- "+i);
                                                  }
                                                   System.out.println("\n====> the animal :"+animal[2]);
                                                    }
                                                   
                                                     System.out.println(" the system didnt recongnize the animal");                                                
                                                    }else{
                                                      
                                                    System.out.println(" the system didnt recongnize the animal");
                                                  
                                                    }
                                                   
                                                   
                                                    }else{
                                                      
                                                   System.out.println(" the system didnt recongnize the animal");
                                                  
                                                    }
                                               
                                               }else{
                                                   
                                               System.out.println(questions[2]);
                                        sn =new Scanner(System.in);
                                       answer =sn.nextLine();
                                       if(answer.equals("yes")||answer.equals("YES")){
                                            facts.add(" fish");
                                            System.out.println(questions[9]);
                                        sn =new Scanner(System.in);
                                       answer =sn.nextLine();
                                       if(answer.equals("yes")||answer.equals("YES")){
                                            facts.add(" carnivore");
                                       System.out.println(questions[13]);
                                        sn =new Scanner(System.in);
                                       answer =sn.nextLine();
                                       if(answer.equals("yes")||answer.equals("YES")){
                                            facts.add(" has teeth");
                                       System.out.println("the facts that system know about that the animal:");
                                                  for (String i :facts){
                                                      System.out.println("\n- "+i);
                                                  }
                                                   System.out.println("\n ====> the animal :"+animal[1]);
                                       }else{
                                           
                                                   System.out.println(" the system didnt recongnize the animal");
                                                
                                       }
                                       }else{
                                           
                                                     System.out.println(" the system didnt recongnize the animal");
                                                
                                       }
                    
                                           }else{
                                           
                                                    System.out.println(" the system didnt recongnize the animal");
                                                
                                       }    
                
                                 }
                                               
                                               
                                               
            }else{
            
                                                    System.out.println(" the system didnt recongnize the animal");
                                                
            }
        }
        System.out.println("do you want to try again ?(y/n)");
        sn =new Scanner(System.in);
        YN =sn.nextLine();
        }
        
        
    }
 public void addfects (){
     String eleph [] ={"mammal", "terrestrial","tusker","herbivore"};
     anmlF.put("Elephent",eleph);
     
 } 
 
 public void compare(ArrayList<String> facts){
     String eleph [] ={"mammal", "terrestrial","tusker","herbivore","has gray skin"};
     anmlF.put("Elephent",eleph);
     String shrik [] ={"fish", "carnivore","has teeth","herbivore"};
     String Penguins [] ={"bird", "terrestrial","amphibios","carnivore","bird and cannot fly"};
     String Doulphin [] ={"fish", "mammal","has teeth","herbivore","has gray skin"};
     Prs.put("shrik", 0);
     Prs.put("shrik", 0);
     Prs.put("Penguins", 0);
     Prs.put("Doulphin", 0);
      anmlF.put("shrik",shrik);
      anmlF.put("Penguins",Penguins);
      anmlF.put("Doulphin",Doulphin);
      
     
      anmlF.forEach((key,value)->{
          int a =0;
          int p=0;
       for (int i =0 ;i<value.length ;i++){
           for (int k =0;k<facts.size();k++){
               if(value[i].equals(facts.get(k))){
                   a++;
                   p=(a*100)/value.length;
                   Prs.put(key, a++);
                        
               }
           }
       }
      
      });
      
       Prs.forEach((key,value)->{
          if(value==100){
              System.out.print("\n"+key);
          }else{
              System.out.println("the system didnt recongnize the animal");
          }
       
      });
     
    
 }
}


