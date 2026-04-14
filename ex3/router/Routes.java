package ex3.router;

import ex3.view.HomeView;
import ex3.view.View;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

public enum Routes {
    Home(new HomeView());

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}
