
public class adstack {

	    private String data[];
	    private int size;
	    private int top;
	    
	    //buat konstruktor
	    public adstack(int kapasitas){                
	        size = kapasitas;
	        top = -1;
	        data = new String [size];
	        
	    }
	    //Pengecekan kosong tidak nya
	    public boolean isEmpty(){
	        return top == -1;
	    }
	    //pengecekan full
	    public boolean isFull(){
	        return top == size-1;
	    }
	    //memasukkan buku ke dalam tumpukan
	    public void push(String input){
	        if(isFull()){
	            System.out.println("Melebihi batas");
	        }else{
	        data[++top]=input;
	        System.out.println("Buku "+input+" dimasukkan kedalam tumpukan");
	        }
	    }
	    //mengeluarkan buku kedalam tumpukan
	    public void pop(){
	        if (isEmpty()){
	            System.out.println("buku kosong");
	        }else{
	        String temp = data[top];
	        data[top] = data[top--];
	        System.out.println("Buku "+temp+" Dikeluarkan dari dalam tumpukan");
	        }
	        
	    }
	    //info index buku
	    public void infoStacks(){
	        for (int i = 0; i <= top; i++) {
	            System.out.println("Buku ke "+i+" = Buku "+data[i]);
	            
	        }
	    }
	    //Pengeluaran Output
	    public static void main(String[] args) {
	    	adstack s  = new adstack(5);
	        s.push("1");
	        s.push("2");
	        s.push("3");
	        s.push("4");
	        s.infoStacks();
	        s.pop();
	        s.pop();
	        s.pop();
	        s.infoStacks();
	        
	    }
	
}
