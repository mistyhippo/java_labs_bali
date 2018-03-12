package part_04;


import java.util.ArrayList;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */


class Q{

    ArrayList <Integer> yahoo = new ArrayList<>();



    public void enqueue( int x){

        yahoo.add(x);


    }

    public int dequeue (){

       int temp = 0;

        temp = yahoo.get(0);

            yahoo.remove(0);

            return temp;

    }



}


class qtester {

    public static void main(String[] args) {

        //create object of queue
        Q queueName = new Q();

       // queueName.enqueue(12);
      //  queueName.enqueue(14);

       // queueName.dequeue();

       // System.out.println(queueName.dequeue());



        for (int i = 0; i < 101; i++ ){

            queueName.enqueue(i);

        }

        for (int j = 0; j < 50; j++){


            System.out.println(queueName.dequeue());
            queueName.dequeue();

        }





    }


}