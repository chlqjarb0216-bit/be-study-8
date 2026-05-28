package be_study.quiz.quiz39;

import java.util.ArrayList;

public class Kitchen {
	double area;
	String colorWall;
	int height;

	Refrigerator ref;
	GasStove gas;
	Sink sink;
	ArrayList<TrashCan> trashCans;
	ArrayList<Cup> cups;

	public ArrayList<TrashCan> addTrashCan(TrashCan trashCan) {
		this.trashCans.add(trashCan);
		return this.trashCans;
	}

	public ArrayList<Cup> addCup(Cup cup) {
		this.cups.add(cup);
		return this.cups;
	}
}
