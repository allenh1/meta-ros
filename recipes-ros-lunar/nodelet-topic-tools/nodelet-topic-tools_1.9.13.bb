# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains common nodelet tools such as a mux, demux and throttle."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native dynamic-reconfigure message-filters nodelet pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_topic_tools/1.9.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6dced5671b12957d6723a00df2c48f1b"
SRC_URI[sha256sum] = "671c58034e5e40b062ae4e8b94e7c883ef3f8b7414a80573a18f124e68ec2166"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet_topic_tools-1.9.13-0"

inherit catkin
