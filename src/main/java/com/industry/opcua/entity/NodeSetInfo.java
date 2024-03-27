package com.industry.opcua.entity;

import lombok.Data;

import java.util.List;

@Data
public class NodeSetInfo {
    private String FileName;
    private String ModelUri;
    private String Name;
    private String Prefix;
    private boolean Ignore;
    private String Version;
    private List<NodeSetInfo> PreviousVersions;
}
