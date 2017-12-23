# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS python API step-by-step,     i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime rospy rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/kinetic/rospy_tutorials/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a90d14f6ae898e8325f1b8343170178e"
SRC_URI[sha256sum] = "3275210916f09b9291ea3cf694770165eda8c63ca2a44b8e4c28ffde9417cd62"
S = "${WORKDIR}/ros_tutorials-release-release-kinetic-rospy_tutorials-0.7.1-0"

inherit catkin
