public class Factory {
    public Shape getShape(String shapetype) {
        if (shapetype == null) {
            return null;
        } else if (shapetype.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

// Creating the client so that when we want to add the methods we can do that
