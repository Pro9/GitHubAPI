package com.example.githubapi.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView testGitConnection = (TextView)findViewById(R.id.testGitConnection);
        testGitConnection.setText("TESTEST");

        /*
        try {
            GitHub github = GitHub.connectAnonymously();
            GHRepository repo = github.getRepository("pro9/githubapi");
            testGitConnection.setText("Repo-name: "+repo.getName());
        }
        catch(IOException e){
            System.err.println("Caught IOException: " + e.getMessage());
        }
        */
        /*
        catch(NoClassDefFoundError c){
            System.err.println("Caught NoClassDefFoundError: " + c.getMessage());
        }
        */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
