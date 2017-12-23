# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launchers for bringing up the nodes of nao_interaction metapackage."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nao-audio nao-vision"
SRC_URI = "https://github.com/ros-naoqi/nao_interaction-release/archive/release/kinetic/nao_interaction_launchers/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e8da4cc4b81c7e973daf23fe84c09b0"
SRC_URI[sha256sum] = "118e9e45f9c734caf653435597f9a5c4cfb81b168628c2018f319fd1be91cc71"
S = "${WORKDIR}/nao_interaction-release-release-kinetic-nao_interaction_launchers-0.1.5-0"

inherit catkin
