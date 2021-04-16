package io.zipcoder;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {

   private StringBuffer sb;

    public SafeCopier(String toCopy) {
        super(toCopy);

       this.sb=new StringBuffer();
    }

    public void run() {

        while (stringIterator.hasNext()) {

            sb.append(stringIterator.next()).append(" ");
        }
        this.copied = sb.toString();
    }
}
