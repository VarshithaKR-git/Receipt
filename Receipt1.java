class Receipt {
	 private float subtotal;
	 private float salestax;
	 private float total;
	 private float balance;
	 
	 public int subtotal(int pprice,int nproduct){
		 int subtotal=pprice*nproduct;
		 return subtotal;
	 }
	 public float salestax(float subtotal){
		 
		float salestax=subtotal*(8.25F/100);
				return salestax;
	 }
	 public float total(float subtotal,float salestax){
		 total=subtotal+salestax;
		 return total;
	 }
	 public float balance(float apaid,float total){
		 balance=apaid-total; 
		 return balance;
	 }
 }
	

	