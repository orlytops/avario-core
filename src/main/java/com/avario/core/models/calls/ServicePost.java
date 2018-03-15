package com.avario.core.models.calls;

import com.avario.core.interfaces.ResponseListener;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by orly on 2/1/18.
 */

public class ServicePost {

  @SerializedName("id")
  private int id;

  @SerializedName("type")
  private String type;

  @SerializedName("domain")
  private String domain;

  @SerializedName("service")
  private String service;

  @SerializedName("service_data")
  private Map<String, Object> serviceData;

  private String serviceDataJson;

  private ResponseListener responseListener;

  public void setId(int id) {
    this.id = id;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getDomain() {
    return domain;
  }

  public void setService(String service) {
    this.service = service;
  }

  public void setServiceData(Map<String, Object> serviceData) {
    this.serviceData = serviceData;
  }

  public String getService() {
    return service;
  }

  public Map<String, Object> getServiceData() {
    return serviceData;
  }

  public void setResponseListener(ResponseListener responseListener) {
    this.responseListener = responseListener;
  }

  public ResponseListener getResponseListener() {
    return responseListener;
  }

  public String toJson() {
    Gson gson = new Gson();
       /* try {
            serviceDataJson = gson.toJson(serviceData);
        } catch (Exception e) {
            Timber.e("Error preparing jsonData");
        }*/

    return gson.toJson(this);
  }
}

