class Bank{
    int bankInterest(){
        return 0;
    }
} class uttaraBank extends Bank{
    @Override
    int bankInterest() {
        return 7;
    }
} class sonaliBank extends Bank{
    @Override
    int bankInterest() {
        return 8;
    }
} class dutchBanglaBank extends Bank{
    @Override
    int bankInterest() {
        return 9;
    }
}
public class LoginApp {
    public static void main(String[] args) {
        Bank b = new Bank();
        uttaraBank ub = new uttaraBank();
        sonaliBank sb = new sonaliBank();
        dutchBanglaBank dbbl = new dutchBanglaBank();

        System.out.println("Bank of interest = "+b.bankInterest());
        System.out.println("Bank of interest = "+ub.bankInterest());
        System.out.println("Bank of interest = "+sb.bankInterest());
        System.out.println("Bank of interest = "+dbbl.bankInterest());
    }
}
