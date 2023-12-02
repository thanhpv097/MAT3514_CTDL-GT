package hw7_21000703_phanvanthanh.ontap;

public class main {
    public static void main(String[] args) {
        String[] en = {"one", "two", "three"};
        String[] vi = {"mot", "hai", "ba"};
        Dictionary dc = new Dictionary();
        dc.loadDictionary(en, vi);
        DictList<String> enl = new DictList<>();
        enl.add("one");
        enl.add("two");
        enl.add("three");
        DictList<String> trans = dc.translate(enl);
        for(int i = 0; i < trans.size(); i++) {
            System.out.println(trans.get(i));
        }
    }

}
