# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package contains bringup scripts/config/tools for tra1 robto"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native controller-manager joint-state-controller joint-trajectory-controller minas-control position-controllers robot-state-publisher tf tra1-description tra1-moveit-config"
SRC_URI = "https://github.com/tork-a/minas-release/archive/release/kinetic/tra1_bringup/1.0.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cdd73c87e6aabdfc91eec8257c840ad5"
SRC_URI[sha256sum] = "5af72e5643e764d2bc5512f0f74946166f66e9e8a6c8e620817cf2e4e1e61466"
S = "${WORKDIR}/minas-release-release-kinetic-tra1_bringup-1.0.7-1"

inherit catkin
