# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a set of messages and services for using thormang3_manipulation_"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime roscpp rospy sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-msgs-release/archive/release/kinetic/thormang3_manipulation_module_msgs/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "420cc1f851b2b1924e11ee13e1f49868"
SRC_URI[sha256sum] = "6260d24470a531803cd0f282e726374b11b8bf64f45e5b5f356ba45597028a2e"
S = "${WORKDIR}/ROBOTIS-THORMANG-msgs-release-release-kinetic-thormang3_manipulation_module_msgs-0.2.2-0"

inherit catkin
