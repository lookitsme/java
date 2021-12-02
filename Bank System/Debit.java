package Bank System;

class Debit extends Bank {
    String card_number;
    int ccv;
    String AccountName;
        public Debit( String c, int ccv, String AN){
          
            this.card_number=c;
            this.ccv=ccv;
            this.AccountName=AN;
        }
    public Debit (){
        this("1224 4475 1142", 127, " Able Gurung ");
    }
    public void getDebitdetails(){
       
    }
}