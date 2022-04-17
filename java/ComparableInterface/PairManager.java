public class PairManager {
    public static void main(String[] args) {
        Pair<Integer>twoInts=new Pair<Integer>(39,42);
        Pair<Double>twoDbls=new Pair<Double>(39.9,32.3);
        Pair<Character>twoChars=new Pair<Character>('w','b');
        System.out.println(twoInts.chooseItem());
        System.out.println(twoDbls.chooseItem());
        System.out.println(twoChars.chooseItem());
    }
}
