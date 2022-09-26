package example;

public enum Color {
    WHITE("#FFFFFF"),
    BLACK("#000000");

    private final String hex;

    private Color(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}