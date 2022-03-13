package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Session> sessionDataList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        sessionDataList = new ArrayList<>();

        // edw th kaleis kai vazeis data mesa. anti aftou yparxoun hdh.
        setUserInfo();//passes random information into ArrayList

        //  Insert some dummy data to the list.
        for (int i = 0; i < 10; i++) {
            String sessionId = "sessionId" + String.valueOf(i);
            // Create a temporaty object to work with.
            //Session sessionTemp = new Session( "sessionId" + i );

            String ReceivedSessiontID = "sessionId" + i;
            String ReceivedPatientID = "patientId" + i;
            String ReceivedInsoletID = "insoleId" + i;
            String ReceivedStartTime = "startTime" + i;
            String ReceivedEndTime = "endTime" + i;
            String ReceivedIsPart = "isPart" + i;

            // vazw ta data sto object.
            Session tempData = new Session(ReceivedSessiontID);
            //Pass whole object to the session constructo
            //Session tempData2 = new Session( jsonobject  );
            // vazw to object panw sto array.
            sessionDataList.add( tempData );
        }

        setAdapter();//set Adapter for Recycle View
    }

    private void setAdapter() {//Create Instance of Recycle Adapter
        recyclerAdapter adapter = new recyclerAdapter(sessionDataList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setUserInfo(){
        //sessionDataList.add(new Session("Gaben"));
        //usersList.add(new Session("Newel"));
        //usersList.add(new Session("Water"));
        //usersList.add(new Session("Tuna"));
        //sessionDataList
    }
}