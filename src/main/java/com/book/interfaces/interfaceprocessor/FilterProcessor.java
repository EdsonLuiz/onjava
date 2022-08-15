package com.book.interfaces.interfaceprocessor;

import com.book.interfaces.filters.BandPass;
import com.book.interfaces.filters.Filter;
import com.book.interfaces.filters.HighPass;
import com.book.interfaces.filters.LowPass;
import com.book.interfaces.filters.Waveform;

class FilterAdapter implements Processor {

  Filter filter;

  FilterAdapter(Filter filter) {
    this.filter = filter;
  }

  @Override
  public String name() {
    return filter.name();
  }

  @Override
  public Object process(Object input) {
    return filter.process((Waveform)input);
  }

}

public class FilterProcessor {
  public static void main(String[] args) {
    Waveform w = new Waveform();
    Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
    Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
    Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
  }
}
