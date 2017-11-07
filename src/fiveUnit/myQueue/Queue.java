package fiveUnit.myQueue;

/**
 * In this class we realise query with simple arrays.
 */
public class Queue {
    char q[]; // This is array for keeping queue.
    int putloc, getloc; // Idexes for insertion and deletetion.

    /**
     * Constructor creates queue with static size.
     * @param size
     */
    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    /**
     * Method put() put element into queue.
     * @param ch
     */
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" Queue is completed ");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    /**
     * This method gets the meaning from queue.
     * @return
     */
    char get() {
        if (getloc == putloc) {
            System.out.println(" Queue is empty ");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
