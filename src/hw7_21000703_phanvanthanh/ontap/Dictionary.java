package hw7_21000703_phanvanthanh.ontap;

public class Dictionary {
    private String[] en = new String[100];
    private String[] vi = new String[100];
    public void loadDictionary(String[] en, String[] vi) {
        for(int i = 0; i < en.length; i++) {
            this.en[i] = en[i];
        }
        for(int i = 0; i < vi.length; i++) {
            this.vi[i] = vi[i];
        }
    }
    public DictList<String> translate(DictList<String> en) {
        DictList<String> result = new DictList<>();
        for(int i = 0; i < en.size(); i++) {
            result.add(translateWord(en.get(i)));
        }
        return result;
    }
    public String translateWord(String word) {
        String output = "";
        for(int i = 0; i < en.length; i++) {
            if(en[i] == word) {
                output = vi[i];
            }
        }
        return output;
    }
}
