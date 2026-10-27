public class EmployeeModel {
    private String username = "admin";
    private String password = "admin123";

    public boolean validateLogin(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }

    public boolean changePassword(String oldPass, String newPass, String confirmPass) {
        if (!password.equals(oldPass))
            return false;
        if (newPass == null || newPass.isEmpty() || !newPass.equals(confirmPass))
            return false;

        password = newPass;
        return true;
    }
}
