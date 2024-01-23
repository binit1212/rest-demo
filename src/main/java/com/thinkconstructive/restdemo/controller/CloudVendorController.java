package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;
import service.CloudVendorService;

import java.util.List;

@RequestMapping("/cloudvendor")
@RestController

public class CloudVendorController {
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);

    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted successfully";
    }

}
