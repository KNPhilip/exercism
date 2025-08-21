import static java.lang.String.format;

public final class Badge {
    public String print(Integer id, String name, String department) {
        return format("%s%s - %s", 
                      getIdPrefix(id), 
                      name, 
                      department == null ? "OWNER" : department.toUpperCase());
    }

    private String getIdPrefix(Integer id) {
        if (id == null) {
            return "";
        } else {
            return format("[%s] - ", id);
        }
    }
}
