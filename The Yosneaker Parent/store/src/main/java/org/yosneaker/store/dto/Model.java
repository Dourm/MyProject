package org.yosneaker.store.dto;

public class Model {
    private Integer modelId;

    private String modelName;

    private String modelSeries;

    private Integer brandId;

    private String modelStory;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getModelSeries() {
        return modelSeries;
    }

    public void setModelSeries(String modelSeries) {
        this.modelSeries = modelSeries == null ? null : modelSeries.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getModelStory() {
        return modelStory;
    }

    public void setModelStory(String modelStory) {
        this.modelStory = modelStory == null ? null : modelStory.trim();
    }
}