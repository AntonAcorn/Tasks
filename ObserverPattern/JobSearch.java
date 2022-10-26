package ObserverPattern;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("first Java Position");
        jobSite.addVacancy("second Java Position");

        Observer firstSubscriber = new Subscriber("Elton");
        Observer secondSubscriber = new Subscriber("John");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("third Java Position");
        jobSite.removeVacancy("first Java Position");
    }
}
