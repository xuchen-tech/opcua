package com.industry.opcua.entity;

import lombok.Data;

import java.util.List;

@Data
public class NodeSetFile {
    private List<NodeSetInfo> NodeSets;
}
