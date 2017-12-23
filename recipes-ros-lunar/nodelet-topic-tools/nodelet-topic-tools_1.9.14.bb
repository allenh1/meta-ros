# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains common nodelet tools such as a mux, demux and throttle."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native catkin dynamic-reconfigure message-filters nodelet pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_topic_tools/1.9.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2bcc994b31f711b814a1b50f4826598"
SRC_URI[sha256sum] = "5e02350539d91bccd5cdcf8c9d14a2e7e73eeb75246f75bc13c74aefe27c2b97"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet_topic_tools-1.9.14-0"

inherit catkin
