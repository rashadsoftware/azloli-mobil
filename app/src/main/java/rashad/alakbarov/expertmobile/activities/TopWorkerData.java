package rashad.alakbarov.expertmobile.activities;

public class TopWorkerData {
    private String workerName;
    private String workerProfessional;
    private Integer workerImage;

    public TopWorkerData(String workerName, String workerProfessional, Integer workerImage) {
        this.workerName = workerName;
        this.workerProfessional = workerProfessional;
        this.workerImage = workerImage;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerProfessional() {
        return workerProfessional;
    }

    public void setWorkerProfessional(String workerProfessional) {
        this.workerProfessional = workerProfessional;
    }

    public Integer getWorkerImage() {
        return workerImage;
    }

    public void setWorkerImage(Integer workerImage) {
        this.workerImage = workerImage;
    }
}
