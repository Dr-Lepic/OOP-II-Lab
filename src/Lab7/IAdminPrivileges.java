package Lab7;

public interface IAdminPrivileges {
    void modifyPrivilege(String username, String newPrivilege);
    void renameFile(String name, String newName);
    void deleteFile(String name);
    void addUser(String name, String email, String password, String id, String userType);
}
