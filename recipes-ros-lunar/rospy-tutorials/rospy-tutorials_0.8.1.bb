# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS python API step-by-step,     i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime rospy rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/rospy_tutorials/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1e8f4ef7e3644fe3ec8d90058ca01b2"
SRC_URI[sha256sum] = "2da4db1ef54e7df2d352cd6d797fa1228beb860b64bb1745b4acff37a8d18c11"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-rospy_tutorials-0.8.1-0"

inherit catkin
