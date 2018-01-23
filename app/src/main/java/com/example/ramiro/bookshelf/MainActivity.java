package com.example.ramiro.bookshelf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.tdscientist.shelfview.BookModel;
        import com.tdscientist.shelfview.ShelfView;
        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ShelfView.BookClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShelfView shelfView = (ShelfView) findViewById(R.id.shelfView);
        shelfView.setOnBookClicked(this);
        ArrayList<BookModel> models = new ArrayList<>();

        models.add(new BookModel("http://eurodroid.com/pics/beginning_android_book.jpg", "1", "Beginning Android"));

        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);


    }

    @Override
    public void onBookClicked(int position, String bookId, String bookTitle) {
        // handle click events here
        //Toast.makeText(this, bookTitle, Toast.LENGTH_SHORT).show();
    }
}

