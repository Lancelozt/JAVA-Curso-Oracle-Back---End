public class exception {
    public static void main(String[] args) {
        cuenta acount = new cuenta();
        try {
            acount.deposita();
        } catch (Myexception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
