package lab04.AimsProject;

import lab03.AimsProject.DigitalVideoDisc;

public class TestPassingParameter {
    static class DVDWrapper {
        lab03.AimsProject.DigitalVideoDisc disc;

        DVDWrapper(lab03.AimsProject.DigitalVideoDisc disc) {
            this.disc = disc;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        lab03.AimsProject.DigitalVideoDisc jungleDVD = new lab03.AimsProject.DigitalVideoDisc("Jungle");
        lab03.AimsProject.DigitalVideoDisc cinderellaDVD = new lab03.AimsProject.DigitalVideoDisc("Cinderella");
        DVDWrapper jungleDVDWrapper = new DVDWrapper(jungleDVD);
        DVDWrapper cinderellaDVDWrapper = new DVDWrapper(cinderellaDVD);

        swap(jungleDVDWrapper, cinderellaDVDWrapper);
        System.out.println("jungle dvd title: " + jungleDVDWrapper.disc.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVDWrapper.disc.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(DVDWrapper dvd1, DVDWrapper dvd2){
        lab03.AimsProject.DigitalVideoDisc tmp = dvd1.disc;
        dvd1.disc = dvd2.disc;
        dvd2.disc = tmp;
    }

    public static void changeTitle(lab03.AimsProject.DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}