package alibaba;

public class ipTest {
    public static void main(String[] args) {
        //System.out.println(isInRange("192.168.1.127", "192.168.1.64/26"));
        System.out.println(isInRange("192.168.1.2", "192.168.0.0/23"));
        System.out.println(isInRange("192.168.0.1", "192.168.0.0/24"));
        System.out.println(isInRange("192.168.0.0", "192.168.0.0/32"));
    }
    public static boolean isInRange(String ip, String cidr) {
        String[] ips = ip.split("\\.");
        int test = Integer.parseInt(ips[0]) << 24;
        int test1 = Integer.parseInt(ips[1]) << 16;
        int test2 = Integer.parseInt(ips[2]) << 8;
        int test3 = Integer.parseInt(ips[3]);
        int test4 = test|test1|test2|test3;
        int ipAddr = (Integer.parseInt(ips[0]) << 24)
                | (Integer.parseInt(ips[1]) << 16)
                | (Integer.parseInt(ips[2]) << 8) | Integer.parseInt(ips[3]);
        int type = Integer.parseInt(cidr.replaceAll(".*/", ""));
        int mask = 0xFFFFFFFF << (32 - type);
        String cidrIp = cidr.replaceAll("/.*", "");
        String[] cidrIps = cidrIp.split("\\.");
        int cidrIpAddr = (Integer.parseInt(cidrIps[0]) << 24)
                | (Integer.parseInt(cidrIps[1]) << 16)
                | (Integer.parseInt(cidrIps[2]) << 8)
                | Integer.parseInt(cidrIps[3]);

        return (ipAddr & mask) == (cidrIpAddr & mask);
    }

}
