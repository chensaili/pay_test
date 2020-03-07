package csl.pay.thinkingInJava.generic.innerclass;//: generics/Generators.java
// A utility to use with Generators.

import csl.pay.thinkingInJava.generic.coffee.Generator;

import java.util.Collection;


public class Generators {
  public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }
}
