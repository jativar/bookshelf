package com.example.ramiro.bookshelf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.tdscientist.shelfview.BookModel;
import com.tdscientist.shelfview.ShelfView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


import java.net.*;
import java.io.*;

public class MainActivity extends AppCompatActivity implements ShelfView.BookClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShelfView shelfView = (ShelfView) findViewById(R.id.shelfView);
        shelfView.setOnBookClicked(this);
        ArrayList<BookModel> models = new ArrayList<>();

        models.add(new BookModel("https://images-na.ssl-images-amazon.com/images/I/81uYxP4WjYL.jpg", "1", "in the water they can't see you cry"));
        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);

        models.add(new BookModel("https://i.pinimg.com/736x/d6/c2/fd/d6c2fdebb411cd20a81f288e3c33d5ce--missy-franklin-swimming-tips.jpg", "2", "Relentless Spirit"));
        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);


        models.add(new BookModel("http://www.swimsmooth.com/images/swimsmooth-book-cover200.jpg", "3", "SwimSmooth"));
        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);

        models.add(new BookModel("https://www.velopress.com/wp-content/uploads/2012/04/SSS_72dpi_600pw_stroke.jpg", "4", "Swim Speed Secrets"));
        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);

        models.add(new BookModel("https://womensrunning-compgroup.netdna-ssl.com/wp-content/uploads/2015/12/find-a-way-280x420.jpg", "5", "Find a way"));
        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);

        models.add(new BookModel("https://allamericanswim.com/pub/media/catalog/product/cache/small_image/240x300/beff4985b56e3afdbeabfc89641a4582/5/1/51oxlp2qo4l._sx348_bo1_204_203_200_.jpg", "6", "Fitness Swimming"));
        shelfView.loadData(models, ShelfView.BOOK_SOURCE_URL);


    }

    @Override
    public void onBookClicked(int position, String bookId, String bookTitle) {
        // handle click events here
        Toast.makeText(this, bookTitle, Toast.LENGTH_SHORT).show();


        // Reading directly from an URL
        // https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html


    }
}
