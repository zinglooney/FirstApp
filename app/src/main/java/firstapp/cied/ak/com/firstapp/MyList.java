package firstapp.cied.ak.com.firstapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MyList extends ListActivity {

    private Integer myArray[] ={10,20,30,40,50};
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        setListAdapter(new ArrayAdapter<Integer>(
                this,
                android.R.layout.simple_list_item_1, myArray) {
        });

        msg= (TextView) findViewById(R.id.listMessages);


    }

    @Override
    protected  void	onListItemClick(ListView l, View v, int position, long id)
    {
        msg.setText("Click on item "+position+" contents: "+((TextView)v).getText());
    }
}
