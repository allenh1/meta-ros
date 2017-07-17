# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains common nodelet tools such as a mux, demux and throttle."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=f45d14fd8e7ee822ce6fdd3fcfb82000"

DEPENDS = "boost catkin dynamic_reconfigure message_filters nodelet pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_topic_tools/1.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a9e6dccfb667141d89781279f38f6c5"
SRC_URI[sha256sum] = "546201af50963ad6357dda9c85bfb589a685b177b05e77754eef2e939ab3ab5e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
