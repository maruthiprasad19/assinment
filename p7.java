package practice;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import junit.framework.TestCase;

public class p7 extends TestCase {
  @Test
  public static void test() throws MalformedURLException, IOException{
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      p4.writeURL2Stream("http://www.google.de", baos);
      assertTrue(baos.toString().contains("google"));

  }
}