package ffrowies.dev.materialbottombar;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "FAB clicked", Toast.LENGTH_SHORT).show();
            }
        });
        
        bottomAppBar = (BottomAppBar) findViewById(R.id.bootom_app_bar);
        bottomAppBar.replaceMenu(R.menu.main_menu);
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.action_cart:
                        Toast.makeText(MainActivity.this, "Cart clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_shipping:
                        Toast.makeText(MainActivity.this, "Shipping clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_customer:
                        Toast.makeText(MainActivity.this, "Customer clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
