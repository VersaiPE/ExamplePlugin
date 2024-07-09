package pro.versai;

import cn.nukkit.plugin.PluginBase;

public class ExamplePlugin extends PluginBase {

    @Override
    public void onLoad() {
        // Remove this, just something simple to show
        this.getServer().getLogger().info("Example plugin loaded");
    }
}