package term2;

class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
    }
}

public class hex {
    public static void main(String[] args) {
        Num numObj = new Num(255);
        numObj.showNum(); 

        HexNum hexNumObj = new HexNum(255);
        hexNumObj.showNum(); 
    }
}

