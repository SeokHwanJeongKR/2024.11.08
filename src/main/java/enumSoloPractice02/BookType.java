package enumSoloPractice02;

public enum BookType {
    REGULAR(7), PREMIUM(14), EXCULUSIVE(30);

    int howLongPassiableBorrow;

    BookType(int howLongPassiableBorrow) {
        this.howLongPassiableBorrow = howLongPassiableBorrow;
    }

    public int getHowLongPassiableBorrow() {
        return howLongPassiableBorrow;
    }
}
