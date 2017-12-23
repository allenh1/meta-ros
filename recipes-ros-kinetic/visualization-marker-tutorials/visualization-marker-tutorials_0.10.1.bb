# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The visulalization_marker_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/kinetic/visualization_marker_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "edc4433a138c13e0ecb7276effe5cd30"
SRC_URI[sha256sum] = "618928e60c10cfb55cd0896bb94c87f834037c92de36014bb4b99f38f5af696c"
S = "${WORKDIR}/visualization_tutorials-release-release-kinetic-visualization_marker_tutorials-0.10.1-0"

inherit catkin
