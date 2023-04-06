package com.consumer.fi;

import java.util.function.Consumer;
//Consumer chaining

public class Test_Movie {

	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.setMovieName("spider");
		Consumer<Movie> c1=m->System.out.println(m.getMovieName()+" is released");
		Consumer<Movie> c2=m->System.out.println(m.getMovieName()+" is flopped");
		
		Consumer<Movie> cc=c1.andThen(c2);
		
		cc.accept(m1);

	}

}
