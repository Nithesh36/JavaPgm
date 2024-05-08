package DSA;
class parent{
    String name;
}
public class SuperDemo  extends  parent{
    int id,code;
    private SuperDemo() {

        this.id=88;
        this.code=004;
//        System.out.println(super.name="dd");
    }

    public SuperDemo(int i, int i1) {
        this.id=i;
        this.code=i1;
    }


    void fetchBaseMember(){

    System.out.println(this.id);


}
    public static void main(String[] args) {
        SuperDemo s=new SuperDemo();
        SuperDemo s2=new SuperDemo(9,8);
      //  System.out.println(s2.code);
       s2.fetchBaseMember();
    }
}
