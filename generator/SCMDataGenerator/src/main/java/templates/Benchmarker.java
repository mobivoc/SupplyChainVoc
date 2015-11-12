package templates;

import java.net.URL;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;

import tool.Starter;
import vocabulary.Metrics;

public class Benchmarker {
	
	final static Logger logger = Logger.getLogger(Starter.class);
	
	String datasetURL; 
	
	
	public Benchmarker() {
	}
	
	public void setDatasetURL(String datasetURL)
	{
		this.datasetURL = datasetURL;
	}

	public void executeQueries() {
		// TODO update
//		
//		Model model = ModelFactory.createDefaultModel();
//		
//		
//		
//		URL sparqlURL = Starter.class.getClassLoader().getResource(
//				Metrics.RL_DeliveryInFull);
//
//		String deliveryInFullQuery = MetricReader.readFile(sparqlURL.getPath(),
//				Charset.defaultCharset());
//
//
//		// Get current time
//		long start = System.currentTimeMillis();
//
//		Query query = QueryFactory.create(deliveryInFullQuery);
//		try (QueryExecution qexec = QueryExecutionFactory.create(query, model)) {
//			ResultSet results = qexec.execSelect();
//			for (; results.hasNext();) {
//				QuerySolution soln = results.nextSolution();
//				RDFNode metricResult = soln.get("result");
//				System.out.println("Result: " + metricResult);
//			}
//		}
//		long elapsedTime = System.nanoTime() - start;
//
//		// Get elapsed time in milliseconds
//		long elapsedTimeMillis = System.currentTimeMillis() - start;
//
//		// Get elapsed time in seconds
//		float elapsedTimeSec = elapsedTimeMillis / 1000F;
//
//		System.out.println(String.valueOf(elapsedTime));
//		System.out.println("ex time: " + String.valueOf(elapsedTimeSec));
//		
	}
	
}
