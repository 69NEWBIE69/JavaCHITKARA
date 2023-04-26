import java.util.Scanner;

class Bankk{
    int ar[]=new int[10];
    int x,ac=0,num,bal=0;
    Scanner sc=new Scanner(System.in);
    StringBuffer sb=new StringBuffer();
    void mew(){
        System.out.println("Do you have a account y/n ");
        char a=sc.next().charAt(0);
        if(a=='n'){
           create();
            while(true){
                menu();
            }
        }
        else if(a=='y'){
            while(true){
            menu();
        }}
    }
    void menu(){
        System.out.println("1.Create account");
        System.out.println("2.Check balance");
        System.out.println("3.Deposit");
        System.out.println("4.Transfer");
        System.out.println("5. Withdraw");
        x=sc.nextInt();
        if(x==1){
            create();
        } else if (x==2) {
            check();
        } else if (x==3) {
            depo();
        } else if (x==4) {
            trans();
        } else if (x==5) {
            With();
        }
        else{
            System.out.println("invalid inputs");
        }
    }
    String strg;
    int ans,i;
    int create(){
        System.out.println("enter name of account");
        strg= sc.next();
        System.out.println("enter password for account");
      String  str= sc.next();
        ac++;
        depo();
        return 0;
    }
    void check(){
        System.out.println("Bank details are:-");
        System.out.println("name- "+strg);
        System.out.println("account number- "+ac);
        System.out.println("Balance:- "+bal);
    }
    void depo(){
        System.out.println("Enter Ammount");
        int b=sc.nextInt();
        bal=bal+b;
        bal=ans;
        System.out.println("new balance"+bal);
    }
    void trans(){
        System.out.println("Enter balance to transfer");
        int x=sc.nextInt();
        for(int i=0;i< ar.length;i++){
        {

    }}}
    void detail(int ar[]){
        int i=0;
        if(x==1){
          ar[i]=create();
            i++;
        }
    }
        void With(){
        System.out.println("Enter amount to withdraw");
        int b=sc.nextInt();
        bal=bal-b;
        bal=ans;
        System.out.println("New balance "+bal);
    }
}
public class Bank {
    public static void main(String[] args) {
        Bankk b=new Bankk();
        b.mew();

    }
}
