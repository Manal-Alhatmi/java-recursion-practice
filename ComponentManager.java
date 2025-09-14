import java.util.List;
import java.util.ArrayList;

class Component {
    private String id;
    private boolean enabled = true;
    private List<Component> children = new ArrayList<>();

    public Component(String id) {
        this.id = id;
    }

    public void add(Component component) {
        children.add(component);
    }



    public List<Component> getChildren() {
        return children;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Component " + id + " set to " + (enabled ? "enabled" : "disabled"));
    }
}

class ComponentManager {
    public void disableAll(Component root) {
        if (root.getChildren().isEmpty()) {
        }
        root.setEnabled(false);
        for (Component child : root.getChildren()) {
            disableAll(child);
        }
    }
}