package data_structure_def;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class GraphTest {
    private static Graph graph = new Graph();

    @Test
    public void calcShortestPath1() {
        String test = graph.calcShortestPath("civilizations","new");
        assertEquals("无法到达该节点！",test);
    }

    @Test
    public void calcShortestPath2() {
        String test = graph.calcShortestPath("to","and");
        assertEquals("to -> explore -> strange -> new -> life -> and",test);
    }

    @Test
    public void calcShortestPath3() {
        String test = graph.calcShortestPath("to","civilizations");
        assertEquals("to -> explore -> strange -> new -> civilizations",test);
    }

    @Test
    public void calcShortestPath4() {
        String test = graph.calcShortestPath("to","explore");
        assertEquals("to -> explore",test);
    }

    @BeforeClass
    public static void set_graph(){
        File file=new File("src/test.txt");
        graph.graph_build_file(file);
    }

}