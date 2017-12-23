# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package pulls in the Karto mapping library, and provides a ROS      wrapper"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake-modules eigen message-filters nav-msgs open-karto rosconsole roscpp sensor-msgs sparse-bundle-adjustment tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/slam_karto-release/archive/release/kinetic/slam_karto/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "676179567b0d4ef0acc2aaeac32811ee"
SRC_URI[sha256sum] = "d08092e30515f9e20a14e1fdc9827ea479fa8b29c7dd1b25750db95cd0889348"
S = "${WORKDIR}/slam_karto-release-release-kinetic-slam_karto-0.7.3-0"

inherit catkin
