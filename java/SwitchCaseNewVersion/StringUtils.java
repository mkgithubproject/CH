public class StringUtils {
    private String m_str;

    public StringUtils(String m_str) {
        this.m_str = m_str;
    }

    @Override
    public String toString() {
        return m_str;

    }
    public int method1(char c){
        int len=m_str.length();
        String temp=m_str.toLowerCase();
        int count=0;
        for(int i=0;i<len;i++){
            if(c==temp.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public int method2(){
        String temp=m_str.toLowerCase();
        int len=m_str.length();
        int count=0;
        for(int i=0;i<len;i++){
            switch(temp.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}
