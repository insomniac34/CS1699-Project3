/**
 * Created by tyler on 10/22/14.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
//import cucumber.runtime.PendingException;


/*
necessary format:
As a
I want
So that
*/


import java.io.*;

public class TestStepDefinitions {

    private AdjacencyList theAdjacencyList;

    @Given("Some stuff")
    public void basicAdjacencyListTest() {
        File graphFile = new File("/home/tyler/IdeaProjects/CS1699Project3/CS1699-Project3/Project3/src/main/resources");

        try {
            this.theAdjacencyList = new AdjacencyList(new BufferedReader(new FileReader(graphFile)));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        boolean connected = theAdjacencyList.isConnected();
        assertEquals(connected, true);
    }
}

