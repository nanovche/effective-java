package methods.optionals;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

    }

    public static <E extends Comparable<E>> Optional<E> maxValue(Collection<E> c) {

        if(c.isEmpty()) {
            return Optional.empty();
        } else {
            E result = null;
            for(E e: c) {
                if (result == null || e.compareTo(result) > 0) {
                    result = Objects.requireNonNull(e);
                }
            }
            return Optional.of(result);
        }
    }
}
