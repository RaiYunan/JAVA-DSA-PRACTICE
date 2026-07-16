package StringPrograms;

public class LC1108_DefangingAnIPAddress {
    /*
     * replace every "." with "[.]" in an IP address
     * 1. iterate each char
     * 2. append "[.]" for dot, else append char as-is
     *
     * string simulation
     * O(n) time, O(n) space
     */
    static String defangIpaddr(String address){
        StringBuilder sb=new StringBuilder();
        for(char c:address.toCharArray()){
            if(c=='.'){
                sb.append("[.]");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    void main(){
        System.out.println(defangIpaddr("1.1.1.1")); // 1[.]1[.]1[.]1
        System.out.println(defangIpaddr("255.100.50.0")); // 255[.]100[.]50[.]0
    }
}
