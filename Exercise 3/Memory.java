
public class Memory {
    private  boolean status;
    private char type;
    private String description;
    private int lasting;

//                     <----- Constructors ----->

    public Memory(char c, String s){
        status = true;
        type = c;
        description = s;
        lasting = 1;
    }
    public Memory(char c, String s, int i){
        status = true;
        type = c;
        description = s;
        lasting = i;
    }

//                     <----- Setters ----->

    public void setLasting(int l){
        this.lasting = l;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

//                     <----- Getters ----->

    public boolean getStatus(){
        boolean remember = false;
        if(status){
            remember = status;
        }
        return remember;
    }
    public char getType(){
        char remember;
        if(status){
            remember = type;
        }else{
            type = '_';
            remember = type;
        }
        return remember;
    }
    public String getDescription(){
        String remember;
        if(status){
            remember = description;
        }else{
            description = "You have forgotten a memory";
            remember = description;
        }
        return remember;
    }
    public int getLasting(){
        int remember;
        if(status){
            remember = this.lasting;
        }else{
            lasting = 0;
            remember = lasting;
        }
        return remember;
    }

    public void fading(int f){
        if(f>0){
            while(f > 0){
                System.out.println("Memory '" + this.description + "' is fading");
                f = f -1;
            }
            System.out.println("Memory '" + this.description + "' has faded");
            this.status = false;   
        }else{
            System.err.println("Your memory duration cannot be less than zero");
        }
        
    }

}
