import org.apache.commons.lang3.time.StopWatch;
import java.util.List;

/**
 * Class for measuring the execution time of the main methods of ArrayList and LinkedList
 * @author Nikita Safonov, student of AMM VSU, 3rd year, 3rd group
 * @see PerformanceTest
 */
public class CheckTime {

    /**
     * Method that measures execution time of adding elements
     * @param list (ArrayList or LinkedList)
     * @param amountOfElements amount of elements in list
     * @return measured time in milliseconds
     */
    public long addCheckTime(List list, int amountOfElements){
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = 0; i < amountOfElements; i++){
            list.add(i);
        }
        watch.stop();
        return watch.getTime();
    }

    /**
     * Method that measures execution time of getting elements
     * @param list (ArrayList or LinkedList)
     * @param amountOfElements amount of elements in list
     * @return measured time in milliseconds
     */
    public long getCheckTime(List list, int amountOfElements){
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = 0; i < amountOfElements; i++){
            int elem = (int)list.get(i);
        }
        watch.stop();
        return watch.getTime();
    }

    /**
     * Method that measures execution time of deleting elements
     * @param list (ArrayList or LinkedList)
     * @param amountOfElements amount of elements in list
     * @return measured time in milliseconds
     */
    public long deleteCheckTime(List list, int amountOfElements){
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = amountOfElements - 1; i >= 0; i--){
            list.remove(i);
        }
        watch.stop();
        return watch.getTime();
    }
}
