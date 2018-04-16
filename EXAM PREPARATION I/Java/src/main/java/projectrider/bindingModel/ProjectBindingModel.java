package projectrider.bindingModel;

import javax.validation.constraints.NotNull;

public class ProjectBindingModel {

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private Double budget;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
