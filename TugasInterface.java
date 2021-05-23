abstract class Character1 {
    public abstract void characterDescription1();
    public void characterQuote1() {
        System.out.println("'The people who require your protection, you cannot hope to save.'");
    }
}
class Yoshimitsu extends Character1{
    public void characterDescription1(){
        System.out.println("Character 1 : Yoshimitsu");
        System.out.println("ATK : 90");
        System.out.println("DEF : 80");
    }
}
interface Character2 {
    public void characterDescription2();
    public void characterQuote2();
}
class King implements Character2{
    public void characterDescription2(){
        System.out.println("Character 2: King");
        System.out.println("ATK : 85");
        System.out.println("DEF : 85");
    }
    public void characterQuote2(){
        System.out.println("'You're no match for me!'");
    }
}
class main{
    public static void main(String[] args){
        Yoshimitsu objYoshimitsu = new Yoshimitsu();
        objYoshimitsu.characterDescription1();
        objYoshimitsu.characterQuote1();
        King objKing = new King();
        objKing.characterDescription2();
        objKing.characterQuote2();
    }
}