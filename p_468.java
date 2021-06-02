import java.util.Arrays;

class Solution {
    public String validIPAddress(String IP) {
        if (IP.length() == 0) return "Neither";
        if (checkIPv4(IP)) return "IPv4";
        if (checkIPv6(IP)) return "IPv6";
        else return "Neither";
    }

    public boolean checkIPv4(String IP) {
        if(IP.charAt(IP.length() - 1) == '.') return false;
        String[] aux = IP.split("\\.");
        int len = aux.length;
        if (len != 4) return false;
        int test = 0;

        for (int i = 0; i < len; i++) {
            if (hasLeadingZeros(aux[i])) return false;
            try {
                test = Integer.parseInt(aux[i]);
            } catch (NumberFormatException e) {
                return false;
            }
            if (test < 0 || test > 255) return false;
        }
        return true;
    }

    public boolean checkIPv6(String IP) {
        if(IP.charAt(IP.length() - 1) == ':') return false;
        String[] aux = IP.split(":");
        int len = aux.length;
        for (int i = 0; i < len; i++) {
            if (aux[i].length() > 4) return false;
        }

        if (len != 8) return false;

        for (int i = 0; i < len; i++) {
            try {
                long test = Long.parseLong(aux[i], 16);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    private boolean hasLeadingZeros(String aux) {
        if (aux.equals("0")) return false;
        else if (aux.length() == 0 || aux.charAt(0) == '0') return true;
        else return false;
    }
}
