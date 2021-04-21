package Account;

import static java.lang.String.*;

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
        return format("Account2 { id = %s, sum = %s}", id, sum);
    }
}
