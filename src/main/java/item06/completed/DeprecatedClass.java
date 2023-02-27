package item06.completed;

public class DeprecatedClass {

    private String name;

    /**
     * @deprecated in favor of
     * {@link #DeprecatedClass(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2")
    public DeprecatedClass() {
    }

    public DeprecatedClass(String name) {
        this.name = name;
    }
}
