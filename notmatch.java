class notmatch extends Exception {
    public notmatch() {
        super("String does not match!");
    }
    public static void main(String[] args) {
        String st=new String("arindam");
        try {
            if(st.equals("University")){
                throw new notmatch();
            }
        }
        catch (notmatch n)
        {
            System.out.println("Exception caught: " + n.getMessage());
        }
    }
}
