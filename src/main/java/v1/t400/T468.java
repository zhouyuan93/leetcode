package v1.t400;

public class T468 {
    public String validIPAddress(String IP) {
        if (isIpv4(IP)) {
            return "IPv4";
        }
        if (isIpv6(IP)) {
            return "IPv6";
        }
        return "Neither";
    }

    public boolean isIpv4(String ip) {
        int count = 0;
        Integer x = null;
        for (int i = 0; i < ip.length(); i++) {
            char c = ip.charAt(i);
            int t = c - '0';
            if (c == '.') {
                count++;
                if (count > 3) {
                    return false;
                }
                if (x == null || x > 255) {
                    return false;
                }
                x = null;
            } else if (t >= 0 && t <= 9) {
                if (x == null) {
                    x = t;
                } else {
                    if (x == 0) {
                        return false;
                    }
                    x = x * 10 + t;
                    if (x > 255) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        if (count != 3) {
            return false;
        }

        if (x == null || x > 255) {
            return false;
        }

        return true;
    }

    public boolean isIpv6(String ip) {
        int count = 0;
        int len = 0;

        for (int i = 0; i < ip.length(); i++) {
            char c = ip.charAt(i);
            if (c == ':') {
                count++;
                if (count > 7) {
                    return false;
                }
                if (len == 0) {
                    return false;
                }
                len = 0;
            } else if (transChar(c)) {
                len++;
                if (len > 4) {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (count != 7) {
            return false;
        }
        if (len == 0) {
            return false;
        }

        return true;
    }

    public boolean transChar(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else if (c >= 'a' && c <= 'f') {
            return true;
        } else if (c >= 'A' && c <= 'F') {
            return true;
        } else {
            return false;
        }
    }

}
