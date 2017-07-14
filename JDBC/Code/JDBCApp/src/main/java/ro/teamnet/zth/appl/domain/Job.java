package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.lang.reflect.Field;

/**
 * Created by Alina.Petrescu on 7/12/2017.
 */
@Table(name = "JOBS")
public class Job {
    @Id(name = "JOB_ID")
    private Long id;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "MIN_SALARY")
    private Long minSalary;

    @Column(name = "MAX_SALARY")
    private Long maxSalary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    public Long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Long maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (id != null ? !id.equals(job.id) : job.id != null) return false;
        if (jobTitle != null ? !jobTitle.equals(job.jobTitle) : job.jobTitle != null) return false;
        if (minSalary != null ? !minSalary.equals(job.minSalary) : job.minSalary != null) return false;
        return maxSalary != null ? maxSalary.equals(job.maxSalary) : job.maxSalary == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
