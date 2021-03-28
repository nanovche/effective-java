package objectmethods.workingexample;

// Class with a typical equals method
public final class PhoneNumber implements Comparable<PhoneNumber> {

        private final short areaCode, prefix, lineNum;

        public PhoneNumber(int areaCode, int prefix, int lineNum) {
            this.areaCode = rangeCheck(areaCode, 999, "area code");
            this.prefix = rangeCheck(prefix, 999, "prefix");
            this.lineNum = rangeCheck(lineNum, 9999, "line num");
        }

        private static short rangeCheck(int val, int max, String arg) {
            if (val < 0 || val > max)
                throw new IllegalArgumentException(arg + ": " + val);
            return (short) val;
        }
        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof PhoneNumber))
                return false;
            PhoneNumber pn = (PhoneNumber)o;
            return pn.lineNum == lineNum && pn.prefix == prefix
                    && pn.areaCode == areaCode;
        }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result += 31 * result + Short.hashCode(prefix);
        result += 31 * result + Short.hashCode(lineNum);
        return result;
    }

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        int result;
        result = Short.compare(this.areaCode, phoneNumber.areaCode);
        if(result == 0) {
            result = Short.compare(this.prefix, phoneNumber.prefix);
            if(result == 0) {
                result = Short.compare(this.lineNum, phoneNumber.lineNum);
            }
        }
        return result;
    }
    // One-line hashCode method - mediocre performance
    /*    @Override public int hashCode() {
        return Objects.hash(lineNum, prefix, areaCode);
    }*/

    // Remainder omitted
}