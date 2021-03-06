package objectmethods.symmetry;

import java.util.Objects;

//symmetry
public class CaseInsensitiveString {
        private final String s;

        public CaseInsensitiveString(String s) {
            this.s = Objects.requireNonNull(s);
        }

        @Override
        public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(this.s);
    }


        // Broken - violates symmetry!
/*        @Override public boolean equals(Object o) {
            if (o instanceof CaseInsensitiveString)
                return s.equalsIgnoreCase(
                        ((CaseInsensitiveString) o).s);
            if (o instanceof String) // One-way interoperability!
                return s.equalsIgnoreCase((String) o);
            return false;
        }*/
    //...  Remainder omitted
}
