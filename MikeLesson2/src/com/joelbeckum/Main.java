package com.joelbeckum;

public class Main {

    public static void main(String[] args) {
        IFeedable[] feedables = getFeedables();

        for (IFeedable f: feedables) {
            f.feed();
        }

        IFeedable cat = feedables[0];

        cat.feed();
//        cat.speak();  //You cant do this because this code doesn't know it's a cat
//        cat.numberOfLegs; //You cant do this because this code doesn't know it's a cat

        // go to the database
        // get every animal assigned to me
        // find the ones that need to be fed
//        IFeedable[] feedables = animalProvider.getFeedables(myEmployeeId);

        // these can be an array of IFeedable


        // go to the database
        // get every animal assigned to me
        // find the ones that need to be played with
//        IFeedable[] IPlayable = animalProvider.getPlayables(myEmployeeId);

        // these can be an array of IPlayable
    }

    static IFeedable[] getFeedables()
    {
        IFeedable[] feedables = new IFeedable[3];

        feedables[0] = new Cat();
        feedables[1] = new Turtle();
        feedables[2] = new Dob();

        return feedables;
    }
}
