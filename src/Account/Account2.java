package Account;

public class Account2<T,S extends Number> {

    private T id;
    private S sum;

    public Account2(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public S getSum() {
        return sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account2{");
        sb.append("id=").append(id);
        sb.append(", sum=").append(sum);
        sb.append('}');
        return sb.toString();
    }
}
