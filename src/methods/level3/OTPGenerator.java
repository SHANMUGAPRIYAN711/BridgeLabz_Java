package methods.level3;

class OTPGenerator {

    static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    static boolean isUnique(int otp) {
        boolean[] seen = new boolean[10];
        while (otp > 0) {
            int d = otp % 10;
            if (seen[d]) return false;
            seen[d] = true;
            otp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int otp = generateOTP();
        System.out.println("OTP: " + otp);
        System.out.println("Unique: " + isUnique(otp));
    }
}