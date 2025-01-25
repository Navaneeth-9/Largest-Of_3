public class LargestOf3{
    public static void main(String[] args) {
        int a=13;
        int b=25;
        int c=15;
        if(a>b){
            if(a>c){
                System.out.println(" a is big ");
            }
            else{
                System.out.println("c is big");
            }
        }
        else if(b>c){
            if(b>a){
                System.out.println("b is big");
            }else{
                System.out.println("a is big");
            }
        }
    }
}
