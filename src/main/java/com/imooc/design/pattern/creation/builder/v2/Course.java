package com.imooc.design.pattern.creation.builder.v2;

/**
 * 将实体类和其建造者放在一起，方便维护
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    private Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.getCourseName();
        this.coursePPT = courseBuilder.getCoursePPT();
        this.courseVideo = courseBuilder.getCourseVideo();
        this.courseArticle = courseBuilder.getCourseArticle();
        this.courseQA = courseBuilder.getCourseQA();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder coursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder courseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder courseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder courseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        private String getCourseName() {
            return courseName;
        }

        private String getCoursePPT() {
            return coursePPT;
        }

        private String getCourseVideo() {
            return courseVideo;
        }

        private String getCourseArticle() {
            return courseArticle;
        }

        private String getCourseQA() {
            return courseQA;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
