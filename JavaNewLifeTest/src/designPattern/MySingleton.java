package designPattern;

public enum MySingleton {
    INSTANCE;
    private MySingleton() {
        System.out.println("Here");
    }
    void checkRead(){
    	System.out.println("checkRead");
    }
    public static void main(String[] args) {
    	MySingleton my=MySingleton.INSTANCE;
    	my.checkRead();
    	my=MySingleton.INSTANCE;
    
    }
}