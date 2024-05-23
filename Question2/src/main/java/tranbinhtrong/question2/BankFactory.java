package tranbinhtrong.question2;

enum BankType {
    VietcomBank,
    TPBank;
}

public class BankFactory {

    public static Bank getBankName(BankType type) {
        switch (type) {
            case VietcomBank -> {
                return new VietcomBank();
            }
            case TPBank -> {
                return new TPBank();
            }
        }
        return null;
    }
}
