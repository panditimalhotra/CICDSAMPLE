package skillpack.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new TextButton("TextButton"));
    }
}
