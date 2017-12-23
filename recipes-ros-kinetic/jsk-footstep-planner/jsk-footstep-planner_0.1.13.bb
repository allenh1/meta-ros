# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_footstep_planner"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs jsk-footstep-msgs jsk-interactive-marker jsk-recognition-msgs jsk-recognition-utils jsk-rviz-plugins jsk-topic-tools message-generation pcl-ros roscpp roseus visualization-msgs"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/jsk_footstep_planner/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75dd8157309e5a1bfde32eb2b482f003"
SRC_URI[sha256sum] = "ef1491dc74760b430b270a0c30ccee1d0a8fb1759978ca1b4a4eded947ca62e7"
S = "${WORKDIR}/jsk_control-release-release-kinetic-jsk_footstep_planner-0.1.13-0"

inherit catkin
