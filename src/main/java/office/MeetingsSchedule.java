package office;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: sameer
 * Date: 16/05/2013
 * Time: 11:01
 */
public class MeetingsSchedule {

    private LocalTime officeStartTime;

    private LocalTime officeFinishTime;

    private Map<LocalDate, Set<Meeting>> meetings;

    public MeetingsSchedule(LocalTime officeStartTime, LocalTime officeFinishTime, Map<LocalDate, Set<Meeting>> meetings) {
        this.officeStartTime = officeStartTime;
        this.officeFinishTime = officeFinishTime;
        this.meetings = meetings;
    }

    public LocalTime getOfficeStartTime() {
        return this.officeStartTime;
    }

    public LocalTime getOfficeFinishTime() {
        return this.officeFinishTime;
    }

    public Map<LocalDate, Set<Meeting>> getMeetings() {
        return this.meetings;
    }

}
