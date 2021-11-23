import java.nio.charset.Charset;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

class App
{
	String csvWeatherForecast = null;

		
//Retrieve the result
HttpGet get = new HttpGet(builder.build());
CloseableHttpClient httpclient = HttpClients.createDefault();
CloseableHttpResponse response = httpclient.execute(get);    

try {
   if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
      System.out.printf("Bad response status code:%d%n", 
      response.getStatusLine().getStatusCode());
      return;
   }
	
   HttpEntity entity = response.getEntity();
   if (entity != null) {
      csvWeatherForecast=EntityUtils.toString(entity, Charset.forName("utf-8"));
   }
    
} finally {
   response.close();
}
 
}

