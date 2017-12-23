# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ros_wild package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy"
SRC_URI = "https://github.com/yuma-m/ros_wild-release/archive/release/kinetic/ros_wild/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8447c896201c469078878af36bbbdfc"
SRC_URI[sha256sum] = "ea43f367a00c522865e27057ba95a348b032185da70b24d2da57e2c8b24d2d48"
S = "${WORKDIR}/ros_wild-release-release-kinetic-ros_wild-0.5.0-0"

inherit catkin
