# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains common nodelet tools such as a mux, demux and throttle."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native dynamic-reconfigure message-filters nodelet pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/kinetic/nodelet_topic_tools/1.9.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7c041b24ab42b53b2dab1ee7e1fe2e9b"
SRC_URI[sha256sum] = "443517946f7ad2ee23784f83329b2fb60f4203f8306d99b1caa64b44241af1a3"
S = "${WORKDIR}/nodelet_core-release-release-kinetic-nodelet_topic_tools-1.9.14-0"

inherit catkin
