/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackllist;
import java.util.*;
import java.util.Scanner;

public class Stackllist {
static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
   
}
 node top=null;
public void push(){
     System.out.println("enter data");
        Scanner sc=new Scanner(System.in);
        int data;
        data=sc.nextInt();
        node newnode=new node(data);
    if(top==null){
       top=newnode;
    }
    else{
        newnode.next=top;
        top=newnode;
    }
}
public void pop(){
    if(top==null){
        System.out.println("empty list");
    }
    else{
        top=top.next;
    }
}
public void peak(){
    if(top==null){
        System.out.println("empty list");
    }
    else{
        System.out.println("peak valu is"+ top.data);
    }
}
void display(){
    node ptr=top;
    while(ptr!=null){
        System.out.println(ptr.data);
        ptr=ptr.next;
    }
}

   
    public static void main(String[] args) {
         Stackllist s=new Stackllist();
        int l;
        Scanner sc=new Scanner(System.in);
        //i=sc.nextInt();
        System.out.println("press 1 for continue");
        l=sc.nextInt();
        while(l==1){
            System.out.println("1. push 2.pop 3.peak 4. display");
            int d=sc.nextInt();
            switch(d){
                case 1->{
                    s.push();
                }
                case 2->{
                    s.pop();
                }
                case 3->{
                    s.peak();
                            
                }
                case 4->{
                    s.display();
                }
            }
            //System.out.println("press 1 to continue");
        }
         
        //while(l==0);
      //  System.out.println("exit from stack");
        
    }
    
}
