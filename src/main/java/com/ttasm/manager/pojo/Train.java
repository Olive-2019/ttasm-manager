package com.ttasm.manager.pojo;

public class Train {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column train.train_ID
     *
     * @mbg.generated
     */
    private String trainId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column train.capacity
     *
     * @mbg.generated
     */
    private Integer capacity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column train.train_ID
     *
     * @return the value of train.train_ID
     *
     * @mbg.generated
     */
    public String getTrainId() {
        return trainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column train.train_ID
     *
     * @param trainId the value for train.train_ID
     *
     * @mbg.generated
     */
    public void setTrainId(String trainId) {
        this.trainId = trainId == null ? null : trainId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column train.capacity
     *
     * @return the value of train.capacity
     *
     * @mbg.generated
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column train.capacity
     *
     * @param capacity the value for train.capacity
     *
     * @mbg.generated
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}