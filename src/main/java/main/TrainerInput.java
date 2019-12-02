package main;

public class TrainerInput {
	
	private String trainerName;
    private String trainerGrade;

    public TrainerInput(String trainerName, String trainerGrade) {
        this.trainerName = trainerName;
        this.trainerGrade = trainerGrade;
    }

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerGrade() {
		return trainerGrade;
	}

	public void setTrainerGrade(String trainerGrade) {
		this.trainerGrade = trainerGrade;
	}

}