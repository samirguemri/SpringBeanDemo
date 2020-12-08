package edu.samir.demo.springbean;

public class Job {

    private String jobName;
    private Address address;

    public Job() {}

    public Job(String jobId, Address address) {
        this.jobName = jobId;
        this.address = address;
    }

    public String getJobId() {
        return jobName;
    }

    public Job setJobId(String jobId) {
        this.jobName = jobId;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Job setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId='" + jobName + '\'' +
                ", address=" + address +
                '}';
    }
}
