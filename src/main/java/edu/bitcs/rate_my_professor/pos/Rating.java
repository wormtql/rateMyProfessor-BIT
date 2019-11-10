package edu.bitcs.rate_my_professor.pos;

import edu.bitcs.rate_my_professor.dtos.request_body.PostRatingRequestBody;
import edu.bitcs.rate_my_professor.services.IdHelper;

import java.util.ArrayList;

public class Rating {
    private long rId;
    private long rCourse;
    private long rProfessor;
    private String rUser;
    private double rQuality;
    private double rDifficulty;
    private boolean rTakeAgain;
    private boolean rAttendance;
    private String rGradeReceived;
    private String rComment;
    private String rDate;
    private int rPeopleFoundUseful;
    private int rPeopleDidNotFindUseful;

    public Rating() {
    }

    public Rating(PostRatingRequestBody postRatingRequestBody, String uEmail) throws NullPointerException{

        String rCourse = postRatingRequestBody.getrCourse();
        Long rCourseId = IdHelper.getIdFromStringId(rCourse);
        this.rCourse = rCourseId;

        String rProfessor = postRatingRequestBody.getrProfessor();
        Long rProfessorId = IdHelper.getIdFromStringId(rProfessor);
        this.rProfessor = rProfessorId;

        this.rUser = uEmail;

        this.rQuality = postRatingRequestBody.getrQuality();
        this.rDifficulty = postRatingRequestBody.getrDifficulty();
        this.rTakeAgain = postRatingRequestBody.isrTakeAgain();
        this.rAttendance = postRatingRequestBody.isrAttendance();
        this.rGradeReceived = postRatingRequestBody.getrGradeReceived();
        this.rComment = postRatingRequestBody.getrComment();
    }

    public Rating(long rId, long rCourse, long rProfessor, String rUser, double rQuality, double rDifficulty, boolean rTakeAgain, boolean rAttendance, String rGradeReceived, String rComment, String rDate, int rPeopleFoundUseful, int rPeopleDidNotFindUseful) {
        this.rId = rId;
        this.rCourse = rCourse;
        this.rProfessor = rProfessor;
        this.rUser = rUser;
        this.rQuality = rQuality;
        this.rDifficulty = rDifficulty;
        this.rTakeAgain = rTakeAgain;
        this.rAttendance = rAttendance;
        this.rGradeReceived = rGradeReceived;
        this.rComment = rComment;
        this.rDate = rDate;
        this.rPeopleFoundUseful = rPeopleFoundUseful;
        this.rPeopleDidNotFindUseful = rPeopleDidNotFindUseful;
    }

    public long getrId() {
        return rId;
    }

    public void setrId(long rId) {
        this.rId = rId;
    }

    public long getrCourse() {
        return rCourse;
    }

    public void setrCourse(long rCourse) {
        this.rCourse = rCourse;
    }

    public long getrProfessor() {
        return rProfessor;
    }

    public void setrProfessor(long rProfessor) {
        this.rProfessor = rProfessor;
    }

    public String getrUser() {
        return rUser;
    }

    public void setrUser(String rUser) {
        this.rUser = rUser;
    }

    public double getrQuality() {
        return rQuality;
    }

    public void setrQuality(double rQuality) {
        this.rQuality = rQuality;
    }

    public double getrDifficulty() {
        return rDifficulty;
    }

    public void setrDifficulty(double rDifficulty) {
        this.rDifficulty = rDifficulty;
    }

    public boolean isrTakeAgain() {
        return rTakeAgain;
    }

    public void setrTakeAgain(boolean rTakeAgain) {
        this.rTakeAgain = rTakeAgain;
    }

    public boolean isrAttendance() {
        return rAttendance;
    }

    public void setrAttendance(boolean rAttendance) {
        this.rAttendance = rAttendance;
    }

    public String getrGradeReceived() {
        return rGradeReceived;
    }

    public void setrGradeReceived(String rGradeReceived) {
        this.rGradeReceived = rGradeReceived;
    }

    public String getrComment() {
        return rComment;
    }

    public void setrComment(String rComment) {
        this.rComment = rComment;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public int getrPeopleFoundUseful() {
        return rPeopleFoundUseful;
    }

    public void setrPeopleFoundUseful(int rPeopleFoundUseful) {
        this.rPeopleFoundUseful = rPeopleFoundUseful;
    }

    public int getrPeopleDidNotFindUseful() {
        return rPeopleDidNotFindUseful;
    }

    public void setrPeopleDidNotFindUseful(int rPeopleDidNotFindUseful) {
        this.rPeopleDidNotFindUseful = rPeopleDidNotFindUseful;
    }
}