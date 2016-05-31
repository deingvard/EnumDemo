/**
 * Created by igor on 31.05.16.
 */

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

 class EnumDemo {
     public static void main(String[] args) {
         Apple ap;
         ap = Apple.Cortland;
         System.out.println("ap = "+ap);
         System.out.println();

         ap = Apple.Winesap;
         if (ap == Apple.Winesap)
             System.out.println("Variable contains Winesap. \n");
         switch (ap){
             case Jonathan:
                 System.out.println("Jonathan red.");
                 break;
             case GoldenDel:
                 System.out.println("GoldenDel yellow.");
                 break;
             case RedDel:
                 System.out.println("RedDel red.");
                 break;
             case Winesap:
                 System.out.println("Winesap red.");
                 break;
             case Cortland:
                 System.out.println("Cortland red.");
                 break;
         }
     }
}
