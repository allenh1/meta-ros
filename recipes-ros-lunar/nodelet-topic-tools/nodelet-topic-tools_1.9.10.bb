# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains common nodelet tools such as a mux, demux and throttle."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin dynamic-reconfigure message-filters nodelet pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_topic_tools/1.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a9e6dccfb667141d89781279f38f6c5"
SRC_URI[sha256sum] = "546201af50963ad6357dda9c85bfb589a685b177b05e77754eef2e939ab3ab5e"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet_topic_tools-1.9.10-0"

inherit catkin
