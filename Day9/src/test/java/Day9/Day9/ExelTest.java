package Day9.Day9;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.exampl.Exel.Exelclass;

public class ExelTest {
  @Test(dataProvider="testData")
  public void addMethod(double num1,double n2) throws IOException {
	  double result=num1+n2;
	  Exelclass.updataExcel();
  }
  @DataProvider
  public Object[][] testData() throws IOException
  {
	  Object[][] data=Exelclass.readExcel();
	  return data;
  }
}
