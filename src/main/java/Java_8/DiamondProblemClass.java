package Java_8;

public class DiamondProblemClass implements DiamondProblemInterface_01 ,DiamondProblemInterface_02{
    public static void main(String []args){

        DiamondProblemClass dd = new DiamondProblemClass();
        dd.disp1();


    }

    public void disp1(){
        DiamondProblemInterface_02.super.disp1();

    }

}
