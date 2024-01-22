package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cloudvendor")
@RestController
public class CloudVendorApiService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Cloud Vendor created successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping({"vendorId"})
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor= null;
        return "Cloud Vendor Deleted successfully";
    }

}
