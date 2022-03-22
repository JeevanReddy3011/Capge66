package Mycapgejava;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream --it is way to iterate the data from start to end

//data one by one and iterate it
//(maniplaluate particular elements
//1
//2
//3
//4
//5
public class MyStreamApi {
	public static void main(String[] args) {

		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(3);
		ls.add(1);
		ls.add(5);
	 
		//return the object of stream
		Stream<Integer> st=ls.stream();
		//lambda for printing 
		//st.forEach(a->System.out.println(a));
		
		//stream is operated 
		//ls.stream().forEach(a->System.out.println(a));
		//ls.stream().forEach(System.out::print);
		
	List<String> ls2=	ls.stream()
		   .filter((a)->(a >= 0)) //filter
		   .sorted(Collections.reverseOrder()) //sort method
		   //greater than
		                           //less than
		                           //== 
		                           //!=
		  // .forEach(System.out::println);
		   .map(a->"ID"+a) 
		        //input and output data will be same
		        //map will manipluate the data 
		       //add to data
		   .collect(Collectors.toList()); //take the value one by one and collect and return it
	
	  ls2.forEach(System.out::println);
	}

	
}