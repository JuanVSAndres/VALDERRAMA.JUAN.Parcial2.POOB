package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public Duration getDuration() throws SabanaResearchException{
        Duration b = Duration.ofDays(0);
        if(this.activities.isEmpty()){
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_ITERATION);
        }
        for(Activity a:this.activities){
            b.plus(a.getDuration());
        }
        return b;
    }

}
