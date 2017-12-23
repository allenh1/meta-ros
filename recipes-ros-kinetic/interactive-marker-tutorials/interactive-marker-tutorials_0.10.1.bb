# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The interactive_marker_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interactive-markers roscpp tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/kinetic/interactive_marker_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f680e68fb8077fec22145b75397330f"
SRC_URI[sha256sum] = "7152098a1dca3658bfec7f73f5e4fdce83eeb383373b3ec09c58cbb321600cfc"
S = "${WORKDIR}/visualization_tutorials-release-release-kinetic-interactive_marker_tutorials-0.10.1-0"

inherit catkin
