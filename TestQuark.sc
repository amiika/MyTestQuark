TestQuark {
	*new {|k, n|
		^this.test(k,n);
	}
	*test {|k,n|
	       k+n;
	      }
}
