package chainResponsibility.handlers;

import chainResponsibility.directory.Directory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Said_Sulaiman_Arsala on 11/8/2016.
 */
public class HandlerBySizeTest {

    private HandlerBySize handlerBySize;
    private static final String path = "D:\\KharkivJavaTask5";

    @Before
    public void initial(){
        handlerBySize = new HandlerBySize(true, 14, 25);
    }

    @Test
    public void testHandleRequest(){
        Directory directory = new Directory();
        directory.fill(path);
        System.out.println(handlerBySize.handleRequest(directory.getResultList()));
    }

}